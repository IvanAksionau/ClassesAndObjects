package solution1;

import java.util.ArrayList;

/**
 * Created by Ivan_Aksionau on 9/21/2016.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(1.2, Color.BLUE));
        balls.add(new Ball(6.3, Color.BLACK));
        balls.add(new Ball(4.2, Color.WHITE));
        balls.add(new Ball(1.2, Color.YELLOW));
        balls.add(new Ball(1.02, Color.BLUE));
        balls.add(new Ball(1.2, Color.BLACK));
        balls.add(new Ball(1.92, Color.RED));

        Basket basket = new Basket(balls);

        System.out.println("Вес мячиков в корзине: " + basket.getTotalWeight());
        System.out.println("Количество синих мячиков в корзине: " + basket.getCountColor(Color.BLUE));

    }
}
