//MULIPLE INHERITANCE using INTERFACE
interface Computer {

    void checkstatus();

}

interface  Laptop {

    void checkstatus();
}

class Mobile implements Computer, Laptop{
    @Override
    public void checkstatus(){
        System.out.println("System in Stock");

    }
}

class MultiInheritance {
    public static void main(String[] args) {

        Laptop l1= new Mobile();
        Computer c1= new Mobile();

        l1.checkstatus();
        c1.checkstatus();
    }
}
