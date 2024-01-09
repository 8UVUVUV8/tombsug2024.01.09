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
}
