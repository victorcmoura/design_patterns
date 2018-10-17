public class Main {
    public static void main(String[] args) {
        DebianAbstractFactory debianFactory = DebianAbstractFactory.getInstance();
        WindowsAbstractFactory windowsFactory = WindowsAbstractFactory.getInstance();
        OSXAbstractFactory osxFactory = OSXAbstractFactory.getInstance();

        Windows myWindows = new Windows(windowsFactory.getButton(), windowsFactory.getAlert());
        OSX myOSX = new OSX(osxFactory.getButton(), osxFactory.getAlert());
        Debian myDebian = new Debian(debianFactory.getButton(), debianFactory.getAlert());

        myWindows.pressButton();
        myWindows.showAlert();

        System.out.println("======");

        myDebian.pressButton();
        myDebian.showAlert();

        System.out.println("======");

        myOSX.pressButton();
        myOSX.showAlert();
    }
}