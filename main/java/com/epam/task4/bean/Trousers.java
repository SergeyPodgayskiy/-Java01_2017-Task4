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
        if (this == o) return true;
        if (!(o instanceof Trousers)) return false;
        if (!super.equals(o)) return false;

        Trousers trousers = (Trousers) o;

        if (isLegProtection() != trousers.isLegProtection()) return false;
        if (Double.compare(trousers.getLegGirth(), getLegGirth()) != 0) return false;
        if (Double.compare(trousers.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(trousers.getTitle()) : trousers.getTitle() != null) return false;
        if (getMaterial() != null ? !getMaterial().equals(trousers.getMaterial()) : trousers.getMaterial() != null)
            return false;
        return getType() != null ? getType().equals(trousers.getType()) : trousers.getType() == null;

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
        return "Trousers{" +
                "title='" + title + '\'' +
                ", material='" + material + '\'' +
                ", type='" + type + '\'' +
                ", legProtection=" + legProtection +
                ", legGirth=" + legGirth +
                ", price=" + price +
                '}';
    }
}
