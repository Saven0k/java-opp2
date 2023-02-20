import java.util.ArrayList;

public class WolfCage implements AnimalCage {
    
    private  int levelDirty;
    private ArrayList wolfs;

    public WolfCage(){
        wolfs = new ArrayList<>();
    }

    public WolfCage(ArrayList<Wolf> wolfs){
        this.wolfs = wolfs;
    }


    @Override
    public int addAnimalINCage(Animal animal){
        wolfs.add((Lion) animal);
        return wolfs.size();
    }

    @Override
    public String getFeedToCage(int countPiecesOfMeat){
        double PieceOfMetFOrOneLion = countPiecesOfMeat / (wolfs.size());
        return "Каждый лев получил по " + PieceOfMetFOrOneLion + " кусков мяса!"; 
    }

    @Override
    public String ClearCage(int levelDirty){
        levelDirty = 0;
        return "Клетка отчищена";
    }

    public String getFirstAnimal(){
        for (int i = 0; i < 1 ; i++) {
            return wolfs.get(0).toString();
        }
        
    }
}
