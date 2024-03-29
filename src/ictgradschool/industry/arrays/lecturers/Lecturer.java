package ictgradschool.industry.arrays.lecturers;

public class Lecturer {

    // instance variables
    private String name;
    private int staffId;
    private String[] papers;
    private boolean onLeave;
    
    public Lecturer(String name, int staffId, String[] papers, boolean onLeave) {
        //  Complete this constructor method
        this.name=name;
        this.staffId=staffId;
        this.onLeave=onLeave;
        this.papers = new String[papers.length];
        for (int i = 0; i < papers.length; i++) {
            this.papers[i]=papers[i];
        }
    }
    
    //  Insert getName() method here

    public String getName() {
        return name;
    }

    //  Insert setName() method here

    public void setName(String name) {
        this.name = name;
    }

    //  Insert getStaffId() method here

    public int getStaffId() {
        return staffId;
    }

    //  Insert setStaffId() method here

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    //  Insert getPapers() method here

    public String[] getPapers() {
        return papers;
    }

    //  Insert setPapers() method here

    public void setPapers(String[] papers) {
        this.papers = papers;
    }

    //  Insert isOnLeave() method here

    public boolean isOnLeave() {
        return onLeave;
    }

    //  Insert setOnLeave() method here

    public void setOnLeave(boolean onLeave) {
        this.onLeave = onLeave;
    }

    //  Insert toString() method here
    public String toString(){

        return "id:"+staffId + " " + name + " is teaching " + papers.length + " papers.";
    }
    
    //  Insert teachesMorePapersThan() method here
    public boolean teachesMorePapersThan(Lecturer other){
        return other.papers.length < this.papers.length;
    }

}


