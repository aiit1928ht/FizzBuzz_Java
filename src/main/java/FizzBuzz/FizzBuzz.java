package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzzCalculate fizzBuzz = new FizzBuzzCalculate();
        int i = 1;
        while (i <= 100) {
            System.out.println(fizzBuzz.calc(i));
            i++;
        }
    }
}