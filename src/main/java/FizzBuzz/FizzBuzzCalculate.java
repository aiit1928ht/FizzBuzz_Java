package FizzBuzz;

public class FizzBuzzCalculate {
    public String calc(int num) {
        String words;
        words = (num % 3 == 0) ? "Fizz" : "";
        words += (num % 5 == 0) ? "Buzz" : "";
        words = (words.length() == 0) ? Integer.toString(num) : words;
        return(words);
    }
}