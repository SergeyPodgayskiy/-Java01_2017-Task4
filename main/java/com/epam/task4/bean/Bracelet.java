package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Bracelet extends Treasure {
    private String material;
    private double weight;
    private String style;
    private double girth;
    private String hardness;
    private double price;

    public Bracelet() {
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

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getGirth() {
        return girth;
    }

    public void setGirth(double girth) {
        this.girth = girth;
    }

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
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

        Bracelet bracelet = (Bracelet) o;

        if (weight != bracelet.weight) {
            return false;
        }
        if (girth != bracelet.girth) {
            return false;
        }
        if (price != bracelet.price) {
            return false;
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(bracelet.material)) {
                return false;
            }
        }
        if (style == null) {
            return false;
        } else {
            if (!style.equals(bracelet.style)) {
                return false;
            }
        }
        if (hardness == null) {
            return false;
        } else {
            if (!hardness.equals(bracelet.hardness)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getStyle() != null ? getStyle().hashCode() : 0);
        temp = Double.doubleToLongBits(getGirth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getHardness() != null ? getHardness().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                ", style='" + style + '\'' +
                ", girth=" + girth +
                ", hardness='" + hardness + '\'' +
                ", price=" + price +
                '}';
    }
}
