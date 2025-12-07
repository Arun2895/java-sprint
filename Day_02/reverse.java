import java.util.Scanner;

class reverse{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean negative = n<0;
    int rev = 0;
    int value = Math.abs(n);
    if(n==0){
      System.out.println("The given integer is invalid");
      return;
    }
    while(value>0){
      int r = value%10;
      rev = rev*10 + r;
      value = value/10;
    }
    if(negative){
      rev = -rev;
    }
    System.out.println("The reversed integer is " + rev);
    
  }
}
    
