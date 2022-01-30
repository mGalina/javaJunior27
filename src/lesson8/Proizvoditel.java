package lesson8;

public class Proizvoditel {
    private String name;
    private String pathToImage;

    public Proizvoditel() {
    }

    public Proizvoditel(String name, String pathToImage) {
        this.name = name;
        this.pathToImage = pathToImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }
}
