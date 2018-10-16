public final class Log {
    private static volatile Log logInstance;

    private Log() {}

    public static Log getInstance() {
        if (logInstance == null){
            synchronized (Log.class) {
                if (logInstance == null) {
                    logInstance = new Log();
                    System.out.println("A log object was instantiated");
                }
            }
        }
        return logInstance;
    }

    public void warn(String message) {
        System.out.print("LOG: ");
        System.out.println(message);
    }
}