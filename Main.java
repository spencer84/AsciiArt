import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.*;

public class Main {

    // Identify if file should be resized
    public static boolean needsResize(){
        System.out.println("Re-size file? y/n");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {String input = reader.readLine();
            if( input.equals("y")){
                return true;
            }
            else if  (input.equals("n")){
                return false;
            }
            else{
                System.out.println("Input not recognised. Please input y or n...");
                needsResize();
            }
        }
        catch (Exception e){
            needsResize();
        }
            return false;
        }

    public static int newSize(){
        System.out.println("What percent (%) of the previous file size?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {int input = Integer.valueOf(reader.readLine());

            if(input > 0 && input <= 1000){
                return input;
            }
            else{
                System.out.println("Input must be a value between 1-1000");
                newSize();
            }
        }
        catch (Exception e){
            newSize();
        }
            return 100;
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

    
    public static void main(String[] args){
        // Read in file
        try{String fileName = args[0];
            BufferedImage targetFile = openFile(fileName);
            AsciiArt art = new AsciiArt();
            // Check if we need to re-size
            if(needsResize()){
                Resizer resizer = new Resizer();
                Image resizedFile = resizer.resize(targetFile);
                // Convert to ASCII art and write to file
                art.writeAscii(resizedFile, fileName);
            }
            else{
                // Convert to ASCII art and write to file
                art.writeAscii(targetFile, fileName);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No file path provided.");
            return;
        }
        
    
    }
    
}
