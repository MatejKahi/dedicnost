package Tvary;

public class Obdelnik implements Tvar {
    protected final Double width;
    protected final Double height;

    public Obdelnik(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double surface() {
        return width * height;
    }

    @Override
    public Double circumference() {
        return 2 * (width + height);
    }
}

