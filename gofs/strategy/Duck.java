public class Duck {
    private String name;
    private QuackingStrategy quackingStrategy;

    public Duck(String name, QuackingStrategy quackingStrategy) {
        this.name = name;
        this.quackingStrategy = quackingStrategy;
    }

    public void quack() {
        System.out.print("Listen to my quack: ");
        this.quackingStrategy.quack();
    }
}