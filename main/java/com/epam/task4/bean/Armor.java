package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Armor extends Treasure {
    private String title;
    private String material;
    private String type;
    private boolean bodyProtection;
    private boolean hasPicture;
    private double bodyGirth;
    private double price;

    public Armor() {
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

    public boolean isBodyProtection() {
        return bodyProtection;
    }

    public void setBodyProtection(boolean bodyProtection) {
        this.bodyProtection = bodyProtection;
    }

    public boolean isHasPicture() {
        return hasPicture;
    }

    public void setHasPicture(boolean hasPicture) {
        this.hasPicture = hasPicture;
    }

    public double getBodyGirth() {
        return bodyGirth;
    }

    public void setBodyGirth(double bodyGirth) {
        this.bodyGirth = bodyGirth;
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

        Armor armor = (Armor) o;

        if (bodyGirth != armor.bodyGirth) {
            return false;
        }
        if (price != armor.price) {
            return false;
        }
        if (bodyProtection != armor.bodyProtection) {
            return false;
        }
        if (hasPicture != armor.hasPicture) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(armor.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(armor.type)) {
                return false;
            }
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(armor.material)) {
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
        result = 31 * result + (isBodyProtection() ? 1 : 0);
        result = 31 * result + (isHasPicture() ? 1 : 0);
        temp = Double.doubleToLongBits(getBodyGirth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() +"{" +
                "title='" + title + '\'' +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                ", bodyProtection=" + bodyProtection +
                ", hasPicture=" + hasPicture +
                ", bodyGirth=" + bodyGirth +
                ", price=" + price +
                '}';
    }
}
