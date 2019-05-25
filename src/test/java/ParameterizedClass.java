import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedClass {
    @Parameterized.Parameter(0)
    public static double a;
    @Parameterized.Parameter(1)
    public static double b;
    @Parameterized.Parameter(2)
    public static double result;
    private Calculator calculator;

    @Before
    public void setUp(){
        calculator=new Calculator();

    }

    @Parameterized.Parameters
    public static Collection<Object[]> initialize(){
        a=Math.random();
        b=Math.random();
        result=a+b;
        Object [][]data=new Object[][]{{a,b,result},{a,b,result},{a,b,result}};
        return Arrays.asList(data);
    }

     /*   Object [][]data=new Object[][]{{1,2,2},{5,3,15},{121,4,484}};
        return Arrays.asList(data);
    }*/
   @Test
    public void testAddition(){
        Assert.assertEquals(a+"+"+b,result,calculator.add(a,b),0.0);
    }

}
