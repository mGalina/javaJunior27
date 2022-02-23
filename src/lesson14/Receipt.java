package lesson14;

import java.util.HashMap;

public class Receipt {
    private String name;
    private HashMap<String, Integer> ingridients = new HashMap<>();

    public void addIngridients(String ingridient, int amount) {
        if (ingridients.containsKey(ingridient)) {
            ingridients.put(ingridient, amount + ingridients.get(ingridient));
        } else {
            ingridients.put(ingridient, amount);
        }
    }

    public HashMap<String, Integer> getIngridients() {
        return ingridients;
    }

    public void setIngridients(HashMap<String, Integer> ingridients) {
        this.ingridients = ingridients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
