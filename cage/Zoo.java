import java.util.ArrayList;
import java.util.Random;

public class Zoo {
    private AnimalCage<Wolf> WolfCage;

    private AnimalCage<Lion> LionCage;

    private AnimalCage<Snake> SnakeCage;

    public AnimalCage<Wolf> getWolfCage() {
        return WolfCage;
    }

    public void setWolfCage(AnimalCage<Wolf> wolfCage) {
        this.WolfCage = wolfCage;
    }


}
