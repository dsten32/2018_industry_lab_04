package ictgradschool;

public class Pattern {
    private int numberOfCharacters;
    private char character;

    public Pattern(int num, char character){
        this.numberOfCharacters=num;
        this.character=character;
    }

    public int getNumberOfCharacters(){
        return numberOfCharacters;
    }

    public void setNumberOfCharacters(int num){
        numberOfCharacters=num;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
