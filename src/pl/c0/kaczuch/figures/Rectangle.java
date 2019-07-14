package pl.c0.kaczuch.figures;

public class Rectangle extends Squere
{
    private double b;

    public Rectangle(double a,double b)
    {
        super(a);
        this.b = b;
    }

    public double get_b()
    {
        return b;
    }

    public void set_b(double b)
    {
        this.b = b;
    }

    @Override
    public double get_field()
    {
        return get_a()*get_b();
    }
}
