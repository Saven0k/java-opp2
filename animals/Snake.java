public class Snake extends Animal {

    private double lenBody;

    private static final float MAX_WEIGHT = 100;

    protected static final String TYPE = "Shake";


    public Snake(double lenBody, int age, int kolLimbs, double weight) {
        super(age, weight, kolLimbs);
        this.lenBody = lenBody;
    }

    public double getLenBody() {
        return lenBody;
    }

    public void setLenBody(double lenBOdy) {
        this.lenBody = lenBOdy;
    }


    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public float getMaxWeight() {
        return MAX_WEIGHT;
    }
}
