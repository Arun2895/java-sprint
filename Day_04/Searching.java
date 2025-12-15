import java.util.Scanner;

class Searching {
    public static void main(String[]args){

        //Binary Search
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int arr[] = {10,20,30,50,70};

        int n = arr.length;
        int low = 0;
        int high = n-1;
        boolean keyfound = false;
        int median = (low+high)/2;
        while(low <= high){
            median = (low + high) / 2;

            if(arr[median] == key){
                keyfound = true;
                break;
            }
            else if (key > arr[median]){
                low = median + 1;
                }
            
            else{
                high = median - 1;
                }
            }
            
            if(keyfound == true){
                System.out.println("Key is found at index: " + median);
            }
            else{
                System.out.println("Key not found");
            }
    }   
}
