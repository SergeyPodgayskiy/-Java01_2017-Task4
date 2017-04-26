package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class RunicStone extends Treasure {
    private String title;
    private String type;
    private short amountRune;
    private String engravedRune;
    private String runeTranslation;
    private double price;

    public RunicStone() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public short getAmountRune() {
        return amountRune;
    }

    public void setAmountRune(short amountRune) {
        this.amountRune = amountRune;
    }

    public String getEngravedRune() {
        return engravedRune;
    }

    public void setEngravedRune(String engravedRune) {
        this.engravedRune = engravedRune;
    }

    public String getRuneTranslation() {
        return runeTranslation;
    }

    public void setRuneTranslation(String runeTranslation) {
        this.runeTranslation = runeTranslation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RunicStone)) return false;
        if (!super.equals(o)) return false;

        RunicStone that = (RunicStone) o;

        if (getAmountRune() != that.getAmountRune()) return false;
        if (Double.compare(that.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) return false;
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;
        if (getEngravedRune() != null ? !getEngravedRune().equals(that.getEngravedRune()) : that.getEngravedRune() != null)
            return false;
        return getRuneTranslation() != null ? getRuneTranslation().equals(that.getRuneTranslation()) : that.getRuneTranslation() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (int) getAmountRune();
        result = 31 * result + (getEngravedRune() != null ? getEngravedRune().hashCode() : 0);
        result = 31 * result + (getRuneTranslation() != null ? getRuneTranslation().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "RunicStone{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", amountRune=" + amountRune +
                ", engravedRune='" + engravedRune + '\'' +
                ", runeTranslation='" + runeTranslation + '\'' +
                ", price=" + price +
                '}';
    }
}
