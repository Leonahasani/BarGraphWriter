import java.awt.*;
import javax.swing.*;  
//in this exercise we will create 6 bars that will show differences between different types of data
public class BarGraphWriter extends JPanel 
{private int width;
   private int height;
   private int x_pos; // the position of x
   private int y_pos; // the position of y
/*now we create d1 and d2 that are the distances that we will need in the following rows
  we need d1 for the distance between the bars(rectangles) and d2 for the distance betweern the name of the bars*/
   private int d1 = 26; 
   private int d2 = 27;
 // now we create the bar object
   private Bar bar = new Bar("",0,Color.BLACK); 
   Bar bar1 = bar;
   Bar bar2 = bar;
   Bar bar3 = bar;
   Bar bar4 = bar;
   Bar bar5 = bar;
   Bar bar6 = bar;
 // we create the field variable, my_frame, to be easier for us to access to it 
   JFrame my_frame; 
   public BarGraphWriter(int w, int h)
   /*now we create a frame, where the BarGraph will be shown.
    That has a size, but it doesn't have the background color and neither the title of the frame
   If we want to see the frame we should set the visible true because if we don't then the
   frame will be created but we won't see it  */
   {width=w;
      height=h;
      my_frame = new JFrame();
      my_frame.getContentPane().add(this);
      my_frame.setSize(width, height);
      my_frame.setVisible(true);
   }
  // this method with parameter will show the title of the frame
   public void setTitle(String label) // this shows the title of the frame
   {my_frame.setTitle(label);
   }
   public void setAxes(int x_pos, int y_pos, String top_label, int y_height)
   {  this.x_pos = x_pos; // it makes the position of x also available for the other methods
      this.y_pos = y_pos; // it makes the position of y also available for the other methods
      Graphics g = getGraphics();
      g.setColor(Color.BLACK); 
      g.drawLine(x_pos,y_pos,x_pos+120,y_pos);// this will draw the x axis
      g.drawLine(x_pos,y_pos,x_pos,(y_pos-y_height)); // this will show the y axis in the frame
      g.drawString(top_label,5,(y_pos-y_height)); // it will show the top label (it won't be the same for all of the testing codes)
      g.drawString("0",5,y_pos); // this will show the "0" created at the angle of x and y axes 
   }
   // creating the methods with parameters of each bar
   public void setBar1(String label, int height, Color c)
   {Graphics g = getGraphics();
      g.drawString(label,x_pos,y_pos+10); // it will write the name underneath the first bar
      g.setColor(c);
      g.fillRect(x_pos,y_pos-height,20,height); // will fill the rectangle with the specified color to the testing classes
      g.setColor(Color.BLACK);
      g.drawRect(x_pos,y_pos-height,20,height); // it will draw the borders of the bar with the black color
   }
   public void setBar2(String label, int height, Color c)
   {Graphics g = getGraphics();
      g.drawString(label,x_pos+d2,y_pos+10); //it will write the name underneath the second bar
      g.setColor(c);
      g.fillRect(x_pos+d1,y_pos-height,20,height); // it will fill the rectangle with the color specified to the testing classes
      g.setColor(Color.BLACK);
      g.drawRect(x_pos+d1,y_pos-height,20,height); // this will draw the borders of the rectangle with the black color
   }
   public void setBar3(String label, int height, Color c)
   {Graphics g = getGraphics();
      g.drawString(label,x_pos+d2*2,y_pos+10); // it will write the name underneath the third bar
      g.setColor(c);
      g.fillRect(x_pos+d1*2,y_pos-height,20,height); //etc...
      g.setColor(Color.BLACK);
      g.drawRect(x_pos+d1*2,y_pos-height,20,height);
   }
   public void setBar4(String label, int height, Color c)
   {Graphics g = getGraphics();
      g.drawString(label,x_pos+d2*3,y_pos+10);
      g.setColor(c);
      g.fillRect(x_pos+d1*3,y_pos-height,20,height);
      g.setColor(Color.BLACK);
      g.drawRect(x_pos+d1*3,y_pos-height,20,height);
   }
   public void setBar5(String label, int height, Color c)
   {Graphics g = getGraphics();
      g.drawString(label,x_pos+d2*4,y_pos+10);
      g.setColor(c);
      g.fillRect(x_pos+d1*4,y_pos-height,20,height);
      g.setColor(Color.BLACK);
      g.drawRect(x_pos+d1*4,y_pos-height,20,height);
   }
   public void setBar6(String label, int height, Color c)
   {Graphics g = getGraphics();
      g.drawString(label,x_pos+d2*5,y_pos+10);
      g.setColor(c);
      g.fillRect(x_pos+d1*5,y_pos-height,20,height);
      g.setColor(Color.BLACK);
      g.drawRect(x_pos+d1*5,y_pos-height,20,height);
   }
   class Bar
   { // now we will give the variables values
      private String label = "";
      private int h = 0;
      private Color color = null;
      public Bar(String label, int h, Color color)
      {this.label=label;
         this.h=h;
         this.color=color;
      }
     // now we will create methods that will return results, these results will be default results that are given as variable values 
      public String label()
      { 
         return label;
      }
      public double height()
      { 
         return h;
      }
      public Color color()
      { 
         return color;
      }
   }
}