import java.awt.*;
public class MassRelativeToEarth
{ public static void main(String [] args)
  { BarGraphWriter e = new BarGraphWriter(300,300);
    e.setTitle(" Mass (relative to Earth)");
    /* x- and y-axes start at  40, 100
    graph is 90 pixels high; top of graph is labelled "330" */
    e.setAxes(40, 100, "330", 90);      
    double scale_factor = 0.273;  
    e.setBar1("Mer", (int)(0.05 * scale_factor), Color.red);   // The mass of Mercury (relative to Earth) is 0.05
    e.setBar2("Ven", (int)(0.81 * scale_factor), Color.white); // etc.
    e.setBar3("Ear", (int)(1.00 * scale_factor), Color.blue);
    e.setBar4("Mar", (int)(0.11 * scale_factor), Color.yellow);
    e.setBar5("Jup", (int)(318.4 * scale_factor ),Color.pink);
    e.setBar6("Sat", (int)(95.3 * scale_factor),Color.black);
   }
}