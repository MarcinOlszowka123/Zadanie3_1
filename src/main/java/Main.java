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
    System.out.println("Podaj znak: np(*) ");
    String znak = sc.nextLine().trim();
    if (znak.length() == 0)
      znak = "*";
    char c = znak.charAt(0);
    System.out.println("Podaj ile ma mieć warstw:");
    int warstwy = 0;
    try {
      warstwy = Integer.parseInt(sc.nextLine().trim());
    } catch (Exception e) {
      warstwy = 1;
    }
    for (int s = 0; s <= warstwy; s++) {
      for (int i = 0; i < height; i++) {
        int stars = i + 1;
        int spaces = height - i - 1;
        for (int j = 0; j < spaces; j++)
          System.out.print("");
        for (int j = 0; j < stars; j++)
          System.out.print(c);
        System.out.println("");
      }
    }
  }
}