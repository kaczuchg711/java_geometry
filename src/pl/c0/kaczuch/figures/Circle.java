package pl.c0.kaczuch.figures;


public class Circle implements Figure
{
    private double r;
    private Point p;

    public Circle(double x ,double y , double r)
    {
        this.r = r;
        this.p = new Point(x,y);
    }

    public double get_r()
    {
        return r;
    }

    public void set_r(double r)
    {
        this.r = r;
    }

    public Point get_p()
    {
        return p;
    }

    @Override
    public double get_field()
    {
        return Math.PI * this.r * this.r;
    }

    @Override
    public String toString()
    {
        return "Circle\n{" +
                "r=" + r +
                ", " + get_p() +
                "}\n";
    }
}
