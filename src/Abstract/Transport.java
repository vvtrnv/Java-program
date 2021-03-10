package Abstract;

import Models.IBehaviour;
import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public abstract class Transport implements IBehaviour
{
    //Интервал генерации обьекта.
    public static int generationInterval;

    //Вероятность.
    public static int probability;

    //Путь к картинке обьекта.
    public static Image picture;

    public final int SIZEIMAGE = 32;

    public static void setStaticProperties(int generationIntervall, int probabilityy, String pathPicturee)
    {
        //Any code
    }
}