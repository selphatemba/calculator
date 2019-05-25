import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedWithConstructor {
    private double a;
    private double b;
    private Calculator calculator=new Calculator();

    public ParameterizedWithConstructor(double a,double b){
        this.a=a;
        this.b=b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> initialize(){
        Object [][]data=new Object[][]{{1,2},{5,3},{5,3},{121,4}};
        return Arrays.asList(data);
    }
    @Test
    public void testMultiplication(){
        Assert.assertEquals(a+"*"+b,a*b,calculator.multiply(a,b),0.0);
    }

}
