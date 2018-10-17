public final class ButtonFactory {
    private static volatile ButtonFactory instance;

    private ButtonFactory() {}

    public static ButtonFactory getInstance() {
        if (instance == null) {
            synchronized(ButtonFactory.class) {
                if (instance == null) {
                    instance = new ButtonFactory();
                }
            } 
        }
        return instance;
    }

    public OSXButton getOSXButton() {
        return new OSXButton();
    }

    public WindowsButton getWindowsButton() {
        return new WindowsButton();
    }

    public DebianButton getDebianButton() {
        return new DebianButton();
    }
}