package exemple;

import bandeau.Bandeau;

public class Clignotant extends Effet {
    public void animation (Bandeau b){
        String message=b.getMessage();
        b.setMessage("");
        b.sleep(1000);
        b.setMessage(message);
    }
}
