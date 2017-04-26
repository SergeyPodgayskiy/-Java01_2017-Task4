package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Chain extends Treasure {
    private double length;
    private double weight;
    private String material;
    private double thikness;
    private String lockType;
    private double price;

    public Chain() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getThikness() {
        return thikness;
    }

    public void setThikness(double thikness) {
        this.thikness = thikness;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
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

        Chain chain = (Chain) o;

        if (weight != chain.weight) {
            return false;
        }
        if (length != chain.length) {
            return false;
        }
        if (thikness != chain.thikness) {
            return false;
        }
        if (price != chain.price) {
            return false;
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(chain.material)) {
                return false;
            }
        }
        if (lockType == null) {
            return false;
        } else {
            if (!lockType.equals(chain.lockType)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        temp = Double.doubleToLongBits(getThikness());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getLockType() != null ? getLockType().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Chain{" +
                "length=" + length +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                ", thikness=" + thikness +
                ", lockType='" + lockType + '\'' +
                ", price=" + price +
                '}';
    }
}
