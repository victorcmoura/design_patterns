public class Duck {
    private String name;
    private QuackingStrategy quackingStrategy;
    private Integer numberOfQuacks;

    public Duck(String name) {
        this.name = name;
        this.quackingStrategy = new LongQuacking();
        this.numberOfQuacks = 0;
    }

    public void quack() {
        if (numberOfQuacks >= 2) {
            System.out.println("Im tired of long quacking, from now on I am simple quacking...");
            this.quackingStrategy = new SimpleQuacking();
        }
        
        System.out.print("Listen to my quack: ");
        this.quackingStrategy.quack();
        this.numberOfQuacks++;
    }
}