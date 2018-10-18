import java.util.ArrayList;

public class LegacyPrinter {
    public LegacyPrinter() {

    }

    public void print(ArrayList<String> listOfWords, Integer numberOfWordsToPrint) {
        Integer x;

        for( x=0; x<numberOfWordsToPrint; x++ ) {
            System.out.println(listOfWords.get(x));
        }
    }
}