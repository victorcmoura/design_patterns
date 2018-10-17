public final class AlertFactory {
    private static volatile AlertFactory instance;
    
    private AlertFactory() {}

    public static AlertFactory getInstance() {
        if (instance == null) {
            synchronized(AlertFactory.class) {
                if (instance == null) {
                    instance = new AlertFactory();
                }
            } 
        }
        return instance;
    }

    public OSXAlert getOSXAlert() {
        return new OSXAlert();
    }

    public WindowsAlert getWindowsAlert() {
        return new WindowsAlert();
    }

    public DebianAlert getDebianAlert() {
        return new DebianAlert();
    }
}