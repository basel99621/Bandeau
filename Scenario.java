package exemple;

import bandeau.Bandeau;
import java.util.List;
import java.util.ArrayList;

public class Scenario {
    public void addAnimation (Effet effet, int nombreDerepetition){
        Repetition repetition=new Repetition( effet, this,nombreDerepetition);
repetitions.add(repetition);
    }
    public void ubdateAnimation (Effet effet, int nombreDerepetition){

    }
    public void cpmmenceAnimation (Bandeau b){

    }
    List <Repetition> repetitions;
    public Scenario(){
        this.repetitions=new ArrayList<>();
    }
    public void strat (Bandeau b){
        for (Repetition repetetion:repetitions){
           for (int i=0; i<repetetion.getNombrerRepetition(); i++){
             repetetion.getEffet().animation(b);
              b.sleep(500);
            }
        }
    }

}
