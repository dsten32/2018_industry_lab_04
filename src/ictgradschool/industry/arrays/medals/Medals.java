package ictgradschool.industry.arrays.medals;

public class Medals {

    // Constants
    public static final int GOLD_VALUE = 3;
    public static final int SILVER_VALUE = 2;
    public static final int BRONZE_VALUE = 1;

    // Instance variables:
    
    private String countryName; // name of country
    private int golds;   // number of gold medals
    private int silvers;  // number of silver medals
    private int bronzes;  // number of bronze medals
    
    
    public Medals(String country,int golds,int silvers,int bronzes) {
        //  constructor method to initialize the instance variables
        // Parameters are in the order: country, golds, silvers, bronzes
        this.countryName=country;
        this.golds=golds;
        this.silvers=silvers;
        this.bronzes=bronzes;
    }


    public String getCountryName() {
        //  accessor method to return the country name instance variable
        return countryName;
    }
    
    public void setCountryName(String countryName) {
        //  mutator method to set the country name instance variable
        this.countryName=countryName;
    }
    
    public boolean isHigherThan(Medals other) {
        // Compare the other Medals object with this one.
        // The other Medals object is passed in as a parameter
        // return true if the current Medals object is higher (in terms of medals value)
        //  than the other.
        int medalValue = golds * GOLD_VALUE + silvers * SILVER_VALUE + bronzes * BRONZE_VALUE;

        int otherMedalValue = other.golds * GOLD_VALUE
                + other.silvers * SILVER_VALUE
                + other.bronzes * BRONZE_VALUE;

        return medalValue > otherMedalValue;
    }
    
    public boolean hasMoreGoldMedalsThan(Medals other) {
        //  Method that returns true if this country has more gold medals than the other.
        // Otherwise it returns false.
        boolean moreGolds = other.golds<this.golds;

        return moreGolds;
    }
    
    
    public String toString() {
        //  return a String representing the instance variables formatted as per the hand-out.
        String output = countryName + " has " + golds + " gold medals, " + silvers + " silver medals, " + bronzes + " bronze medals";
        return output;
    }

}

