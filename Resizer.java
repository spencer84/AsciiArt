import java.awt.image.BufferedImage;

public class Resizer {
    private int height;
    private int width;
    private int percent;

    public void setDimensions(int height, int width){
        this.height = height;
        this.width = width;
    }

    public void setPercent(int pct){
        this.percent = pct;
    }
    
    public BufferedImage resize(BufferedImage image){
        /* Need to get the height and width of the target image, then scale to output */
        int height = image.getHeight();
        int width = image.getWidth();
        int outputHeight = height*(this.percent/100);
        int outputWidth = width*(this.percent/100);
        // Add main logic to re-size the image here
        return image;
    }

}
