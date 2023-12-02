package spireMapOverhaul.abstracts;

import com.megacrit.cardcrawl.core.AbstractCreature;

public abstract class LambdaPower extends AbstractSMOPower {
    public LambdaPower(String ID, String name, PowerType powerType, boolean isTurnBased, AbstractCreature owner, int amount, boolean canGoNegative) {
        super(ID, name, powerType, isTurnBased, owner, amount);
        this.canGoNegative = canGoNegative;
    }

    public abstract void updateDescription();
}
