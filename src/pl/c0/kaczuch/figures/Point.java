package pl.c0.kaczuch.figures;

public class Point
{
    private double x;
    private double y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double get_x()
    {
        return x;
    }

    public double get_y()
    {
        return y;
    }

    public void set_x(double x)
    {
        this.x = x;
    }

    public void set_y(double y)
    {
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;

        if (obj == null) return false;

        if (obj.getClass() != this.getClass()) return false;

        Point o = (Point) obj;

        return this.get_x() == o.get_x() && this.get_y() == this.get_y();

    }
}
