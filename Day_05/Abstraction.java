//ABSTRACT
abstract class Computer {

    String brand;
    double price;
    int warranty;

    //ABSTRACT METHODS (no body)
    abstract void checkstatus();
    abstract void checkwarranty();
}

class Laptop extends Computer {

    @Override
    void checkstatus() {
        System.out.println("System in stock");
    }

    @Override
    void checkwarranty() {
        System.out.println("Warranty is valid");
    }
}

class Abstraction{
    public static void main(String[] args) {

        Computer c = new Laptop();  // polymorphism with abstraction
        c.checkstatus();
        c.checkwarranty();
    }
}
