public class Main {
    public static void main(String[] args) {
        Log logInstance = Log.getInstance();
        Log sameLogInstance = Log.getInstance();

        logInstance.warn("This is a log from 'logInstance'");
        sameLogInstance.warn("This is a log from 'sameLogInstance'");
    }
}