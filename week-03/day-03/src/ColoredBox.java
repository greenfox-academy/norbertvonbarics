import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

  public static void mainDraw(Graphics graphics) {
    // draw a box that has different colored lines on each edge.
    graphics.drawLine(0, 0, 300, 0);
    graphics.setColor(Color.red);
    graphics.drawLine(300, 0, 300, 300);
    graphics.setColor(Color.blue);
    graphics.drawLine(300, 300, 0, 300);
    graphics.setColor(Color.yellow);
    graphics.drawLine(0, 300, 0, 0);
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