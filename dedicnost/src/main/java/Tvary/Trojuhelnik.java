package Tvary;

public class Trojuhelnik implements Tvar {

    protected final Double a;
    protected final Double b;
    protected final Double c;

    public Trojuhelnik(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Double surface() {
        Double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public Double circumference() {
        return a + b + c;
    }

    public Double height() {
        Double cosB = ((a * a) - (b * b) + (c * c)) / (2 * c * a);
        return a * Math.sqrt(1 - cosB * cosB);
    }

    public Double a() {
        return a;
    }

    public Double b() {
        return b;
    }

    public Double c() {
        return c;
    }
}

