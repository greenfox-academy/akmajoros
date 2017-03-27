import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lotto {
  public static void main(String[] args) {
    Path filePath = Paths.get("assets/otos.csv");

    try {
      List<String> lines = Files.readAllLines(filePath);
      HashMap<String, Integer> winnerNumbers = new HashMap<String, Integer>();
      int occurence = 0;
      for(String line : lines){
        String[] linesArray = line.split(";");
        int sizeTo = linesArray.length;
        int sizeFrom = sizeTo - 5;
        for (int i = sizeFrom; i < sizeTo; i++){
          winnerNumbers.put(linesArray[i], occurence);
        }
        System.out.println(winnerNumbers);
      }
    } catch (Exception e) {
      System.out.println("Error occured!");
    }
  }
}