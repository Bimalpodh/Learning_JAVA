import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("removal")
public class Myapplet extends Applet {
    public void paint(Graphics g) {
        // Draw the heart shape
        g.setColor(Color.RED);
        g.fillArc(50, 50, 100, 100, 0, 180);
        g.fillArc(100, 50, 100, 100, 0, 180);
        g.fillPolygon(new int[]{50, 150, 100}, new int[]{100, 100, 200}, 3);
    }
}
/*<applet code="Myapplet.class" width="200" height="200"> </applet>*/