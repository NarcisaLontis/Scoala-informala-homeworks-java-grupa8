package siit.gr8.narci.milestone;

import java.util.ArrayList;

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

    public float getGreenBonusProgramBudget ( ) {
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


    // FEV7 - Green Bonus Program grants the 10000€ to the dealership, if there is still money in the budget. There is a limit of 1000 cars per year (i.e 10mil € budget).


    public void programGrantsGreenBonus ( Dealership dealership, GreenBonusProgram greenBonusProgram ) {

            if (dealership.getRequestForBonus ()) {
            if (getGreenBonusProgramBudget () >= 10000) {
                if (getCarsPerYear () <= 1000) {
                    System.out.println ( "Dealership budget before receiving the green Bonus: "+dealership.getDealershipBudget ()+
                            " and Green Bonus Program budget before giving the bonus: "+greenBonusProgram.getGreenBonusProgramBudget () );

                 dealership.setDealershipBudget(dealership.getDealershipBudget() + 10000);
                 greenBonusProgram.setGreenBonusProgramBudget(greenBonusProgram.getGreenBonusProgramBudget() - 10000);

                 System.out.println ( "Dealership budget after receiving the green Bonus: "+dealership.getDealershipBudget ());


                } else {
                    System.out.println ( "Program has reach the limit of cars." );
                    setNoMoreBonuses ( true );
                }
            } else {
                System.out.println ( "There are no more money in the budget for bonuses" );
                setNoMoreBonuses ( true );
            }
        }
        }
    }




