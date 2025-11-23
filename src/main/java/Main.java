import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj wysokosc choinki: ");
    int height = 0;
    try {
      height = Integer.parseInt(sc.nextLine().trim());
    } catch (Exception e) {
      height = 5;
    }
    System.out.println("Podaj znak:np(*) ");
    String znak = sc.nextLine().trim();
    if (znak.length() == 0)
      znak = "*";
    char c = znak.charAt(0);
    for (int i = 1; i < height; i++) {
      int stars = 2 * i + 1;
      int spaces = height - i - 1;
      for (int j = 0; j < spaces; j++)
        System.out.print("");
      for (int j = 0; j < stars; j++)
        System.out.print(c);
      System.out.println("");
    }
  }
}