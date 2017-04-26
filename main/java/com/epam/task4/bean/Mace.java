package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Mace extends Treasure {
    private String title;
    private String type;
    private double size;
    private double damage;
    private double price;

    public Mace() {
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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
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
        if (!(o instanceof Mace)) return false;
        if (!super.equals(o)) return false;

        Mace mace = (Mace) o;

        if (Double.compare(mace.getSize(), getSize()) != 0) return false;
        if (Double.compare(mace.getDamage(), getDamage()) != 0) return false;
        if (Double.compare(mace.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(mace.getTitle()) : mace.getTitle() != null) return false;
        return getType() != null ? getType().equals(mace.getType()) : mace.getType() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getDamage());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Mace{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", damage=" + damage +
                ", price=" + price +
                '}';
    }
}
