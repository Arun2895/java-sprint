class Computer {

    String brand;

    public void compbrand(String compbrand) {
        this.brand=compbrand;
    }

    public void powerOn() {
        System.out.println("Computer is ON");
    }

    public void gaming() {
        System.out.println("Can play games");
    }
}

// CHILD / SUB CLASS (inherits Computer)(Single)
class Laptop extends Computer {

    public void portability() {
        System.out.println("Laptop is portable");
    }
}

//// CHILD / SUB CLASS (inherits Computer)(Multilevel)
class Mac extends Laptop{

    public void OS(){
        System.out.println("Run in MacOS");
    }
}

// Using inheritance
class Inheritance {
    public static void main(String[] args) {
        Laptop lap = new Laptop();   // child object

        lap.compbrand("Asus");
        // accessing parent class property
        System.out.println(lap.brand);

        // accessing parent class method
        lap.powerOn();
        lap.gaming();

        // accessing child class method
        lap.portability();

        Mac apple =  new Mac();
        
        apple.portability();
    }
}

