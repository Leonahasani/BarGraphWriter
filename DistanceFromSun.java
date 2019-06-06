import java.awt.*;
public class DistanceFromSun
{ public static void main(String [] args)
  { BarGraphWriter e = new BarGraphWriter(300,300);
    e.setTitle("Distance from sun (astronomical units)");
    /* x- and y-axes start at  20, 120
       graph is 90 pixels high; top of graph is labelled "10" */
    e.setAxes(20, 120, "10", 90);      
    int scale_factor = 9;  
    e.setBar1("Mer", (int)(0.387 * scale_factor), Color.red);   // Mercury is 0.387 astronomical units far from the sun
    e.setBar2("Ven", (int)(0.723 * scale_factor), Color.white); // etc.
    e.setBar3("Ear", (int)(1.00 * scale_factor), Color.blue);
    e.setBar4("Mar", (int)(1.524 * scale_factor), Color.yellow);
    e.setBar5("Jup",(int)(5.203*scale_factor),Color.pink);
    e.setBar6("Sat",(int)(9.539*scale_factor),Color.black);
   }
}