package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Vase extends Treasure {
    private String title;
    private String type;
    private double volume;
    private boolean hasPicture;
    private double price;

    public Vase() {
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isHasPicture() {
        return hasPicture;
    }

    public void setHasPicture(boolean hasPicture) {
        this.hasPicture = hasPicture;
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
        if (!(o instanceof Vase)) return false;
        if (!super.equals(o)) return false;

        Vase vase = (Vase) o;

        if (Double.compare(vase.getVolume(), getVolume()) != 0) return false;
        if (isHasPicture() != vase.isHasPicture()) return false;
        if (Double.compare(vase.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(vase.getTitle()) : vase.getTitle() != null) return false;
        return getType() != null ? getType().equals(vase.getType()) : vase.getType() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        temp = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isHasPicture() ? 1 : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Vase{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                ", hasPicture=" + hasPicture +
                ", price=" + price +
                '}';
    }
}
