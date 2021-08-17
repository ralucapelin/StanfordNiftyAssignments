import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Main {

    public static void main(String[] args) {

        BufferedImage[] img = new BufferedImage[9];
        File[] f = new File[9];

        for(int i = 0; i<9; i++){
            try
            {
                f[i] = new File(args[i]);
                img[i] = ImageIO.read(f[i]);
            }
            catch(IOException e)
            {
                System.out.println(e);
            }

        }
        int width = img[0].getWidth();
        int height = img[0].getHeight();
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);

        for(int i = 0; i< width; i ++){
            for(int j=0; j<height; j++) {
                int[] px = new int[10];
                for(int k = 0; k < 9; k++){
                    px[k]=img[k].getRGB(i,j);
                }
                QuickSort qs = new QuickSort();
                qs.sort(px,0,9);
                int medPixel = px[5];
                image.setRGB(i,j,medPixel);
            }
        }

        try
        {
            File file = new File("rez.png");
            ImageIO.write(image, "png", file);

        }
        catch(IOException e)
        {
            System.out.println(e);
        }


    }
}
