public class ShortView extends AbstractView {
    public ShortView(ResourceInterface resource) {
        this.resource = resource;
    }

    public void renderView() {
        System.out.println(
            "Prnt Shrt Vw: " + 
            this.resource.title() + ", " +
            this.resource.snippet() + ", " +
            this.resource.url()
        );
    }
}