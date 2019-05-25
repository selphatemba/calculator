import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void init(){
        calculator=new Calculator();
    }


    @Test
    public void add() {
        double result=calculator.add(1.5,4);
                assertEquals(5,result,0.1);


    }

    @Test
    public void subtract() {
    }
}