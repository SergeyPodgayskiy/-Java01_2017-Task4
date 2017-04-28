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
    private double bladeThickness;
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

    public double getBladeThickness() {
        return bladeThickness;
    }

    public void setBladeThickness(double bladeThickness) {
        this.bladeThickness = bladeThickness;
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
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        Sword sword = (Sword) o;

        if (price != sword.price) {
            return false;
        }
        if (weight != sword.weight) {
            return false;
        }
        if (length != sword.length) {
            return false;
        }
        if (damage != sword.damage) {
            return false;
        }
        if (bladeThickness != sword.bladeThickness) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(sword.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(sword.type)) {
                return false;
            }
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(sword.material)) {
                return false;
            }
        }
        return true;
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
        temp = Double.doubleToLongBits(getBladeThickness());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getDamage());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "title='" + title + '\'' +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", type='" + type + '\'' +
                ", bladeThickness=" + bladeThickness +
                ", damage=" + damage +
                ", price=" + price +
                '}';
    }
}
