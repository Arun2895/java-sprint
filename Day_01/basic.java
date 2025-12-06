class basic{
    public static void main(String[]args){

        // Conditional Statements (if-else)
        int var1 = 10;
        int var2 = 20;
        if (var1<=var2){
            System.out.println("var1 is Greater than var2");
        }
        else{
            System.out.println("var2 is Lesser than var1");
        }
        
        // Arithmetic Operations
        int num1 = 5;
        int num2 = 15;
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1/num2;
        int mod = num1 % num2;
        System.out.println("Subtraction: " + sub);
        System.out.println("Sum: " + sum);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
 
        // Increment and Decrement Operators
        int a = 10;
        System.out.println(a++); // 10
        System.out.println(++a); // 12
        System.out.println(a--); // 12
        System.out.println(--a); // 10

        // Logical Operators
        int c1 = 5;
        int c2 = 10;
        if (c1 < 10 && c2 > 5){
            System.out.println("Both conditions are true");
        }

    }
}
