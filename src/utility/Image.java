package utility;

import Radiant.Driver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Image {

    public BufferedImage buffer;
    public File image;

    public Image(String filename) {
        image = new File(filename);
        buffer =  new BufferedImage(Driver.world.viewPlane.width, Driver.world.viewPlane.height, BufferedImage.TYPE_INT_RGB);
    }

    public void write(String filetype){
        try{
            ImageIO.write(buffer, filetype, image);
        }catch(Exception e){
            System.out.println("Could not write image.");
            System.exit(1);
        }
    }
}
