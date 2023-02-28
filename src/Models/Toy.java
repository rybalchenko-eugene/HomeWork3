package Models;

public class Toy {
    static int count = 0;
    private int id_toy = 0;
    private String toy_name;
    private int amount_toy;
    private double odds_toy;

    public Toy(String toy_name, int amount_toy, double odds_toy) {
        this.id_toy = count++;
        this.toy_name = toy_name;
        this.amount_toy = amount_toy;
        this.odds_toy = odds_toy;
    }

    // Getters & Setters
    public int getId_toy() {
        return id_toy;
    }

    public String getToy_name() {
        return toy_name;
    }

    public int getAmount_toy() {
        return amount_toy;
    }

    public double getOdds_toy() {
        return odds_toy;
    }

    public void setOdds_toy(float odds_toy) {
        this.odds_toy = odds_toy;
    }

    public void desAmount_toy() {
        this.amount_toy = this.amount_toy - 1;
    }

    @Override
    public String toString() {
        return toy_name + ", id = " + id_toy + ", amount left = " + amount_toy;
    }
}
