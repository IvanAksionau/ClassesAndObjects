import org.junit.Assert;
import org.junit.Test;
import solution1.Ball;
import solution1.Color;

/**
 * Created by Ivan_Aksionau on 9/22/2016.
 */
public class BallTest {
    @Test
    public void tstConstructor() throws Exception {
        Ball ball = new Ball(17.2, Color.BLACK);
        Assert.assertTrue(17.2 == ball.getWeight());
        Assert.assertTrue(Color.BLACK == ball.getColor());
    }
}