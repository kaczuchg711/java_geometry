package pl.c0.kaczuch.figures;

public class Rectangle extends Squere
{
    private double b;

    public Rectangle(double x, double y, double a, double b)
    {
        super(x, y, a);
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
        return get_a() * get_b();
    }

    @Override
    public String toString()
    {
        return "Rectangle\n{" +
                "\n\tp=" + get_p() +
                "\n\ta=" + get_a() +
                "\n\tb=" + this.b +
                "\n}";
    }

    public static void main(String[] args)
    {
        Rectangle s = new Rectangle(1,2,3,2);

        System.out.println(s);
    }
}
