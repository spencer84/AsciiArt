import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class AsciiArt {

    public static String outputFile(String fileName) {
        /* Rename the file before writing output */
        String asciiString = "_AsciiArt";
        //String newName = fileName.concat("_AsciiArt");
        // If there is a . in the file name, split string before renaming
        if (fileName.contains(".")){
            String[] parts = fileName.split("\\.");
            String prefix = parts[0];
            String fileExt = parts[1];
            String newName = prefix + asciiString + fileExt; 
            return newName;
        }
        else {
            String newName = fileName + asciiString; 
            return newName;
        }
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
            return null;
        }
        
        
    }
    // public static void writeAnscii(BufferedImage targetImage, String fileName){
    //     /* Need to get the height and width of the target image, then parse through */
    //     int height = targetImage.getHeight();
    //     int width = targetImage.getWidth();
    //     String outputName  = outputFile(fileName);
    //     File outputText = new File(outputName);
    //     //HashMap asciiMap = new HashMap();
    //     for (int h = 0; h < height; h++){
    //         for (int w = 0; w< width; w++){
    //             int rgb = targetImage.getRGB(h, w);
    //             System.out.println(rgb);
    //         }
    //     }
        
        // Define pixel to Ascii mapping here
        // Loop through height
        // Loop through Width
        //
    //}
    public static void main(String[] args) {
        /*Create an output text file */
        try{
            String fileName = "corgi.jpeg";
            // String fileName = args[0];
            BufferedImage targetFile = openFile(fileName);
            System.out.println("Corgi file opened");
            System.out.print(fileName);
            String newName = outputFile(fileName);
            System.out.println("File Named");
            System.out.print(newName);
            // writeAnscii(targetFile, fileName);
            // System.out.println("Function called");
        }catch(final ArrayIndexOutOfBoundsException e){
            //System.out.println("No file selected");
            return;
        }
        
        }
    

    // /*Upload an image from a given file name*/
    // public static importFile(args) {
    //     ImageToArt image = ImageIO.read(args);
    // }
}
