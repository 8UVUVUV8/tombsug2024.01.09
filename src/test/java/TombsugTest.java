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
}
