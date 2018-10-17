public abstract class OperationalSystem {
    protected Button button;
    protected Alert alert;

    public OperationalSystem(Button button, Alert alert) {
        this.button = button;
        this.alert = alert;
    }

    public void pressButton() {
        this.button.press();
    }

    public void showAlert() {
        this.alert.show();
    }
}