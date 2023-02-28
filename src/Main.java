import Models.Toy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LinkedList<Toy> toy_list = new LinkedList<Toy>();
        Toy toy1 = new Toy("Bear Teddy", 123, 0.3);
        Toy toy2 = new Toy("Huggy Wuggy", 56, 0.1);
        Toy toy3 = new Toy("Pyatachok", 78, 0.3);
        Toy toy4 = new Toy("Model Tesla", 94, 0.15);
        Toy toy5 = new Toy("Infinitynado", 12, 0.12);
        Toy toy6 = new Toy("Infinitynado", 12, 0.12);
        Toy toy7 = new Toy("Infinitynado++", 5, 0.12);
        Toy toy8 = new Toy("Infinitynado2", 88, 0.12);
        Toy toy9 = new Toy("Infinitynado5", 99, 0.12);
        System.out.println(toy3);
        toy_list.add(toy1);
        toy_list.add(toy2);
        toy_list.add(toy4);
        toy_list.add(toy5);
        toy_list.add(toy6);
        toy_list.add(toy7);
        toy_list.add(toy8);
        toy_list.add(toy9);

        Presenter pr = new Presenter();
        pr.start(toy_list);
    }
}