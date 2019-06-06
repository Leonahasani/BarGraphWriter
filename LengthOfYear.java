import java.awt.*;
public class LengthOfYear
{ public static void main(String [] args)
  { BarGraphWriter o = new BarGraphWriter(300,300);
    o.setTitle("Length of year (in Earth days)");
    /* x- and y-axes start at  40, 100
       graph is 90 pixels high; top of graph is labelled "11000" */
    o.setAxes(40, 100, "11000", 90);      
    double scale_factor = 0.0085;  
    o.setBar1("Mer", (int)(88.0  * scale_factor), Color.red);   // Mercury it has only 88 days
    o.setBar2("Ven", (int)(224.7 * scale_factor), Color.white); // etc.
    o.setBar3("Ear", (int)(365.3 * scale_factor), Color.blue);
    o.setBar4("Mar", (int)(687.0 * scale_factor), Color.yellow);
    o.setBar5("Jup", (int)(4332.46*scale_factor),Color.pink);
    o.setBar6("Sat", (int)(10761.74*scale_factor),Color.black);
   }
}