import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * a circle shape Sun on the screen
 * Sam Lin  
 * 10/18/14 
 */

public class Sun
{
    /**
      instancevar xLeft the x-coordinate of the center of the Sun on the screen. 
      instancevar yTop the y-coordinate of the center of the Sun on the screen. 
    */
    
    private int xLeft; 
    private int yTop;
    
    /**
       Constrcuts a Sun with a given center.
    */
    
    public Sun (int x, int y)
    {
        this.xLeft = x;
        this.yTop = y;
    }
    
    /**
       Draws the Sun.
       @param g2 the graphics context. 
    */

    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double sun = new Ellipse2D.Double(xLeft+20,yTop, 140,140);
        g2.setColor(Color.RED);
        g2.fillOval(this.xLeft+20,this.yTop,140,140);
        g2.draw (sun);
        
    }
}