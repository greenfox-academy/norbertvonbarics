import javax.swing.*;

import java.awt.*;

import static java.awt.Color.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing {

  public static void mainDraw(Graphics graphics) {
    //  draw a red horizontal line to the canvas' middle.
    //  draw a green vertical line to the canvas' middle.
    graphics.setColor(red);
    graphics.drawLine(0, 150, 300, 150);
    graphics.setColor(green);
    graphics.drawLine(150, 0, 150, 300);


  }

  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(300, 300));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}