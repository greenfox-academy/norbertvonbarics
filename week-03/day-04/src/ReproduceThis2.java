import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ReproduceThis2 {
  public static void mainDraw(Graphics graphics) {
    int posX = 160;
    int posY = 360;
    int width = 120;
    int heigth = 180;
    recurse(graphics, posX, posY, width, heigth, 5);
  }

  public static void recurse(Graphics hex, int posX, int posY, int width, int height, int counter) {
    int x[] = {posX, posX - width, posX, posX + 2 * width, posX + 3 * width, posX + 2 * width};
    int y[] = {posY, posY - height, posY - 2 * height, posY - 2 * height, posY - height, posY};
    hex.drawPolygon(x, y, 6);
    if (counter == 0) {
      return;
    } else {
      recurse(hex, posX, posY, width / 2, height / 2, counter - 1);
      recurse(hex, posX, posY - height, width / 2, height / 2, counter - 1);
      recurse(hex, posX + 3 * width / 2, posY - height / 2, width / 2, height / 2, counter - 1);
    }
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


// create a 300x300 canvas.