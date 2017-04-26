package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Sword extends Treasure {
    private String title;
    private String material;
    private double weight;
    private double length;
    private String type;
    private double bladeThikness;
    private double damage;
    private double price;

    public Sword() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBladeThikness() {
        return bladeThikness;
    }

    public void setBladeThikness(double bladeThikness) {
        this.bladeThikness = bladeThikness;
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
        if (!(o instanceof Sword)) return false;
        if (!super.equals(o)) return false;

        Sword sword = (Sword) o;

        if (Double.compare(sword.getWeight(), getWeight()) != 0) return false;
        if (Double.compare(sword.getLength(), getLength()) != 0) return false;
        if (Double.compare(sword.getBladeThikness(), getBladeThikness()) != 0) return false;
        if (Double.compare(sword.getDamage(), getDamage()) != 0) return false;
        if (Double.compare(sword.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(sword.getTitle()) : sword.getTitle() != null) return false;
        if (getMaterial() != null ? !getMaterial().equals(sword.getMaterial()) : sword.getMaterial() != null)
            return false;
        return getType() != null ? getType().equals(sword.getType()) : sword.getType() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        temp = Double.doubleToLongBits(getBladeThikness());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getDamage());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Sword{" +
                "title='" + title + '\'' +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", type='" + type + '\'' +
                ", bladeThikness=" + bladeThikness +
                ", damage=" + damage +
                ", price=" + price +
                '}';
    }
}
