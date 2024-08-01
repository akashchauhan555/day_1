import java.util.Scanner;

public class reverse_num {
  public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter the number to be reversed:");
      int a =sc.nextInt();
      int rev_num = 0;
      while(a != 0) {
        int rem = a % 10;
        rev_num = rev_num * 10 + rem;
        a = a / 10;
      }
      System.out.println("Revesed number is :"+ rev_num);
    }
  }
}