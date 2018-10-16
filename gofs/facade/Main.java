public class Main {
    public static void main(String[] args) {
        CalculatorFacade calculator = new CalculatorFacade(new Addition(), new Subtraction(), new Multiplication(), new Division());

        System.out.print("1 + 1 = ");
        System.out.println(calculator.add(1, 1));

        System.out.print("1 - 1 = ");
        System.out.println(calculator.subtract(1, 1));

        System.out.print("2 * 2 = ");
        System.out.println(calculator.multiply(2, 2));

        System.out.print("4 / 2 = ");
        System.out.println(calculator.divide(4, 2));
    }
}