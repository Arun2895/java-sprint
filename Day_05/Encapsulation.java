class Laptop {

    // Laptop class with private attributes
    private String laptopId;
    private String laptopModel;
    private double laptopPrice;
    private int laptopWarranty;

    public void setLaptopId(String id) {
        laptopId = id;
    }

    public void setLaptopModel(String model) {
        laptopModel = model;
    }

    public void setLaptopPrice(double price) {
        laptopPrice = price;
    }

    public void setLaptopWarranty(int warranty) {
        laptopWarranty = warranty;
    }

    // Public GETTER methods (read access)
    public String getLaptopId() {
        return laptopId;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    public int getLaptopWarranty() {
        return laptopWarranty;
    }
}


// Using encapsulated data
class Encapsulation {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();

        // setting values using setters
        l1.setLaptopId("LAP101");
        l1.setLaptopModel("HP Pavilion");
        l1.setLaptopPrice(72000);
        l1.setLaptopWarranty(2);

        // getting values using getters
        System.out.println(l1.getLaptopId());
        System.out.println(l1.getLaptopModel());
        System.out.println(l1.getLaptopPrice());
        System.out.println(l1.getLaptopWarranty());
    }
}

