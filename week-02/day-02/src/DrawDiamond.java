import java.util.Scanner;

public class DrawDiamond {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please give me a number that will define the length of the diamond!");
    int number = scanner.nextInt();
    for (int i = 0; i < number; i++) {
      for (int k = i; k < number; k++) {
        if (k != number -1) {
          System.out.print(" ");
        }
      }
      for (int g = 0; g <= i * 2; g++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 0; i < number; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      for (int g = i * 2; g < number * 2 - 3; g++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}