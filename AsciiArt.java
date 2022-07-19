import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class AsciiArt {

    public static void outputFile(String fileName) {
        /* Rename the file before writing output */
        String newName = fileName.concat("_AsciiArt");
            System.out.println(newName);
    }

    public static void openFile(String fileName){
        /* Open the file from the input string */
        try{BufferedImage targetImage = ImageIO.read(new File(fileName));
        }

        catch(IOException e){
            System.out.println("No file found");
        }
        
    }
    public static void main(String[] args) {
        /*Create an output text file */
        try{
            String fileName = args[0];
            outputFile(fileName);
        }catch(final ArrayIndexOutOfBoundsException e){
            System.out.println("No file selected");
            return;
        }
        
        }
    

    // /*Upload an image from a given file name*/
    // public static importFile(args) {
    //     ImageToArt image = ImageIO.read(args);
    // }
}
