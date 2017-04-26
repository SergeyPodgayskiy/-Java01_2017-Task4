package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Sandglass extends Treasure {
    private String material;
    private String sandType;
    private double weight;
    private double size;
    private double price;

    public Sandglass() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSandType() {
        return sandType;
    }

    public void setSandType(String sandType) {
        this.sandType = sandType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
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

        Sandglass sandglass = (Sandglass) o;

        if (weight != sandglass.weight) {
            return false;
        }
        if (price != sandglass.price) {
            return false;
        }
        if (size != sandglass.size) {
            return false;
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(sandglass.material)) {
                return false;
            }
        }
        if (sandType == null) {
            return false;
        } else {
            if (!sandType.equals(sandglass.sandType)) {
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
        result = 31 * result + (getSandType() != null ? getSandType().hashCode() : 0);
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Sandglass{" +
                "material='" + material + '\'' +
                ", sandType='" + sandType + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }
}
