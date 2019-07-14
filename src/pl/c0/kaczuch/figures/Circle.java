package pl.c0.kaczuch.figures;


public class Circle implements Figure
{
    private double r;

    public Circle(double r)
    {
        this.r = r;
    }

    public double get_r()
    {
        return r;
    }

    public void set_r(double r)
    {
        this.r = r;
    }

    @Override
    public double get_field()
    {
        return Math.PI * this.r * this.r;
    }
}
