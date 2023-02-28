package Models;

import java.sql.SQLOutput;
import java.util.LinkedList;

public class Repo {
    private LinkedList<Toy> repo_prise = new LinkedList<Toy>();
    private LinkedList<Toy> shop = new LinkedList<Toy>();

    public void prise_add(Toy toy) {
        repo_prise.add(toy);
    }

    public void shop_add(Toy toy) {
        System.out.println("Adding winner toy to the list..");
        shop.add(toy);
    }

    public void lottery() {
        for (Toy t : shop) {
            double stake = Math.random();
            double win = Math.random();
            System.out.println("stake = " + stake+"\nwin = " + win);
            System.out.println("chance=" + t.getOdds_toy() / 2);
            if ((Math.max(win, stake) - Math.min(win, stake)) < t.getOdds_toy() / 2) {
                System.out.println("Congratulations! You win the prise - " + t.getToy_name());
                prise_add(t);
            }
        }
    }

    public boolean award(){
        if(!repo_prise.isEmpty()){
            Toy t = repo_prise.poll();
            System.out.println("You win the prise!! " + t);
            t.desAmount_toy();
            return true;
        }
        else {
            System.out.println("Oh no! There are no prises left for you((");
            return false;
        }
    }
}
