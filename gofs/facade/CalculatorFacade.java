public class CalculatorFacade {

    Addition additionObject;
    Subtraction subtractionObject;
    Multiplication multiplicationObject;
    Division divisionObject;

    public CalculatorFacade(){
        this.additionObject = new Addition();
        this.subtractionObject = new Subtraction();
        this.multiplicationObject = new Multiplication();
        this.divisionObject = new Division();
    }

    public Integer add(Integer a, Integer b) {
        return this.additionObject.add(a, b);
    }

    public Integer subtract(Integer a, Integer b) {
        return this.subtractionObject.subtract(a, b);
    }

    public Integer multiply(Integer a, Integer b) {
        return this.multiplicationObject.multiply(a, b);
    }

    public Integer divide(Integer a, Integer b) {
        return this.divisionObject.divide(a, b);
    }
}