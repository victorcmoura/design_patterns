public class Main {
    public static void main(String[] args) {
        MultiplierProxy multiplierProxy = new MultiplierProxy();

        System.out.print("Calculating not cached: 2 * 3 = ");
        System.out.println( multiplierProxy.multiply(2, 3) );

        System.out.print("Calculating not cached: 4 * 5 = ");
        System.out.println( multiplierProxy.multiply(4, 5) );

        System.out.print("Calculating not cached: 10 * 80 = ");
        System.out.println( multiplierProxy.multiply(10, 80) );
        
        System.out.print("Cached: 2 * 3 = ");
        System.out.println( multiplierProxy.multiply(2, 3) );

        System.out.print("Cached: 4 * 5 = ");
        System.out.println( multiplierProxy.multiply(4, 5) );

        System.out.print("Cached: 10 * 80 = ");
        System.out.println( multiplierProxy.multiply(10, 80) );
        
    }
}