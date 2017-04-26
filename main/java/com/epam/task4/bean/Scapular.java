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
        if (this == o) return true;
        if (!(o instanceof Scapular)) return false;
        if (!super.equals(o)) return false;

        Scapular scapular = (Scapular) o;

        if (Double.compare(scapular.getScapularGirth(), getScapularGirth()) != 0) return false;
        if (isBodyProtection() != scapular.isBodyProtection()) return false;
        if (Double.compare(scapular.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(scapular.getTitle()) : scapular.getTitle() != null) return false;
        if (getMaterial() != null ? !getMaterial().equals(scapular.getMaterial()) : scapular.getMaterial() != null)
            return false;
        return getType() != null ? getType().equals(scapular.getType()) : scapular.getType() == null;

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
        return "Scapular{" +
                "title='" + title + '\'' +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                ", scapularGirth=" + scapularGirth +
                ", bodyProtection=" + bodyProtection +
                ", price=" + price +
                '}';
    }
}
