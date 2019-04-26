import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    Calc calc=new Calc();
    int m=10,n=5;
    @Test
    public void testAdd(){
      int res=calc.add(m,n);
      assertEquals(15,res);

   }
}
