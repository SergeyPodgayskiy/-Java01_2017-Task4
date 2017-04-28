package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
*/
public class Jewel extends Treasure {
    private String type;
    private String material;
    private double diameter;
    private double weight;
    private double price;

    public Jewel() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

        Jewel jewel = (Jewel) o;

        if (weight != jewel.weight) {
            return false;
        }
        if (diameter != jewel.diameter) {
            return false;
        }
        if (price != jewel.price) {
            return false;
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(jewel.type)) {
                return false;
            }
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(jewel.material)) {
                return false;
            }
        }
       return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        temp = Double.doubleToLongBits(getDiameter());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", diameter=" + diameter +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
