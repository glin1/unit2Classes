import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 * cityscape to these object.
 * 
 * @author Sam Lin 
 * @version 10 18 2014
 */
 
public class CityscapeComponent extends JComponent
{
    /**
     * This component draws  car,  sun, and building at given x,y coordinates.  
     * @param g the graphics context
     * @return nothing.
     */
     
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
    /** instancevar x the x-coordinate of the front of the car
     *  instancevar y the y-coordinate of the front of the car
     */
        Cars car1= new Cars(20,510);
        int x = 30;
        int y = getHeight() -38;
        Cars car = new Cars(x,y);
        Cars car2 = new Cars(500,510); 
        
        car1.draw(g2);
        car2.draw(g2);

        Sun sun1 = new Sun (0,20);
        sun1.draw(g2);
        
    /** instancevar a the initial x-coordinate of the first retangular building. */
     
        int a = 200;
        int b = getHeight();
                
        Building building1 = new Building(a+50,170,100,400);
        Building building2 = new Building(a+200,200,100,400);
        Building building3 = new Building(a+400,240,100,460);
      
        building1.draw(g2);
        building2.draw(g2);
        building3.draw(g2);
        
    }
        
        
}