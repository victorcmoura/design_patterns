public abstract class AbstractView {
    protected ResourceInterface resource;

    public void renderView() {}

    public void setResource(ResourceInterface resource) {
        this.resource = resource;
    }
}