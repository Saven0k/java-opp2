import java.util.ArrayList;
import java.util.Collections;

public class LionCage implements AnimalCage{
    
    private  int levelDirty;
    private ArrayList lions;

    public LionCage(){
        lions = new ArrayList<Lion>();
    }

    public LionCage(ArrayList<Lion> lions){
        this.lions = lions;
    }


    @Override
    public int addAnimalINCage(Animal animal){
        lions.add((Lion) animal);
        return lions.size();
    }

    // @Override
    // public String getFeedToCage(int countPiecesOfMeat){
    //     double PieceOfMetFOrOneLion = countPiecesOfMeat / (lions.size());
    //     for (Wolf an : lions) {
    //         an = an.feed(10);
    //     }
    //     return "Каждый лев получил по " + PieceOfMetFOrOneLion + " кусков мяса!"; 
    // }

    @Override
    public String ClearCage(int levelDirty){
        levelDirty = 0;
        return "Клетка отчищена";
    }

    // @Override
    // public Animal getFirstAnimal(){
    //     for (int i = 0; i < 1 ; i++) {
    //         return (Animal)lions.get(0);
    //     }
    // }

    public void sortlions(){
        Collections.sort(lions);
    }

    public ArrayList<Lion> getLions(){
        return lions;
    }

    public void sortLionsByManeVolume(){
        Collections.sort(lions, new LionComporator());
    }
    @Override
    public String toString(){
        return " LionCage{" +
            " lions = "+ lions +
            '}';
    }
    
}