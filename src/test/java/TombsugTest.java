import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.monitor.Tombsug;

public class TombsugTest {

    Tombsug tombsug;
    @BeforeTest
    public void setUp(){
        this.tombsug = new Tombsug();
    }
    @Test
    public void testCalcRadius_30_50(){
        double actual = this.tombsug.calcRadius(30,35);
        double expected = 8.6;
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test
    public void testCalcRadius_100_130(){
        double actual = this.tombsug.calcRadius(100,130);
        double expected = 38.3;
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcRadius_Zero_Side(){
        this.tombsug.calcRadius(0, 0);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcRadius_Zero_Angle(){
        this.tombsug.calcRadius(0, 0);
    }
    @Test
    public void tesztTeszt(){
        //System.out.println("teszt");
        int a = 2, b = 3;
        int res = a+b;
        int exp = 5;
        Assert.assertEquals(res, exp);
    }
    @Test
    public void tesztTeszt2(){
        int szam = 2;
        Double szam2 = new Double(""+szam);
        Integer szam3 = 2;
        //if (szam2 instanceof Integer) {
        //    System.out.println("Ez egy szam");
        //}
        Assert.assertEquals(szam2, szam3*1.0);
    }
    @Test
    public void tesztTeszt4(){
        Integer szam1 = 2;
        Integer szam2 = new Integer(2);
        String szoveg1 = "1";
        String szoveg2 = "2";

        if (szam1 instanceof Integer) {
            szoveg1 = "Integer";
        }

        if (szam2 instanceof Integer) {
            szoveg2 = "Integer";
        }
        Assert.assertEquals(szoveg1, szoveg2);
    }
}
