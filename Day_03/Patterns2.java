//Increasing numerical pattern
class Patterns2 {
    public static void main(String[] args) {
        int n = 5;
        int var1 = 1;
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=var1;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
            var1++;
        }
    }
}

// Hollow rectangular pattern
class Patterns2 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Binary triangular increasing pattern
class Patterns2 {
    public static void main(String[] args) {
        int n = 5;
        int var1 = 1;
        for(int i=0;i<n;i++){
            int start;
            if (i%2 == 0){
                start = 1;
            }
            else{
                start = 0;
            }
            for(int j=0;j<var1;j++){
                System.out.print(start + " ");
                start = 1 - start;
            }
        System.out.println();
        var1++;
        }
    }
}


// Pyramid pattern
class Patterns2 {
    public static void main(String[] args) {
        int n = 5;
        int var1 = 1;
        int spvar = n-1;
        for(int i=0;i<n;i++){
            for(int k = spvar;k>0;k--){
                System.out.print(" ");
            }
            for(int j=0;j<var1;j++){
                System.out.print("*");
            }
        System.out.println();
        var1 = var1 + 2;
        spvar--;
        }
    }
}

