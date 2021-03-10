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

    public static void setStaticProperties(int generationIntervall, int probabilityy, String pathPicturee)
    {
        generationInterval = generationIntervall;
        probability = probabilityy;

        try
        {
            picture = ImageIO.read(new File(pathPicturee));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}