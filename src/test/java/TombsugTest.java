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
        this.tombsug.calcRadius();
    }
}
