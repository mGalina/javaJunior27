package lesson14;

import java.util.HashMap;
import java.util.Map;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int count) {
        if (products.containsKey(product)) {
            products.put(product, count + products.get(product));
        } else {
            products.put(product, count);
        }
    }

    public void getProduct(String product, int count) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет!!!");
            return;
        }
        if (products.get(product) < count) {
            System.out.println("Такого продукта недостаточно!!!");
            return;
        }
        if (products.get(product) == count) {
            products.remove(product);
            return;
        }
        products.put(product, products.get(product) - count);
    }

    public void printAllProduct() {
        //1 способ
//        for (String key : products.keySet()) {
//            System.out.println(key + " - " + products.get(key));
//        }
        //2 способ
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public boolean canCook(Receipt receipt) {
        // receipt.getIngridients()
        // products

        for (String ingridient : receipt.getIngridients().keySet()) {
            if (!products.containsKey(ingridient)) {
                System.out.println("Нет такого продукта: " + ingridient);
                return false;
            }
            if (products.get(ingridient) < receipt.getIngridients().get(ingridient)) {
                System.out.println("Не хватает продукта: " + ingridient);
                return false;
            }
        }
        return true;
    }
}
