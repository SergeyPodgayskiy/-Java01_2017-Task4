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
        if (this == o) return true;
        if (!(o instanceof Helmet)) return false;
        if (!super.equals(o)) return false;

        Helmet helmet = (Helmet) o;

        if (Double.compare(helmet.getHeadGirth(), getHeadGirth()) != 0) return false;
        if (Double.compare(helmet.getHeadProtection(), getHeadProtection()) != 0) return false;
        if (Double.compare(helmet.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(helmet.getTitle()) : helmet.getTitle() != null) return false;
        if (getType() != null ? !getType().equals(helmet.getType()) : helmet.getType() != null) return false;
        return getMaterial() != null ? getMaterial().equals(helmet.getMaterial()) : helmet.getMaterial() == null;

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
        return "Helmet{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", headGirth=" + headGirth +
                ", headProtection=" + headProtection +
                ", price=" + price +
                '}';
    }
}
