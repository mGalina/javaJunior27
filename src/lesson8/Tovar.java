package lesson8;

import java.util.ArrayList;

public class Tovar {
    private int id;
    private String name;
    private int price;
    private Proizvoditel proizvoditel;
    private ArrayList<Otziv> otzivs = new ArrayList<>();

    public Tovar() {
    }

    public Tovar(int id, String name, int price, Proizvoditel proizvoditel) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.proizvoditel = proizvoditel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Proizvoditel getProizvoditel() {
        return proizvoditel;
    }

    public void setProizvoditel(Proizvoditel proizvoditel) {
        this.proizvoditel = proizvoditel;
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(ArrayList<Otziv> otzivs) {
        this.otzivs = otzivs;
    }

    public void addOtziv(Otziv otziv) {
        otzivs.add(otziv);
    }
}
