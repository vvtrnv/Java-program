package Models;

import Abstract.Transport;
import frame.MyFrame;

import javax.swing.*;
import java.awt.*;

public class Bike extends Transport
{
    @Override
    public void show(MyFrame myFrame)
    {
        var g = myFrame.getGraphics();
        Graphics2D g2 = (Graphics2D)g; // Приводим к более современному виду

        Image img = new ImageIcon("src/resourse/bike.png").getImage();
        g2.drawImage(img, 100, 100, null);
    }
}