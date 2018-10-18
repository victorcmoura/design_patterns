public class Book extends ActiveRecord {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    protected void beforeSave() {
        System.out.println("Before saving the book");
    }
}