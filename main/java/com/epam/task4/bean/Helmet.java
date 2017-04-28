package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Helmet extends Treasure {
    private String title;
    private String type;
    private String material;
    private double headGirth;
    private double headProtection;
    private double price;

    public Helmet() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getHeadGirth() {
        return headGirth;
    }

    public void setHeadGirth(double headGirth) {
        this.headGirth = headGirth;
    }

    public double getHeadProtection() {
        return headProtection;
    }

    public void setHeadProtection(double headProtection) {
        this.headProtection = headProtection;
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

        Helmet helmet = (Helmet) o;

        if (price != helmet.price) {
            return false;
        }
        if (headGirth != helmet.headGirth) {
            return false;
        }
        if (headProtection != helmet.headProtection) {
            return false;
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(helmet.material)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(helmet.type)) {
                return false;
            }
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(helmet.title)) {
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
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        temp = Double.doubleToLongBits(getHeadGirth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHeadProtection());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", headGirth=" + headGirth +
                ", headProtection=" + headProtection +
                ", price=" + price +
                '}';
    }
}
