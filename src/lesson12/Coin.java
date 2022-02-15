package lesson12;

public class Coin implements Comparable<Coin>{
    private double diametr;
    private String metall;
    private int year;
    private int nominal;

    public Coin() {
    }

    public Coin(double diametr, String metall, int year, int nominal) {
        this.diametr = diametr;
        this.metall = metall;
        this.year = year;
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diametr=" + diametr +
                ", metall='" + metall + '\'' +
                ", year=" + year +
                ", nominal=" + nominal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (Double.compare(coin.diametr, diametr) != 0) return false;
        if (year != coin.year) return false;
        if (nominal != coin.nominal) return false;
        return metall != null ? metall.equals(coin.metall) : coin.metall == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(diametr);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metall != null ? metall.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + nominal;
        return result;
    }

    @Override
    public int compareTo(Coin o) {
        // this - первая монета
        // о - вторая монета

        if (this.nominal != o.nominal) {
            return o.nominal - this.nominal;
        }
        if (this.year != o.year) {
            return o.year - this.year;
        }
        if (! this.metall.equals(o.metall)){
            return o.metall.compareTo(this.metall);
        }

        return Double.compare(o.diametr, this.diametr);
    }
}
