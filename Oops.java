// Only CLASS with attributes and methods
class Computer {

    // attributes
    String pc_comp;
    String pc_type;
    String pc_brand;
    double pc_price;
    int pc_warranty;


    //NON-PARAMETERIZED (default) constructor
    Computer() {
        pc_comp = "Not Assigned";
        pc_type = "Not Assigned";
        pc_brand = "Not Assigned";
        pc_price = 0;
        pc_warranty = 0;
    }

    //PARAMETERIZED constructor
    Computer(String comp, String type, String brand, double price, int warranty) {
        pc_comp = comp;
        pc_type = type;
        pc_brand = brand;
        pc_price = price;
        pc_warranty = warranty;
    }


    // methods
    void gaming() {
        System.out.println("Play games");
    }

    void editing() {
        System.out.println("Video Editing");
    }

    void production() {
        System.out.println("Productivity");
    }

    void daily() {
        System.out.println("Daily Tasks");
    }
}


// Only OBJECT creation and usage
class Oops {
    public static void main(String[] args) {

        // creating objects (NO constructor)
        Computer pc1 = new Computer();
        Computer pc2 = new Computer();

        // assigning values using object
        pc1.pc_comp = "CPU";
        pc1.pc_type = "Professional";
        pc1.pc_brand = "Lenovo";
        pc1.pc_price = 40000;
        pc1.pc_warranty = 3;

        pc2.pc_comp = "GPU";
        pc2.pc_type = "Gaming";
        pc2.pc_brand = "MSI";
        pc2.pc_price = 80000;
        pc2.pc_warranty = 5;

        //Using NON-PARAMETERIZED constructor
        Computer pc3 = new Computer();
        System.out.println(pc3.pc_comp);   // Not Assigned

        //Using PARAMETERIZED constructor
        Computer pc4 = new Computer("GPU", "Gaming", "MSI", 85000, 5);

        System.out.println(pc4.pc_comp);   // GPU
        System.out.println(pc4.pc_brand);  // MSI

        pc3.daily();
        pc4.gaming();
    }
}


