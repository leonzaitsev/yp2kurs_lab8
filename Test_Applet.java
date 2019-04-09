package yp8;
import java.applet.Applet;
import java.awt.*;


public class Test_Applet extends Applet
{
    final int X=600,Y=600;
	private My3DLine dline;

    @Override
    public void init() {
        setSize(X,Y);
       dline = new My3DLine(10);
    }

    @Override
    public void paint(Graphics g) {
        dline.paint(g);
    }

}