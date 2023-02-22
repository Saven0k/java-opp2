import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class WolfCage implements AnimalCage , Iterable<Wolf>{
    
    private List<Wolf> wolfs1;
    private  int levelDirty;
    private ArrayList wolfs;

    public WolfCage(){
        wolfs = new ArrayList<Wolf>();
    }

    public WolfCage(List<Wolf> wolfs){
        this.wolfs1 = wolfs;
    }

    public WolfCage(ArrayList<Wolf> wolfs){
        this.wolfs = wolfs;
    }


    @Override
    public int addAnimalINCage(Animal animal){
        wolfs.add((Wolf) animal);
        return wolfs.size();
    }

    // @Override
    // public String getFeedToCage(int countPiecesOfMeat){
    //     double PieceOfMetFOrOneLion = countPiecesOfMeat / (wolfs.size());
    //     for (Wolf an : wolfs) {
    //         an = an.feed(10);
    //     }
    //     return "Каждый лев получил по " + PieceOfMetFOrOneLion + " кусков мяса!"; 
    // }

    @Override
    public String ClearCage(int levelDirty){
        levelDirty = 0;
        return "Клетка отчищена";
    }

    // public Animal getFirstAnimal(){
    //     for (int i = 0; i < 1 ; i++) {
    //         return (Animal)wolfs.get(0);
    //     }
        
    // }

    public void sortWolfByAge(){
        Collections.sort(wolfs, new WolfComporator());
    }

    public Iterator<Wolf> iterator(){
        return new WolfIterator(wolfs);
    }
    

    

    
}
