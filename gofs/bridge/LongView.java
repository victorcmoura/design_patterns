public class LongView extends AbstractView {
    public LongView(ResourceInterface resource) {
        this.resource = resource;
    }

    public void renderView() {
        System.out.println("Looooooooong");
        System.out.println("Vieeeeeeeeeeeew");
        System.out.println("Title: " + this.resource.title());
        System.out.println("Snippet: " + this.resource.snippet());
        System.out.println("Link: " + this.resource.url());
        System.out.println("");
    }
}