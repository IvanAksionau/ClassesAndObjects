import org.junit.Before;
import org.junit.Test;
import solution1.Ball;
import solution1.Basket;
import solution1.Color;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ivan_Aksionau on 9/22/2016.
 */
public class BasketTest {
    ArrayList<Ball> balls;

    @Before
    public void setUp() {
        balls = new ArrayList<>();
        balls.add(new Ball(4.2, Color.BLACK));
        balls.add(new Ball(1.2, Color.BLUE));
        balls.add(new Ball(1.02, Color.GREEN));
        balls.add(new Ball(3, Color.BLUE));
    }

    @Test
    public void getTotalWeight() throws Exception {

        Basket basket = new Basket(balls);
        assertEquals(9.42, basket.getTotalWeight(), 0.01);
    }

    @Test
    public void getCountColor() throws Exception {
        Basket basket = new Basket(balls);
        assertEquals(2, basket.getCountColor(Color.BLUE), 0.01);
    }

}