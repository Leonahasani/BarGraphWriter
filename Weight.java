import java.awt.*;
public class Weight
{ public static void main(String[] a)
  { BarGraphWriter e = new BarGraphWriter(300,300);
    e.setTitle("Weight of 1kg. object");
    /* x- and y-axes start at  20, 120
       graph is 90 pixels high; top of graph is labelled "3" */
    e.setAxes(20, 120, "3", 90);     
    int scale_factor = 30;  
    e.setBar1("Mer", (int)(0.25 * scale_factor), Color.red);   // The weight of 1kg. object in Mercury is 0.25kg.
    e.setBar2("Ven", (int)(0.85 * scale_factor), Color.white); // etc.
    e.setBar3("Ear", (int)(1.00 * scale_factor), Color.blue);
    e.setBar4("Mar", (int)(0.36 * scale_factor), Color.yellow);
    e.setBar5("Jup", (int)(2.64 * scale_factor), Color.green);
    e.setBar6("Sat", (int)(1.17 * scale_factor), Color.gray);
  }
}