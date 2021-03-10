package Models;

import Abstract.Transport;
import frame.Habitat;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Car extends Transport
{
    @Override
    public void show(Habitat habitat)
    {
        var g = habitat.getGraphics();
        Graphics2D g2 = (Graphics2D)g; // Приводим к более современному виду

        Random rnd = new Random();
        Image img = new ImageIcon("src/resourse/car.png").getImage();
        g2.drawImage(img, rnd.nextInt(Habitat.SIZE - SIZEIMAGE), rnd.nextInt(Habitat.SIZE - SIZEIMAGE), null);
    }
}