import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    Calc calc=new Calc();
    @Test
    public void testAdd(){

        int m=10,n=6;
        int res=calc.add(m,n);
         assertEquals(15,res);

   }
   @Test
   public void myNameTest(){
        String nm=calc.myName("Hello");
        assertEquals("Hello",nm);
   }
}
