package Tvary;

public class Kruh implements Tvar {
    private final Double radius;

    public Kruh(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double surface() {
        return Math.PI * radius * radius;
    }

    @Override
    public Double circumference() {
        return 2 * Math.PI * radius;
    }

    public Double radius() {
        return radius;
    }

    public Double diameter() {
        return radius * 2;
    }
}

