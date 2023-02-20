import java.util.jar.Attributes.Name;

public class Lion  extends Animal{
    
    private double maneVolume;

    protected static final String TYPE = "Lion";

    private static  final float MAX_WEIGHT = 100;


    public Lion(double maneVolume, int age, double weight, int kolLimbs){
        super(age, weight, kolLimbs);
        this.maneVolume = maneVolume;
    }

    public double getManeVolume(){
        return maneVolume;
    }
    public void setManeVolume(double maneVolume){
        this.maneVolume = maneVolume;
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
