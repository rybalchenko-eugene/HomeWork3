import Models.Repo;
import Models.Toy;

import java.util.ArrayList;
import java.util.LinkedList;

public class Presenter {
    Repo repo = new Repo();
    public void start(LinkedList<Toy> toy_list){
        while (!toy_list.isEmpty())
            repo.shop_add(toy_list.pollLast());
        repo.lottery();
        System.out.println("Let's award first three winners. Unpack our prise fond...");
        for (int i = 0; i < 3; i++) {
            System.out.println("User #"+i+"...");
            if (!repo.award()) break;
        }
    }
}
