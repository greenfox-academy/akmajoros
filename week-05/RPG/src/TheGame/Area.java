package TheGame;

import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Area {
  int tileSize;
  int posX;
  int posY;
  String[][] fields = new String[Board.columns][Board.rows];
  Path walls;

  public void fillFields(String levelPath) {
    this.walls = Paths.get(levelPath);
    try {
      List<String> lines = Files.readAllLines(walls);
      for (int i = 0; i < lines.size(); i++) {
        String[] row = lines.get(i).split(";");
        fields[i] = row;
      }
    } catch (Exception e) {
    }
  }

  public Area() {
  }

  public boolean isWall(int x, int y) {
      if ((fields[x][y]).equals("1")) {
        return true;
      } else {
        return false;
      }
  }

  public void paintTile(Graphics graphics) {
    int tileSize = 72;
    for (int i = 0; i < 10; i++) {
      for (int j = 0; j < 10; j++) {
        if (!isWall(i, j)) {
          GameObject image = new GameObject(ImageLoader.getInstance().FLOOR, i * tileSize, j * tileSize);
          image.draw(graphics);
        } else {
          GameObject image = new GameObject(ImageLoader.getInstance().WALL, i * tileSize, j * tileSize);
          image.draw(graphics);
        }
      }
    }
  }
}
