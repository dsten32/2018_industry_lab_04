package ictgradschool;

public class Pattern {
    private int numberOfCharacters;
    private String character;

    public Pattern(int num, String character){
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
        String pattern="";
        String[] charPattern=new String[numberOfCharacters];

        for (int i = 0; i < charPattern.length; i++) {
            charPattern[i]=character;
        }
        for (int i = charPattern.length - 1; i >= 0; i--) {
            pattern+=charPattern[i];
        }
        //pattern=(String)charPattern;
        return pattern;
    }
}
