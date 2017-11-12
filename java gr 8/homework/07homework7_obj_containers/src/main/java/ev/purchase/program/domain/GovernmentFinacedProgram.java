package ev.purchase.program.domain;

import javafx.beans.binding.FloatExpression;
import javafx.beans.value.ObservableNumberValue;

/**
 * Created by Narci on 8/26/2017
 */

public class GovernmentFinacedProgram {

    float fixedBudget = 10000000;
    float greenBonus = 10000;


    public GovernmentFinacedProgram ( ) {
    }

    public float getFixedBudget ( ) {
        return this.fixedBudget;
    }


    public float getGreenBonus ( ) {

        return this.greenBonus;
    }

    public int getGreenBonus ( GreenBonus bonus ) {
        FloatExpression history = null;
        history.add ( (ObservableNumberValue) bonus );
        int bonusNumber = 0;
        bonusNumber++;
        fixedBudget += 10000;
        return 10000;
    }
}

