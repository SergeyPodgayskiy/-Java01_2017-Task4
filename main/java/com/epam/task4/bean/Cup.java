package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Cup extends Treasure {
    private double volume;
    private String material;
    private double weight;
    private double height;
    private double price;

    public Cup() {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

        Cup cup = (Cup) o;

        if (price != cup.price) {
            return false;
        }
        if (height != cup.height) {
            return false;
        }
        if (weight != cup.weight) {
            return false;
        }
        if (volume != cup.volume) {
            return false;
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(cup.material)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "volume=" + volume +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", price=" + price +
                '}';
    }
}
