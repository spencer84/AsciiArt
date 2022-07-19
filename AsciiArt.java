import javax.imageio.ImageIO;

public class AsciiArt {

    
    public static verifyImage(String[] image){
        /* Identify if an arg is an image */
        String jpeg = ".jpeg";
        if (jpeg in image){
            return boolean true
        };

    }
    public static void outputFile(args) {
        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
    public static void main(String[] args) {
        /*Create an output text file */
        outputFile();}
    

    // /*Upload an image from a given file name*/
    // public static importFile(args) {
    //     ImageToArt image = ImageIO.read(args);
    // }
}
