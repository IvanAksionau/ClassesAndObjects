package solution1;

/**
 * Created by Ivan_Aksionau on 9/21/2016.
 */
public class Ball {
    private double weight;
    private Color color;

    public Ball() {
    }

    public Ball(double weight, Color color) {
        if(!(weight < 0)) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight can not be null!");
        }
        if(!(color == null)) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Color can not be null!");
        }
    }

    public double getWeight() {
        return weight;
    }

    public Color getColor() {
        return color;
    }
}
