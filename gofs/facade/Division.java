public class Division {
    
    private Subtraction subtractionObject;

    public Division() {
        this.subtractionObject = new Subtraction();
    }

    public Integer divide(Integer a, Integer b) {
        Integer counter = 0;

        while(a >= b) {
            a = this.subtractionObject.subtract(a, b);
            counter++;
        }
        return counter;
    }
}