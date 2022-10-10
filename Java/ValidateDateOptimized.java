import java.util.Scanner;

class ValidateDateOptimized {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int d, m, y;
    do {
      String date = input.nextLine(); // DD/MM/YYYY
      d = Integer.parseInt(date.split("/")[0]); // DAY
      m = Integer.parseInt(date.split("/")[1]); // MONTH
      y = Integer.parseInt(date.split("/")[2]); // YEAR
    } while (d < 1 || d > 31 || m < 1 || m > 12 || y < 1); // Basic conditions
    boolean b = (y % 4 == 0 && y % 100 != 0) || y % 400 == 0; // Bissextile
    if((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 11 || m == 12) && d <= 31)
      System.out.println("Valid");
    else if((m == 4 || m == 6 || m == 8 || m == 9 || m == 10) && d <= 30)
      System.out.println("Valid");
    else if((m == 2) && b && d <= 29)
      System.out.println("Valid");
    else if((m == 2) && !b && d <= 28)
      System.out.println("Valid");
    else System.out.println("Invalid");
  }
}
