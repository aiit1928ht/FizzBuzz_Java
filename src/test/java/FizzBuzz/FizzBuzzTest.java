package FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    @Test
    void 引数が3の場合は返り値がFizzである() {
        String expected = "Fizz";
        FizzBuzzCalculate fizzBuzz = new FizzBuzzCalculate();
        assertEquals(expected, fizzBuzz.calc(3));
    }

    @Test
    void 引数が5の場合は返り値がBuzzである() {
        String expected = "Buzz";
        FizzBuzzCalculate fizzBuzz = new FizzBuzzCalculate();
        assertEquals(expected, fizzBuzz.calc(5));
    }

    @Test
    void 引数が3で割り切れる場合は返り値がFizzである() {
        String expected = "Fizz";
        FizzBuzzCalculate fizzBuzz = new FizzBuzzCalculate();
        assertEquals(expected, fizzBuzz.calc(51));
    }

    @Test
    void 引数が5で割り切れる場合は返り値がBuzzである() {
        String expected = "Buzz";
        FizzBuzzCalculate fizzBuzz = new FizzBuzzCalculate();
        assertEquals(expected, fizzBuzz.calc(75));
    }

    @Test
    void 引数が3でも5でも割り切れる場合は返り値がFizzBuzzである() {
        String expected = "FizzBuzz";
        FizzBuzzCalculate fizzBuzz = new FizzBuzzCalculate();
        assertEquals(expected, fizzBuzz.calc(45));
    }

    @Test
    void 引数が3でも5でも割り切れない場合は返り値が引数と等しい() {
        String expected = "1";
        FizzBuzzCalculate fizzBuzz = new FizzBuzzCalculate();
        assertEquals(expected, fizzBuzz.calc(1));
    }
}