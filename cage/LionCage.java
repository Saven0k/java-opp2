import java.util.ArrayList;

public class LionCage implements AnimalCage{
    
    private  int levelDirty;
    private ArrayList lions;

    public LionCage(){
        lions = new ArrayList<>();
    }

    public LionCage(ArrayList<Lion> lions){
        this.lions = lions;
    }


    @Override
    public int addAnimalINCage(Animal animal){
        lions.add((Lion) animal);
        return lions.size();
    }

    @Override
    public String getFeedToCage(int countPiecesOfMeat){
        double PieceOfMetFOrOneLion = countPiecesOfMeat / (lions.size());
        return "Каждый лев получил по " + PieceOfMetFOrOneLion + " кусков мяса!"; 
    }

    @Override
    public String ClearCage(int levelDirty){
        levelDirty = 0;
        return "Клетка отчищена";
    }

    @Override
    public String getFirstAnimal(){
        for (int i = 0; i < 1 ; i++) {
            return lions.get(0).toString();
        }
    }

    @Override
    public String toSting(){
        return "LionCage{" +    
                "lions=" + lions +
                ", clean=" + levelDirty +
                '}';
    }
}