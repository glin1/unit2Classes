import javax.swing.JFrame;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @Sam Lin 
 * @version 10 18 2014
 */
public class CityscapeViewer
{
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args)
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // a frame contains a single component; creates the Cityscape component and add to frame.
        CityscapeComponent component = new CityscapeComponent();
        frame.add(component);
        
        // make the frame visible  in the paintComponent method being invoked on the  component.
        frame.setVisible(true);
        
    }

}