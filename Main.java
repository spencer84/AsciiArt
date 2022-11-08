import java.io.*;

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

        
    }

        
    
    public static void main(String[] args){
        if(needsResize()){
            Resizer resizer = new Resizer();
        }
    // Do we need to re-size?
    // If no, then use the AsciiArt converter as defined
    // Otherwise 
    AsciiArt art = new AsciiArt();
    
    }
    
}
