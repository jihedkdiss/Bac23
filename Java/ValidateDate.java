import java.util.Scanner;
import java.util.Stack;

class ValidateDate {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int day, month, year;
    do {
      System.out.print("Enter date: ");
      String date = input.nextLine();
      day = Integer.parseInt(date.split("/")[0]);
      month = Integer.parseInt(date.split("/")[1]);
      year = Integer.parseInt(date.split("/")[2]);
    } while (day < 1 || day > 31 || month < 1 || month > 12 || year < 1);
    System.out.println("Day: " + day);
    System.out.println("Month: " + month);
    System.out.println("Year: " + year);
    boolean valid = false;
    boolean bissextile = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 11 || month == 12) && day <= 31) valid = true;
    if((month == 4 || month == 6 || month == 8 || month == 9 || month == 10) && day <= 30) valid = true;
    if((month == 2) && bissextile && day <= 29) valid = true;
    if((month == 2) && !bissextile && day <= 28) valid = true;
    if(valid) System.out.println("Valid date :)");
    else System.out.println("Invalid date!");
  }
}
