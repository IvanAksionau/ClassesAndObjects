
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import solution1.Ball;
import solution1.Color;

/**
 * Created by Ivan_Aksionau on 9/22/2016.
 */
public class BallTest {

    @DataProvider(name = "provider")
    public Object[][] someDataProvider() {
        return new Object[][]{
                {new Ball(), new Ball()},
                {new Ball(), new Ball()},
                {new Ball(), new Ball()},
        };
    }


    @Test(dataProvider = "someDataProvider")
    public void testWithProvider(Ball a, Ball b) {

        Assert.assertFalse(b.equals(a));
    }


    @Test(enabled = false)
    public void tstConstructor() throws Exception {
        Ball ball = new Ball(17.2, Color.BLACK);
        Assert.assertTrue(17.2 == ball.getWeight());
        Assert.assertTrue(Color.BLACK == ball.getColor());
    }
}