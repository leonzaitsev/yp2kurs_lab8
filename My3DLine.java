package yp8;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class My3DLine extends Canvas 
{
     private int width=10;

    private int x1 = 10;
     private int x2 = 400;
    private int y = 200;


    public My3DLine (int width) { this.width = width; }
    public My3DLine () {}

    public void setWidth(int width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }
    public void setStartPointX1(int x1) {this.x1 = x1;}
    public void setEndPointX2(int x2) {this.x2 = x2;}

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.draw3DRect(x1, y-(width/2), x2-x1, width/2 , true);
        g.draw3DRect(x1, y, x2-x1, width/2, true);
        g.fill3DRect(x1, y-(width/2), x2-x1, width/2 , true);
        g.fill3DRect(x1, y, x2-x1, width/2, true);
       
    }

}