//To check whether an integer is palindrome or not
import java.util.Scanner;

class Palindrome{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int rev = 0;
    int value = n;
    if(n==0){
      System.out.println("The given integer is invalid");
    }
    while(n>0){
      int r = n%10;
      rev = rev*10 + r;
      n = n/10;
    }
    if(value == rev){
      System.out.println(value + " and " + rev + " are Palindromes");
    }else{
      System.out.println(value + " and " + rev + " are not Palindromes");
    }
  }
}
