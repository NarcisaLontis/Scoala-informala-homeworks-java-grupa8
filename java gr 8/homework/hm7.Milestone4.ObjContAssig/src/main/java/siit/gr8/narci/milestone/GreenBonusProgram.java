package siit.gr8.narci.milestone;

public class GreenBonusProgram {


    private float budget;
    private int carsPerYear;

    // boolean used to send notification that are noMoreBonuses - true/false
    private boolean noMoreBonuses;

    public GreenBonusProgram ( float budget, int carsPerYear ) {
        this.budget = budget;
        this.carsPerYear = carsPerYear;
        this.noMoreBonuses = noMoreBonuses;
    }


    // create getter and setter methods for GreenBonusProgram

    public float getGreenBonusProgramBudge ( ) {
        return budget;
    }

    public void setGreenBonusProgramBudget ( float buget ) {
        this.budget = budget;
    }

    public int getCarsPerYear ( ) {
        return carsPerYear;
    }

    public void setCarsPerYear ( int carsPerYear ) {
        this.carsPerYear = carsPerYear;
    }

    public boolean isNoMoreBonuses ( ) {
        return noMoreBonuses;
    }

    public void setNoMoreBonuses ( boolean noMoreBonuses ) {
        this.noMoreBonuses = noMoreBonuses;
    }

}



