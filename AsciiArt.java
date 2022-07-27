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
            String newName = prefix + asciiString + ".txt"; 
            return newName;
        }
        else {
            String newName = fileName + asciiString + ".txt"; 
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
    public static void writeAnscii(BufferedImage targetImage, String fileName){
        /* Need to get the height and width of the target image, then parse through */
        int height = targetImage.getHeight();
        int width = targetImage.getWidth();
        String outputName  = outputFile(fileName);
        File outputText = new File(outputName);
        // Create a HashMap and add Ascii Characters corresponding to brightness
        HashMap <Integer,Character> asciiMap = new HashMap <Integer,Character>();
        String mapVals = ".,-~:;=!*#@";
        for (int i = 0;i < mapVals.length(); i++){
                asciiMap.put(i, mapVals.charAt(i));
        }
        for (int h = 0; h < height; h++){
            for (int w = 0; w< width; w++){
                int rgb = targetImage.getRGB(h, w);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = (rgb & 0xff);
                int grayScale = r+g+b;
                System.out.println(grayScale);
            }
        }

  
        // Define pixel to Ascii mapping here
        // Loop through height
        // Loop through Width
        
    }
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
            writeAnscii(targetFile, fileName);
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
