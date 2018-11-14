package ictgradschool.industry.arrays.mobilephones;

public class MobilePhone {

    //  Declare the 3 instance variables:
    private String brand;
    private String model;
    private double price;
    
    public MobilePhone(String brand, String model, double price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    //  Uncomment these methods once the corresponding instance variable has been declared.
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    //  Insert getModel() method here

    public String getModel() {
        return model;
    }

    //  Insert setModel() method here

    public void setModel(String model) {
        this.model = model;
    }

    //  Insert getPrice() method here

    public double getPrice() {
        return price;
    }

    //  Insert setPrice() method here

    public void setPrice(double price) {
        this.price = price;
    }

    //  Insert toString() method here

    @Override
    public String toString() {
        return brand + " " + model + " which cost $" + price;
    }

    //  Insert isCheaperThan() method here
    public boolean isCheaperThan(MobilePhone other){
        return other.price>this.price;
    }
    
    //  Insert equals() method here
    public boolean equals(Object other){
        if (other instanceof MobilePhone){
            MobilePhone otherM = (MobilePhone) other;
            return this.brand.equals(otherM.getBrand())
                    && this.model.equals(otherM.getModel())
                    && (Math.abs(this.price - otherM.getPrice())<0.001);
        }
        return false;
    }


}


