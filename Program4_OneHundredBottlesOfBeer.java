import java.util.Scanner;

public class Program4_OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int verses = 0;

    do {
      System.out.println("How many verses of the song \"One Hundred Bottles of Beer on the Wall\" would you like me to print?");
      verses = scan.nextInt();

      if (verses < 1 || verses > 100) {
        System.out.println("Please enter a number between 1 and 100.");
      }
    } 
    while (verses < 1 || verses > 100);

    for (int i = 0; i < verses; i++) {
      int bottles = 100 - i;

      System.out.println(bottles + " bottles on the wall");
      System.out.println(bottles + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      System.out.println((bottles - 1) + " bottles of beer on the wall");
      System.out.println();
    }

    scan.close();
  }
}