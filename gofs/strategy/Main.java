public class Main {
    public static void main(String[] args) {
        // Instantiate quacking strategies
        LongQuacking longQuack = new LongQuacking();
        SimpleQuacking simpleQuack = new SimpleQuacking();

        Duck simpleQuacker = new Duck("Duck 1", simpleQuack);
        Duck longQuacker = new Duck("Duck 2", longQuack);

        System.out.println("Simple Quacker:");
        simpleQuacker.quack();

        System.out.println("Long Quacker:");
        longQuacker.quack();
    }
} 