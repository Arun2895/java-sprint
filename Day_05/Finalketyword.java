final class Computer {

    public void portability() {
        System.out.println("Computer is not portable");
    }

}

// CHILD / SUB CLASS (inherits Computer)
class Laptop extends Computer {

    //Method Overriding
    public void portability() {
        super.portability();
        System.out.println("Laptop is portable");
    }
}

// CHILD / SUB CLASS (inherits Computer)
class Mobile extends Computer{

    public void portability(){
        System.out.println("Handheld");
    }
}

class finalkeyword{
    public static void main(String[] args) {

        Laptop L1 = new Laptop();
        L1.portability();

    }
}
