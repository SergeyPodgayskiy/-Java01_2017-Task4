package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Trousers extends Treasure {
    private String title;
    private String material;
    private String type;
    private boolean legProtection;
    private double legGirth;
    private double price;

    public Trousers() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLegProtection() {
        return legProtection;
    }

    public void setLegProtection(boolean legProtection) {
        this.legProtection = legProtection;
    }

    public double getLegGirth() {
        return legGirth;
    }

    public void setLegGirth(double legGirth) {
        this.legGirth = legGirth;
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

        Trousers trousers = (Trousers) o;

        if (price != trousers.price) {
            return false;
        }
        if (legProtection != trousers.legProtection) {
            return false;
        }
        if (legGirth != trousers.legGirth) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(trousers.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(trousers.type)) {
                return false;
            }
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(trousers.material)) {
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
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (isLegProtection() ? 1 : 0);
        temp = Double.doubleToLongBits(getLegGirth());
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
                ", type='" + type + '\'' +
                ", legProtection=" + legProtection +
                ", legGirth=" + legGirth +
                ", price=" + price +
                '}';
    }
}
