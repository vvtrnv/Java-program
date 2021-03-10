package Abstract;

import Models.IBehaviour;

public abstract class Transport implements IBehaviour
{
    //Интервал генерации обьекта.
    public int generationInterval;

    //Вероятность.
    public int probability;
}