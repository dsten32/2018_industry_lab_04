package ictgradschool.industry.arrays.mobilephones;

public class MobilePhone {

    // TODO Declare the 3 instance variables:
    private String brand;
    private String model;
    private double price;
    
    public MobilePhone(String brand, String model, double price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    // TODO Uncomment these methods once the corresponding instance variable has been declared.
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    // TODO Insert getModel() method here

    public String getModel() {
        return model;
    }

    // TODO Insert setModel() method here

    public void setModel(String model) {
        this.model = model;
    }

    // TODO Insert getPrice() method here

    public double getPrice() {
        return price;
    }

    // TODO Insert setPrice() method here

    public void setPrice(double price) {
        this.price = price;
    }

    // TODO Insert toString() method here

    @Override
    public String toString() {
        return brand + " " + model + " which cost $" + price;
    }

    // TODO Insert isCheaperThan() method here
    public boolean isCheaperThan(MobilePhone other){
        return other.price>this.price;
    }
    
    // TODO Insert equals() method here
    public boolean equals(Object other){
        if (other instanceof MobilePhone){
            MobilePhone otherM = (MobilePhone) other;
            return this.brand==otherM.brand
                    && this.model==otherM.model
                    && this.price==otherM.price;
        }
        return false;
    }


}


