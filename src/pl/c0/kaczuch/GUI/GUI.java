package pl.c0.kaczuch.GUI;

import javax.swing.*;
import java.awt.*;

public class GUI
{
    private int screenWidth;
    private int screenHeight;



    public GUI()
    {
    /**
     *   geting scr size
     */
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        this.screenWidth = screenSize.width;
        this.screenHeight = screenSize.height;
    }

    public void start()
    {
        EventQueue.invokeLater(() ->
        {
            SimpleFrame frame = new SimpleFrame(this.screenWidth,this.screenHeight);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class SimpleFrame extends JFrame
{
    public SimpleFrame(int DEFAULT_WIDTH,int DEFAULT_HEIGHT)
    {
        setSize(DEFAULT_WIDTH/2, DEFAULT_HEIGHT/2);
    }
}
