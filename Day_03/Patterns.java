//Increasing number pattern
class Patterns{
        int n = 5;
        int var = 1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=var;j++){
                System.out.print(j);
            }
            System.out.println();
            var++;
        }
}


//Increasing repeated number pattern
class Patterns{
    public static void main(String[] args) {
       int n = 5;
        int var1 = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(var1);
            }
            System.out.println();
            var1++;
        }
    }
}
