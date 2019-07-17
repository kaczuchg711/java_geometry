package pl.c0.kaczuch.figures;

public class Squere implements Figure
{
    private Point p;
    private double a;


    public Squere()
    {
    }

    public Squere(double x,double y, double a)
    {
        this.a = a;
        this.p = new Point(x,y);
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

    public Point get_p()
    {
        return p;
    }

    @Override
    public String toString()
    {
            return "Squere\n{" +
                "\np=" + this.get_p() +
                "\na=" + this.get_a() +
                "\n}";
    }

    public static void main(String[] args)
    {
        Squere s = new Squere(1,2,3);

        System.out.println(s);
    }


}
