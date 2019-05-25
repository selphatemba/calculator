import org.junit.*;

import static org.junit.Assert.fail;

public class TestSimple {

    @Before
    public void init(){
        System.out.println("Testing started");
    }
    @Test
    public void failTest(){
       // fail("FAIL-test not implemented");
        Assert.assertTrue("false",true);
    }

    @After
    public void tearDown(){
        System.out.println("Testing completed");
    }

}
