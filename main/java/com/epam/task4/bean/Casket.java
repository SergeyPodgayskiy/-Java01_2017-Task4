package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Casket extends Treasure {
    private double size;
    private double weight;
    private boolean hasLock;
    private double price;

    public Casket() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isHasLock() {
        return hasLock;
    }

    public void setHasLock(boolean hasLock) {
        this.hasLock = hasLock;
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
        if (!(o instanceof Casket)) return false;
        if (!super.equals(o)) return false;

        Casket casket = (Casket) o;

        if (Double.compare(casket.getSize(), getSize()) != 0) return false;
        if (Double.compare(casket.getWeight(), getWeight()) != 0) return false;
        if (isHasLock() != casket.isHasLock()) return false;
        return Double.compare(casket.getPrice(), getPrice()) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isHasLock() ? 1 : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Casket{" +
                "size=" + size +
                ", weight=" + weight +
                ", hasLock=" + hasLock +
                ", price=" + price +
                '}';
    }
}
