
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Sierpinsky {

  public static void mainDraw(Graphics graphics){
    int canvasSize = 300;
    int boxSize = canvasSize/3;


    boxes(boxSize, boxSize, boxSize,  graphics);


  }

  public static void boxes (int startX, int startY, int boxSize, Graphics graphics){
    if (boxSize < 1){
      return;
    }
    else{
      drawBlackSquare(startX, startY, boxSize, graphics);
      boxes(startX-boxSize/3*2, startY-boxSize/3*2, boxSize/3,  graphics);
      boxes(startX+boxSize/3, startY-boxSize/3*2, boxSize/3, graphics);
      boxes(startX+boxSize+boxSize/3, startY-boxSize/3*2, boxSize/3,  graphics);
      boxes(startX-boxSize/3*2, startY+boxSize+boxSize/3, boxSize/3,  graphics);
      boxes(startX+boxSize/3, startY+boxSize+boxSize/3, boxSize/3, graphics);
      boxes(startX+boxSize+boxSize/3, startY+boxSize+boxSize/3, boxSize/3,  graphics);
      boxes(startX-boxSize/3*2, startY+boxSize/3, boxSize/3,  graphics);
      boxes(startX+ boxSize +boxSize/3, startY+boxSize/3, boxSize/3,  graphics);
    }

  }

  public static void drawBlackSquare(int startX, int startY, int boxSize, Graphics graphics){
    graphics.fillRect(startX, startY, boxSize, boxSize);
  }



  //    Don't touch the code below
  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(323, 340));
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }
  static class ImagePanel extends JPanel{
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);

    }
  }

}