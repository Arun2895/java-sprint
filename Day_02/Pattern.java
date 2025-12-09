import java.util.*;
// Rectangular Pattern
class Pattern{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0;i<n;i++){
      for(int j = 0;j<n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  } 
}

//Increasing Triangle Pattern
class Pattern{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int var1 = 1;
    for(int i = 0;i<n;i++){
      for(int j = 0;j<var1;j++){
        System.out.print("*");
      }
      System.out.println();
      var1++;
    }
  } 
}

//Decreasing triangle
class Pattern{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int var1 = 1;
    for(int i = 0;i<n;i++){
      for(int j = n;j>i;j--){
        System.out.print("*");
      }
      System.out.println();
      var1--;
    }
  } 
}
