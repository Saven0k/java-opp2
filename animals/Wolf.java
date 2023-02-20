public class Wolf  extends Animal{
        
    private double lenthTail; //глупо но хоть что то))

    protected static final String TYPE = "Wolf";

    private static  final float MAX_WEIGHT = 100;

    public Wolf(double lenthTail, int age, double weight, int kolLimbs){
        super(age, weight, kolLimbs);
        this.lenthTail = lenthTail;
    }

    public double getLengthTail(){
        return lenthTail;
    }
    public void setLengthTail(double lenthTail){
        this.lenthTail = lenthTail;
    }

    @Override
    public float getMaxWeight(){
        return MAX_WEIGHT;
    }

    @Override
    public String getType(){
        return TYPE;
    }
}
