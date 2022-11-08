import java.io.*;

public class Main {

    // Identify if file should be resized
    public static boolean handleResize(){
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
                handleResize();
            }
        }
        catch (Exception e){
            handleResize();
        }
            return false;
        }


        
    }
    public static void main(String[] args){
    // Do we need to re-size?
    // If no, then use the AsciiArt converter as defined
    // Otherwise 
    AsciiArt art = new AsciiArt();
    
    }
    
}
