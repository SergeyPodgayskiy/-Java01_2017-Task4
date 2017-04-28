package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Scapular extends Treasure {
    private String title;
    private String material;
    private String type;
    private double scapularGirth;
    private boolean bodyProtection;
    private double price;

    public Scapular() {
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

    public double getScapularGirth() {
        return scapularGirth;
    }

    public void setScapularGirth(double scapularGirth) {
        this.scapularGirth = scapularGirth;
    }

    public boolean isBodyProtection() {
        return bodyProtection;
    }

    public void setBodyProtection(boolean bodyProtection) {
        this.bodyProtection = bodyProtection;
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

        Scapular scapular = (Scapular) o;

        if (price != scapular.price) {
            return false;
        }
        if (scapularGirth != scapular.scapularGirth) {
            return false;
        }
        if (bodyProtection != scapular.bodyProtection) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(scapular.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(scapular.type)) {
                return false;
            }
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(scapular.material)) {
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
        temp = Double.doubleToLongBits(getScapularGirth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isBodyProtection() ? 1 : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "title='" + title + '\'' +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                ", scapularGirth=" + scapularGirth +
                ", bodyProtection=" + bodyProtection +
                ", price=" + price +
                '}';
    }
}
