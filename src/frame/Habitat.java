package frame;

import Models.Bike;
import Models.Car;
import Models.IBehaviour;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Habitat extends JFrame {
    public final static int SIZE = 800;

    public Habitat()
    {
        // Заголовок окна
        super("Lab");

        // Операция при закрытии экрана
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Задаём размеры и видимость
        Toolkit tlkt = Toolkit.getDefaultToolkit();
        Dimension dimension = tlkt.getScreenSize();
        int width = dimension.width / 2 - 350;
        int height = dimension.height / 2 - 350;
        setBounds(width, height, SIZE, SIZE);
        setVisible(true);

        Random rnd = new Random();
        IBehaviour[] transports = new IBehaviour[10];

        for(int i=0; i<10;i++)
        {
            int a = rnd.nextInt(2);
            if(a == 0)
            {
                transports[i] = new Car();
            }
            if(a == 1)
            {
                transports[i] = new Bike();
            }
        }

        for(int i=0; i<10;i++)
        {
            transports[i].show(this);
        }
    }
}