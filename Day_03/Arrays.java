// Maximum element in an array
class Arrays {
    public static void main(String[] args) {
        int arr[] = {100,200,-30,500,12,6};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

// Sum of elements in an array
class Arrays {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            }
        System.out.println(sum);
    }
}

// Second largest in an array
class Arrays {
    public static void main(String[] args) {
        int arr[] = {10,20,30,50,70};
        int large = 0;
        int sl = 0;
        for(int i=0;i<arr.length;i++){
            if(large<arr[i]){
                sl = large;
                large = arr[i];
            if(sl<arr[i] && arr[i]!=large){
                    sl = arr[i];
            }
            }
        }
        System.out.println(large);
        System.out.println(sl);
    }
}


//Searching an element in an array
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int arr[] = {10,20,30,50,70};
        Scanner sc = new Scanner(System.in);
        boolean keyfound = false;
        int key = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println(i);
                keyfound = true;
                break;
        }
        }
        if (keyfound==false){
            System.out.println("Key not found");
        }
        sc.close();
    }
}
