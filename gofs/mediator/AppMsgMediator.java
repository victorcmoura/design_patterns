import java.util.ArrayList;

public class AppMsgMediator implements Mediator {
 
    protected ArrayList<AppMsg> destinations;
 
    public AppMsgMediator() {
        destinations = new ArrayList<AppMsg>();
    }
 
    public void addAppMsg(AppMsg appMsg) {
        destinations.add(appMsg);
    }
 
    @Override
    public void send(String msg, AppMsg appMsg) {
        for (AppMsg destinationAppMsg : destinations) {
            if (appMsg != destinationAppMsg) {
                String formattedMsg = setPrefix(destinationAppMsg, msg);
                destinationAppMsg.receiveMessage(formattedMsg);
            }
        }
    }
 
    private String setPrefix(AppMsg appMsg, String msg) {
        String formattedMsg = "";
        if (appMsg instanceof WppAppMsg) {
            formattedMsg = "(Message for WhatsApp) " + msg;
        } else if (appMsg instanceof TgAppMsg) {
            formattedMsg = "(Message for Telegram) " + msg;
        }
        return formattedMsg;
    }
}