package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Bow extends Treasure {
    private String title;
    private String type;
    private double size;
    private String typeArrow;
    private short amountArrow;
    private double damage;
    private double price;

    public Bow() {
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

    public String getTypeArrow() {
        return typeArrow;
    }

    public void setTypeArrow(String typeArrow) {
        this.typeArrow = typeArrow;
    }

    public short getAmountArrow() {
        return amountArrow;
    }

    public void setAmountArrow(short amountArrow) {
        this.amountArrow = amountArrow;
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
        if (!(o instanceof Bow)) return false;
        if (!super.equals(o)) return false;

        Bow bow = (Bow) o;

        if (Double.compare(bow.getSize(), getSize()) != 0) return false;
        if (getAmountArrow() != bow.getAmountArrow()) return false;
        if (Double.compare(bow.getDamage(), getDamage()) != 0) return false;
        if (Double.compare(bow.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(bow.getTitle()) : bow.getTitle() != null) return false;
        if (getType() != null ? !getType().equals(bow.getType()) : bow.getType() != null) return false;
        return getTypeArrow() != null ? getTypeArrow().equals(bow.getTypeArrow()) : bow.getTypeArrow() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getTypeArrow() != null ? getTypeArrow().hashCode() : 0);
        result = 31 * result + (int) getAmountArrow();
        temp = Double.doubleToLongBits(getDamage());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Bow{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", typeArrow='" + typeArrow + '\'' +
                ", amountArrow=" + amountArrow +
                ", damage=" + damage +
                ", price=" + price +
                '}';
    }
}
