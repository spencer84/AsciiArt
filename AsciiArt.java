import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileWriter;
import java.awt.Graphics2D;

public class AsciiArt {
    private static String newFileName;
    public static String mapVals = ".,-~:;=!*#$@";
    public static ArrayList<BufferedImage> ASCIIGraphics;


    // Create graphics for each ASCII character
    public static void getASCIIGraphics(){
            Graphics2D asciiChar;
            BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
            asciiChar = img.createGraphics();
            for (int i = 0;i < mapVals.length(); i++){
            asciiChar.drawString(mapVals.substring(i, i+1),0,8);
            asciiChar.dispose();
            ASCIIGraphics.add(img);
        }  
    }
    

    public static void outputFile(String fileName){
        /* Produce output file name before writing output */
        String asciiString = "_AsciiArt";
        // If there is a . in the file name, split string before renaming
        if (fileName.contains(".")){
            String[] parts = fileName.split("\\.");
            String prefix = parts[0];
            String newName = prefix + asciiString + ".txt"; 
            newFileName = newName;
        }
        else {
            String newName = fileName + asciiString + ".txt"; 
            newFileName = newName;
        }
    }

    
    public void writeAscii(BufferedImage targetImage, String fileName){
        /* Need to get the height and width of the target image, then parse through */
        int height = targetImage.getHeight();
        int width = targetImage.getWidth();
        outputFile(fileName);
        try{FileWriter myWriter = new FileWriter(newFileName);
        // Create a HashMap and add Ascii Characters corresponding to brightness
        HashMap <Integer,Character> asciiMap = new HashMap <Integer,Character>();
        // Map values differently according to text background
        String mapVals = ".,-~:;=!*#$@";
        for (int i = 0;i < mapVals.length(); i++){
                asciiMap.put(i, mapVals.charAt(i));
        }
        // Iterate through each pixel, convert to a rough grayscale, map to an Ascii value, then write to new file
        for (int w = 0; w< width; w++){
            // For every line of pixels, initialize a new line of text to be written into the file
            String line = System.lineSeparator() + "";
            for (int h = 0; h < height; h++){
                int rgb = targetImage.getRGB(h, w);
                int r = (rgb >> 16) & 0xFF;
                int g = (rgb >> 8) & 0xFF;
                int b = (rgb & 0xff);
                int grayScale = (r+g+b)/64;
                // Get the Ascii character of closest brightness from the hashmap and add to the line of text
                try{char asciiVal = asciiMap.get(grayScale);
                line += asciiVal;}
                catch(java.lang.NullPointerException np){
                    line += "Null";
                }
            }
           myWriter.write(line);
        }
        myWriter.close();
    }
        
        catch(IOException e){
            System.out.println("Not able to write to file");
        }

    }
    

    // /*Upload an image from a given file name*/
    // public static importFile(args) {
    //     ImageToArt image = ImageIO.read(args);
    // }
}
