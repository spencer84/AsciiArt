import java.awt.image.BufferedImage;
import java.awt.*;

public class Resizer {
    private int height;
    private int width;
    private int percent;

    public void setDimensions(BufferedImage image){
        this.height = image.getHeight();
        this.width = image.getWidth();
    }

    public void setPercent(int pct){
        this.percent = pct;
    }
    
    public BufferedImage resize(BufferedImage image){
        /* Need to get the height and width of the target image, then scale to output */
        setDimensions(image);
        int outputHeight = this.height*(this.percent/100);
        int outputWidth = this.width*(this.percent/100);
        // Try the BufferedImage method to resize
        Image resized = image.getScaledInstance(outputWidth, outputHeight, image.SCALE_SMOOTH);

        // Iterate through each pixel, convert to average pixel color
        for (int w = 0; w< width; w++){
            // For every line of pixels, initialize a new line of text to be written into the file
            String line = System.lineSeparator() + "";
            for (int h = 0; h < height; h++){
                
            }
        }
        return image;
    }

}
