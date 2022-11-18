import java.awt.image.BufferedImage;
import java.awt.*;
import java.lang.Math;

public class Resizer {
    private  float height;
    private  float width;
    private  float percent;

    public void setDimensions(BufferedImage image){
        this.height = image.getHeight();
        this.width = image.getWidth();
    }

    public void setPercent(int pct){
        float pctFloat = (float)pct;
        this.percent = pctFloat/100;
    }
    
    // Return a BufferedImage scaled to the desired size
    public BufferedImage resize(int pct, BufferedImage image){
        /* Need to get the height and width of the target image, then scale to output */
        setPercent(pct);
        setDimensions(image);
        int outputHeight = Math.round(this.height*this.percent);
        int outputWidth = Math.round(this.width*this.percent);
        System.out.println("Percent: "+ this.percent);
        System.out.println("The height:  " + this.height);
        System.out.println("The width:  " + this.width);
        System.out.println("The output Height:  " + outputHeight);
        System.out.println("The output Width:  " + outputWidth);
        // Try the Image method to resize
        Image resized = image.getScaledInstance(outputWidth, outputHeight, Image.SCALE_SMOOTH);
        // Then convert back to BufferedImage
        BufferedImage outputImage = new BufferedImage(outputWidth, outputHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resized, 0, 0, null);
        return outputImage;
    }

}
