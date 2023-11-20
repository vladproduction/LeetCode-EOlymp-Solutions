import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    static final String FIZZ = "FIZZ";
    static final String BUZZ = "BUZZ";
    static final String FIZZBUZZ = "FIZZBUZZ";

    //          кратно трем
    @Test
    public void multipleByThree(){
        byte[] expected = FIZZ.getBytes();
        byte[] actual = fizzBuzz.fizzbuzz(3);
        assertArrayEquals(expected,actual);
    }
    //          кратно пяти
    @Test
    public void multipleByFive(){
        assertArrayEquals(BUZZ.getBytes(),fizzBuzz.fizzbuzz(5));
    }

    //          кратно трем и пяти
    @Test
    public void multipleByFiveAndThree(){
        assertArrayEquals(FIZZBUZZ.getBytes(),fizzBuzz.fizzbuzz(15));
    }


    @Test(expected = IllegalArgumentException.class)
    public void noMultipleByFiveAndThree(){
        fizzBuzz.fizzbuzz(19);
    }
}
