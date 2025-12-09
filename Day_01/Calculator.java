class Calculator {
    public static void main(String[]args){
        int a = 100;
        int b = 200;
        String operation = "add";

        switch(operation){
            case "add" -> {
                System.out.println("Addition: " + (a + b));
            }
            case "subtract" -> {
                System.out.println("Subtraction: " + (a - b));
            }
            case "multiply" -> {
                System.out.println("Multiplication: " + (a * b));
            }
            case "divide" -> {
                System.out.println("Division: " + (a / b));
            }
            case "modulus" -> {
                System.out.println("Modulus: " + (a % b));

            }

            default -> {
                System.out.println("Invalid Operation");

            }
            }
        }
    }
