import java.util.Scanner;

public class Program2_PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a string of characters");
    String input = scan.nextLine();

    int aCount = 0;
    int eCount = 0;
    int iCount = 0;
    int oCount = 0;
    int uCount = 0;
    int nonVowelCount = 0;

    for (int index = 0; index < input.length(); index++) { 
      char ch = input.charAt(index);

      switch (Character.toLowerCase(ch)){
        case 'a':
          aCount++;
          break;
        case 'e':
          eCount++;
          break;
        case 'i':
          iCount++;
          break;
        case 'o':
          oCount++;
          break;
        case 'u':
          uCount++;
          break;
        default:
          nonVowelCount++;
          break;
      }
    }

    System.out.println("Number of a's - " + aCount);
    System.out.println("Number of e's - " + eCount);
    System.out.println("Number of i's - " + iCount);
    System.out.println("Number of o's - " + oCount);
    System.out.println("Number of u's - " + uCount);
    System.out.println("Number of non-Vowel's characters - " + nonVowelCount);
    
    scan.close();
  }
}
