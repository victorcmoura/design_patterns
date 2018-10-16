public class WppAppMsg extends AppMsg {
    
    public WppAppMsg(Mediator m, String thisChatId) {
        super(m, thisChatId);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("WhatsApp <" + thisPlatformChatId + ">: " + msg);
    }
}