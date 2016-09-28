package solution1;

import java.util.ArrayList;

/**
 * Created by Ivan_Aksionau on 9/21/2016.
 */
public class Basket {
    ArrayList<Ball> allBalls;

    public Basket(ArrayList<Ball> allBalls) {
        if (allBalls == null) {
            throw new IllegalArgumentException("Ball is null");
        } else {
            this.allBalls = allBalls;
        }
    }

    public double getTotalWeight() {
        double weight = 0;
        for (Ball ball : allBalls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getCountColor(Color color) {
        int cuntColor = 0;
        for (Ball ball : allBalls) {
            if (ball.getColor().equals(color)) {
                cuntColor++;
            }
        }
        return cuntColor;
    }

}
