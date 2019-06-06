import java.awt.*;
public class TestGraph
{ public static void main(String[] a)
  { BarGraphWriter e = new BarGraphWriter(300,300);
    e.setTitle("Days in first four months of the year");
    /* x- and y-axes start at  20, 120
       graph is 90 pixels high; top of graph is labelled "30" */
    e.setAxes(20, 120, "30", 90);    
    int scale_factor = 3;  
    e.setBar1("Jan", 31 * scale_factor, Color.red);   // Jan has 31 days
    e.setBar2("Feb", 28 * scale_factor, Color.white); // etc.
    e.setBar3("Mar", 31 * scale_factor, Color.blue);
    e.setBar4("Apr", 30 * scale_factor, Color.yellow);
  }
}


