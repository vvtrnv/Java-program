package Models;

import Abstract.Transport;
import frame.MyFrame;

public class Bike extends Transport
{
    public Bike(int generationInterval, int probability)
    {
        this.generationInterval = generationInterval;
        this.probability = probability;
    }

    @Override
    public void Create()
    {

    }

    @Override
    public void Show(MyFrame myFrame)
    {

    }
}