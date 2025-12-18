//POLYMORPHISM

// PARENT / SUPER CLASS
class Computer {

    public void portability() {
        System.out.println("Computer is not portable");
    }

}

// CHILD / SUB CLASS (inherits Computer)
class Laptop extends Computer {

    //Method Overriding
    public void portability() {
        System.out.println("Laptop is portable");
    }

    //Method Overloading
    public void portability(String port) {
        System.out.println("Laptop portable type " + port);
    }

}

// CHILD / SUB CLASS (inherits Computer)
class Mobile extends Computer{

    public void portability(){
        System.out.println("Handheld");
    }
}

class Polymorphism{
    public static void main(String[] args) {

        Computer C1 = new Computer(); 
        C1.portability();

        Laptop L1 = new Laptop();
        L1.portability();
        L1.portability("Ultra portable");

        Mobile M1 = new Mobile();
        M1.portability();
        
    }
}
