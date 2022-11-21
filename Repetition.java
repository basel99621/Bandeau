package exemple;

import bandeau.Bandeau;

public class Repetition {
    private Effet effet;
    private Scenario scenario;
    int repetetion=1;
    private int repetition;
    public Repetition(Effet effet,Scenario scenario,int rpetition ){
        this.effet=effet;
        this.scenario=scenario;
        this.repetition=repetition;
    }

    public int getNombrerRepetition(){
        return repetition;
    }
    public Effet getEffet(){
        return effet;
    }

    public void setEffet(){
        this.effet=effet;
    }

}
