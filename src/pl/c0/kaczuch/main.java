package pl.c0.kaczuch;

import pl.c0.kaczuch.GUI.GUI;
import pl.c0.kaczuch.figures.*;
import pl.c0.kaczuch.figures.Rectangle;

import javax.swing.*;
import java.awt.*;

public class main
{
    public static void main(String[] args)
    {
        Figure[] ft = new Figure[3];
        ft[0] = new Squere(0, 0, 5);
        ft[1] = new Rectangle(0, 0, 10, 2);
        ft[2] = new Circle(0, 0, 3);

        GUI g = new GUI();
        g.start();



    }
}



