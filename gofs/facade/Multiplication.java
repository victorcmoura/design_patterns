public class Multiplication {
    private Addition additionObject;

    public Multiplication() {
        this.additionObject = new Addition();
    }

    public Integer multiply(Integer a, Integer b) {
        Integer result = 0;
        Integer i;

        for(i = 0; i < b; i++){
            result = result + a;
        }

        return result;

    }
}