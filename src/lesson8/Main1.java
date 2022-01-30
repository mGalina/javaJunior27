package lesson8;

public class Main1 {
    public static void main(String[] args) {

        Proizvoditel dell = new Proizvoditel();
        dell.setName("DELL");
        dell.setPathToImage("https://st2.depositphotos.com/1064024/10769/i/600/depositphotos_107694484-stock-photo-little-boy.jpg");

        User user = new User();
        user.setName("Пришелец");
        user.setRate(160);
        user.setPathToAvatar("https://st2.depositphotos.com/1064024/10769/i/600/depositphotos_107694484-stock-photo-little-boy.jpg");

        Otziv otziv = new Otziv();
        otziv.setUser(user);
        otziv.setRate(5);
        otziv.setText("Отлично работает, буду советовать!");

        Tovar tovar = new Tovar();
        tovar.setId(456372829);
        tovar.setPrice(35000);
        tovar.setName("Ноутбук");
        tovar.setProizvoditel(dell);
        tovar.addOtziv(otziv);

        System.out.println();
    }
}
