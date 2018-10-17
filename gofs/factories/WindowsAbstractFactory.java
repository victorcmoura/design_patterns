public final class WindowsAbstractFactory {
    private static volatile WindowsAbstractFactory instance;
    
    private ButtonFactory buttonFactory = ButtonFactory.getInstance();
    private AlertFactory alertFactory = AlertFactory.getInstance();

    private WindowsAbstractFactory() {}

    public static WindowsAbstractFactory getInstance() {
        if (instance == null) {
            synchronized(WindowsAbstractFactory.class) {
                if (instance == null) {
                    instance = new WindowsAbstractFactory();
                }
            }
        }
        return instance;
    }

    public WindowsButton getButton() {
        return buttonFactory.getWindowsButton();
    }

    public WindowsAlert getAlert() {
        return alertFactory.getWindowsAlert();
    }
}