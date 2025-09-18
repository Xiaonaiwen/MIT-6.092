import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    BouncingBox box1;
    BouncingBox box2;
    BouncingBox box3;
    ArrayList<BouncingBox> list = new ArrayList<BouncingBox>();
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box1 = new BouncingBox(200, 50, Color.RED);
        box1.setMovementVector(10,0);
        list.add(box1);

        box2 = new BouncingBox(100, 25, Color.BLUE);
        box2.setMovementVector(0, 10);
        list.add(box2);

        box3 = new BouncingBox(300, 95, Color.BLACK);
        box3.setMovementVector(20, 10);
        list.add(box3);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        //surface.drawOval(10, 10, 10, 30);
        //surface.drawPolygon(new int[] {10, 50, 70, 90}, new int[] {20, 40, 60, 100}, 4);
        //surface.drawRect(20, 20, 10, 10);
        //box1.draw(surface);
        BouncingBox box;
        for(int i = 0; i < list.size(); i++){
            box = list.get(i);
            box.draw(surface);
        }
    }
} 