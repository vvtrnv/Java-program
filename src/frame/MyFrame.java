package frame;

import Abstract.Transport;
import Models.Bike;
import Models.Car;
import Models.IBehaviour;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyFrame extends JFrame {
    int width;
    int height;

    public MyFrame()
    {
        // Заголовок окна
        super("Lab");

        //Transport.setStaticProperties(10,10,"scr/resorse");
        // Операция при закрытии экрана
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Задаём размеры и видимость
        Toolkit tlkt = Toolkit.getDefaultToolkit();
        Dimension dimension = tlkt.getScreenSize();
        this.width = dimension.width / 2 - 350;
        this.height = dimension.height / 2 - 350;
        setBounds(width, height, 800, 800);
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