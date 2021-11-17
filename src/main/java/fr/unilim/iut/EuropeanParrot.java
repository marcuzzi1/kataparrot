package fr.unilim.iut;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot() {
        super(ParrotTypeEnum.EUROPEAN, 0, false);
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }
}
