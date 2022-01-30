package lesson8;

public class Otziv {
    private User user;
    private int rate;
    private String text;

    public Otziv() {
    }

    public Otziv(User user, int rate, String text) {
        this.user = user;
        this.rate = rate;
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
