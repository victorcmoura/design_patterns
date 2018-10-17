public final class DebianAbstractFactory {
    private static volatile DebianAbstractFactory instance;
    
    private ButtonFactory buttonFactory = ButtonFactory.getInstance();
    private AlertFactory alertFactory = AlertFactory.getInstance();

    private DebianAbstractFactory() {}

    public static DebianAbstractFactory getInstance() {
        if (instance == null) {
            synchronized(DebianAbstractFactory.class) {
                if (instance == null) {
                    instance = new DebianAbstractFactory();
                }
            }
        }
        return instance;
    }

    public DebianButton getButton() {
        return buttonFactory.getDebianButton();
    }

    public DebianAlert getAlert() {
        return alertFactory.getDebianAlert();
    }
}