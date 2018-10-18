import java.util.ArrayList;

public class PrinterAdapter implements PrinterInterface {
    protected LegacyPrinter legacyPrinter;
    
    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    public void print(ArrayList<String> listOfWords) {
        Integer listSize = listOfWords.size();
        legacyPrinter.print(listOfWords, listSize);
    }
}