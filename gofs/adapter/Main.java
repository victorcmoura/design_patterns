import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PrinterAdapter printer = new PrinterAdapter( new LegacyPrinter() );

        ArrayList<String> listOfStrings = new ArrayList<String>();

        listOfStrings.add("This");
        listOfStrings.add("is");
        listOfStrings.add("a");
        listOfStrings.add("test");

        printer.print(listOfStrings);

    }
}