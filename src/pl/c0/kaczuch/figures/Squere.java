package pl.c0.kaczuch.figures;

public class Squere implements Figure
{
    private double a;

    public Squere(double a)
    {
        this.a = a;
    }

    public double get_a()
    {
        return a;
    }

    public void set_a(double a)
    {
        this.a = a;
    }

    @Override
    public double get_field()
    {
        return get_a()* get_a();
    }
}
