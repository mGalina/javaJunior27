package lesson8;

public class User {
    private String name;
    private String pathToAvatar;
    private int rate;

    public User() {
    }

    public User(String name, String pathToAvatar, int rate) {
        this.name = name;
        this.pathToAvatar = pathToAvatar;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathToAvatar() {
        return pathToAvatar;
    }

    public void setPathToAvatar(String pathToAvatar) {
        this.pathToAvatar = pathToAvatar;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
