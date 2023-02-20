import java.util.ArrayList;
public class main{
    public static void main(String[] args){
        Snake newSnake = new Snake(0.30,12 , 0, 0.120);
        ArrayList<Lion> lions = LionsFactory.createLions(10);
        LionCage lioncage = new LionCage(lions);
        System.out.println(lioncage);
        System.out.println(lioncage.getFeedToCage(25));
    }
}