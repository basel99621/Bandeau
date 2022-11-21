package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet {
    double angle =Math.PI/6;
    public Rotation(){
    }
    public Rotation (double angle){
    }
    public void animation (Bandeau b){
        double start =Math.PI/2;
        for (int i=0; i<10; i++) {
            b.setRotation(start+i*angle);
            b.sleep(100);
        }

    }
}
