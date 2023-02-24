import java.util.ArrayList;
import java.util.Collection;

public class SnakeCage implements AnimalCage<Snake> {

    private int levelDirty;
    private ArrayList snakes;

    public SnakeCage() {
        snakes = new ArrayList<Snake>();
    }

    public SnakeCage(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }


    @Override
    public int addAnimalINCage(Snake animal) {
        this.snakes.add(animal);
        return snakes.size();
    }

    // @Override
    // public String getFeedToCage(int countPiecesOfMeat){
    //     double PieceOfMetFOrOneLion = countPiecesOfMeat / (snakes.size());
    //     for (Snake an : snakes) {
    //         an = an.feed(10);
    //     }
    //     return "Каждый лев получил по " + PieceOfMetFOrOneLion + " кусков мяса!"; 
    // }

    @Override
    public String ClearCage(int levelDirty) {
        levelDirty = 0;
        return "Клетка отчищена";
    }


    

    // @Override
    // public Animal getFirstAnimal(){
    //     for (int i = 0; i < 1 ; i++) {
    //         return (Animal)snakes.get(0);
    //     }
    // }


}