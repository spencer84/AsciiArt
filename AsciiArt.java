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

    public static BufferedImage openFile(String fileName){
        /* Open the file from the input string.
         * Return the BufferedImage object if it exists.
        */
        try{BufferedImage targetImage = ImageIO.read(new File(fileName));
            return targetImage;
        }

        catch(IOException e){
            System.out.println("No file found");
        }
        return null;
        
    }
    public static void writeAnscii(BufferedImage targetImage){
        /* Need to get the height and width of the target image, then parse through */
        int height = targetImage.getHeight();
        int width = targetImage.getWidth();
        // Create a text file to write ascii output to
        // Define pixel to Ascii mapping here
        // Loop through height
        // Loop through Width
        //
    }
    public static void main(String[] args) {
        /*Create an output text file */
        try{
            String fileName = args[0];
            BufferedImage targetFile = openFile(fileName);

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
