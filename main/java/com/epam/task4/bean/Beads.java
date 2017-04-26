package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Beads extends Treasure {
    private double length;
    private String material;
    private double weight;
    private double thikness;
    private double price;

    public Beads() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getThikness() {
        return thikness;
    }

    public void setThikness(double thikness) {
        this.thikness = thikness;
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
        if (!(o instanceof Beads)) return false;
        if (!super.equals(o)) return false;

        Beads beads = (Beads) o;

        if (Double.compare(beads.getLength(), getLength()) != 0) return false;
        if (Double.compare(beads.getWeight(), getWeight()) != 0) return false;
        if (Double.compare(beads.getThikness(), getThikness()) != 0) return false;
        if (Double.compare(beads.getPrice(), getPrice()) != 0) return false;
        return getMaterial() != null ? getMaterial().equals(beads.getMaterial()) : beads.getMaterial() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getThikness());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Beads{" +
                "length=" + length +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", thikness=" + thikness +
                ", price=" + price +
                '}';
    }
}
