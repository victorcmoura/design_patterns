public class Main {
    public static void main(String[] args) {
        // My products
        DollProduct doll = new DollProduct(15.00);
        BicycleProduct bike = new BicycleProduct(30.00);
        BallProduct ball = new BallProduct(20.00);
        KiteProduct kite = new KiteProduct(5.00);


        // My box containing all of my products
        Box myBox = new Box();
        myBox.insertProduct(doll);
        myBox.insertProduct(bike);
        myBox.insertProduct(ball);
        myBox.insertProduct(kite);

        // Prints the price of the products inside my box
        System.out.print("Total: ");
        System.out.println(myBox.getPrice());
    }
}