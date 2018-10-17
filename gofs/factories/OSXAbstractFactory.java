public final class OSXAbstractFactory {
    private static volatile OSXAbstractFactory instance;
    
    private ButtonFactory buttonFactory = ButtonFactory.getInstance();
    private AlertFactory alertFactory = AlertFactory.getInstance();

    private OSXAbstractFactory() {}

    public static OSXAbstractFactory getInstance() {
        if (instance == null) {
            synchronized(OSXAbstractFactory.class) {
                if (instance == null) {
                    instance = new OSXAbstractFactory();
                }
            }
        }
        return instance;
    }

    public OSXButton getButton() {
        return buttonFactory.getOSXButton();
    }

    public OSXAlert getAlert() {
        return alertFactory.getOSXAlert();
    }
}