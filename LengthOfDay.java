import java.awt.*;
public class LengthOfDay
{ public static void main(String [] args)
  { BarGraphWriter o = new BarGraphWriter(300,300);
    o.setTitle("Length of day (hours)");
    /* x- and y-axes start at  40, 100
    graph is 90 pixels high; top of graph is labelled "2200" */
    o.setAxes(40, 100, "2200", 90);      
    double scale_factor = 0.045;  
    o.setBar1("Mer", (int)(2106.12 * scale_factor), Color.red);   // One day in Mercury is 2106.2 hours long
    o.setBar2("Ven", (int)(718 * scale_factor), Color.white); // etc.
    o.setBar3("Ear", (int)(23.93* scale_factor), Color.blue);
    o.setBar4("Mar", (int)(24.62 * scale_factor), Color.yellow);
    o.setBar5("Jup",(int)(9.83*scale_factor),Color.pink);
    o.setBar6("Sat",(int)(10.03*scale_factor),Color.black);
   }
}