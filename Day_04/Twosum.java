import java.util.Scanner;

class Twosum{
    public static void main(String[]args){
        //Twosum
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int arr[] = {10,20,30,50,70};

        int n = arr.length;
        boolean keyfound = false;
        
        for(int i = 0;i<n;i++){
            for(int j = 1;j<n;j++){
                if (arr[i]+arr[j]==target){
                    keyfound = true;
                    System.out.println("The pair is found at index " + i+ " and "+ j);
                }
            }
        }
        if(keyfound == false){
            System.out.println("The Pair is not found");
        }
    }
}

import java.util.Scanner;
//Two sum using two pointers
class Twosum{
    public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int arr[] = {10,20,30,50,70};
        int n = arr.length;

        int low = 0;
        int high = n-1;
        boolean targetfound = false;
        while(low<high){
            int sum = arr[low]+arr[high];
                if(sum == target){
                    targetfound = true;
                    break;
                }
                else if(sum>target){
                    high--;
                }
                else{
                    low++;
                }
            }
        if(targetfound == true){
            System.out.println("The pairs are found at index " + low + " and " + high);
        }
    }
}

