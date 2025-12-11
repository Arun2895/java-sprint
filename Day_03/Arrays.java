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


