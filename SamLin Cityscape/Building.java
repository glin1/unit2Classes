import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;
import java.awt.Graphics2D;

/**
 * A building on the screen. 
 * Sam Lin
 * 10/18/14
 */
 
public class Building
{
    /** instancevar xLeft specify the x-coordinate of the top left corner. */
    private int xLeft;
    
    /** instancevar yTop specify the y-coordinate of the top left corner. */ 
    private int yMin;
    
    /** int specify the height of the building*/
    private int bHeight;
    
    /** int specify the width of the building*/
    private int bWidth;
   
    /**
     * Constructor the rectangluar building with a given (x,y) and height and width. 
     */
     
    public Building (int xLeft, int yMin, int width, int height)
    {
        this.bHeight= height;
        this.bWidth= width;
        this.xLeft=xLeft;
        this.yMin=yMin;
    }
    
    /**
     * draws the building and sets its color to green.
     * @param g2 the graphics context
    */
    public void draw (Graphics2D g2)
    {
        Rectangle building = new Rectangle(this.xLeft,this.yMin,this.bWidth,this.bHeight);
        g2.setColor(Color.GREEN);
        g2.draw(building);
        g2.fill(building);
    }
    
    
    

   
}