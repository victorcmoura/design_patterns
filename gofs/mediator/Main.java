public class Main {
    public static void main(String[] args) {
        AppMsgMediator mediator1 = new AppMsgMediator();

        WppAppMsg wpp1 = new WppAppMsg(mediator1, "WP0001");
        TgAppMsg tg1 = new TgAppMsg(mediator1, "TG0001");

        mediator1.addAppMsg(wpp1);
        mediator1.addAppMsg(tg1);

        wpp1.sendMessage("Sent from WhatsApp");

        System.out.println("================");

        AppMsgMediator mediator2 = new AppMsgMediator();

        WppAppMsg wpp2 = new WppAppMsg(mediator2, "WP0002");
        TgAppMsg tg2 = new TgAppMsg(mediator2, "TG0002");

        mediator2.addAppMsg(wpp2);
        mediator2.addAppMsg(tg2);

        tg2.sendMessage("Sent from Telegram");
    }
} 