public class TgAppMsg extends AppMsg {
    
    public TgAppMsg(Mediator m, String thisChatId) {
        super(m, thisChatId);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("Telegram <" + thisPlatformChatId + ">: " + msg);
    }
}