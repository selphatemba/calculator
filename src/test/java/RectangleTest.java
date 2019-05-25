import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {
 private Rectangle rectangle;
    @Before
    public void setUp() throws Exception {
        rectangle=new Rectangle();
    }

    @Test
    public void calculateArea() {
        double area=rectangle.calculateArea(4,2);
        assertEquals("",area,8,0.1);

    }

    @Test
    public void calculateWidth() {
    }
    @After
    public void tearDown() throws Exception {
    }


}