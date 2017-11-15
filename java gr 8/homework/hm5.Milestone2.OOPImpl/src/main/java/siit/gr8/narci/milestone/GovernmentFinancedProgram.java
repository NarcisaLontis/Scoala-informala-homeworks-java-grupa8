package siit.gr8.narci.milestone;

/**
 * class  GovernmentFinancedProgram
 *
 * @author Narcisa Lontis
 */

public class GovernmentFinancedProgram {

    float fixedBudget = 10000000;
    float greenBonus = 10000;
    String purchaseHistory;
    String customerNameHistory;
    String dealearshipNameHistory;
    String evCarModelHistory;

    public GovernmentFinancedProgram ( ) {
        this.fixedBudget = fixedBudget;
        this.greenBonus = greenBonus;
    }

    public float getFixedBudget ( ) {
        return this.fixedBudget;
    }

    public float getGreenBonus ( ) {
        return this.greenBonus;
    }

}
