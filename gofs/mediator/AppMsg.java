public abstract class AppMsg {
    protected Mediator mediator;
    
    // If id references a Telegram chat: "TG<realId>"; 
    // If id references a WhatsApp chat: "WP<realId>";
    protected String thisPlatformChatId;
    
    public AppMsg(Mediator m, String thisChatId) {
        mediator = m;
        thisPlatformChatId = thisChatId;
    }
 
    public void sendMessage(String msg) {
        mediator.send(msg, this);
    }

    public String getThisPlatformChatId() {
        return this.thisPlatformChatId;
    }

    public abstract void receiveMessage(String msg);
}