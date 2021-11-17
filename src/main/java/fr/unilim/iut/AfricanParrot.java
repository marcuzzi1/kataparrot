package fr.unilim.iut;

public class AfricanParrot extends Parrot{

    private static final double LOAD_FACTOR = 9.0;
    private int numberOfCoconuts = 0;

    public AfricanParrot(int numberOfCoconuts) {
        super(ParrotTypeEnum.AFRICAN, 0, false);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - LOAD_FACTOR * this.numberOfCoconuts);
    }

}
