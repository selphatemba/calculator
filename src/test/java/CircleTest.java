import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private Circle circle;

    @Before
    public void setUp() throws Exception {
        circle = new Circle();
    }

    @Test
    public void calculateArea() {
       double area= circle.calculateArea(5);
        assertEquals("Enter a value greater than 1 ",area,78.5,0.1);
    }

    @Test
    public void calculateParameter() {
        double parameter=circle.calculateParameter(5);
        assertEquals("Enter an integer",parameter,31.4,0.1);



    }

    @After
    public void tearDown() throws Exception {

    }
}

