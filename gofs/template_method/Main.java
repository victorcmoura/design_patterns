public class Main {
    public static void main(String[] args) {
        System.out.println("Creating and saving user: ");
        
        User myUser = new User("victorcmoura");
        myUser.save();

        System.out.println("========================");

        System.out.println("Creating and saving book: ");
        
        Book myBook = new Book("Design Patterns");
        myBook.save();
    }
}