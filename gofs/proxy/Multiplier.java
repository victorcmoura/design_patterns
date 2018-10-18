import java.util.concurrent.TimeUnit;

public class Multiplier implements MultiplierInterface {
    public Multiplier() {}

    public Integer multiply(Integer a, Integer b) {
        try {
            Thread.sleep(3000);
        } 
        catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return a * b;
    }
}