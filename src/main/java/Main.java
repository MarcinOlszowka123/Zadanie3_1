import java.util.Scanner;

public class choinka {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Podaj wysokosc choinki: ");
    int height = 0;
    try {
      height = Integer.parseInt(scan.nextLine().trim());
    } catch (Exception e) {
      height = 5;
    }

    System.out.println("Podaj znak:np(*) ");
    String znak = scan.nextLine().trim();
    if (znak.length() == 0)
      znak = "*";
    char c = znak.charAt(0);
  }

}