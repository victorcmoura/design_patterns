public class BookInterface implements ResourceInterface {
    private String description;
    private String title;
    private String amazonUrl;

    public BookInterface(String title, String description, String amazonUrl) {
        this.description = description;
        this.title = title;
        this.amazonUrl = amazonUrl;
    }

    public String snippet() {
        return this.description;
    }

    public String title() {
        return this.title;
    }

    public String url() {
        return this.amazonUrl;
    }
}