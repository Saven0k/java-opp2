import java.util.ArrayList;

import animals.*;
import cage.*;
import java.util.ArrayList;

public class LionsFactory {

    static public  ArrayList<Lion> createLions (int lionCount){
        ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++) {
            Lion lion = new Lion(5.5, 8, 900, 4);
            lionInCage.add(lion);
        }
        return lionInCage;
    }

}
