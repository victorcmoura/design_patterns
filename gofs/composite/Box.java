import java.util.ArrayList;

public class Box extends Product {
    private ArrayList<Product> productsList;

    public Box() {
        productsList = new ArrayList<Product>();
        price = 0.0;
    }
    
    public void insertProduct(Product p) {
        this.productsList.add(p);
    }

    public Double getPrice() {
        Double total = 0.0;

        for (Product p : productsList) {
            total = total + p.price;
        }

        return total;
    }
}