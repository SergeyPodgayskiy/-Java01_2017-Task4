package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class AncientTissue extends Treasure {
    private String title;
    private String type;
    private double size;
    private String material;
    private boolean hasPattern;
    private String typePattern;
    private double price;

    public AncientTissue() {
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

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isHasPattern() {
        return hasPattern;
    }

    public void setHasPattern(boolean hasPattern) {
        this.hasPattern = hasPattern;
    }

    public String getTypePattern() {
        return typePattern;
    }

    public void setTypePattern(String typePattern) {
        this.typePattern = typePattern;
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
        if (!(o instanceof AncientTissue)) return false;
        if (!super.equals(o)) return false;

        AncientTissue that = (AncientTissue) o;

        if (Double.compare(that.getSize(), getSize()) != 0) return false;
        if (isHasPattern() != that.isHasPattern()) return false;
        if (Double.compare(that.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) return false;
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;
        if (getMaterial() != null ? !getMaterial().equals(that.getMaterial()) : that.getMaterial() != null)
            return false;
        return getTypePattern() != null ? getTypePattern().equals(that.getTypePattern()) : that.getTypePattern() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        result = 31 * result + (isHasPattern() ? 1 : 0);
        result = 31 * result + (getTypePattern() != null ? getTypePattern().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "AncientTissue{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", material='" + material + '\'' +
                ", hasPattern=" + hasPattern +
                ", typePattern='" + typePattern + '\'' +
                ", price=" + price +
                '}';
    }
}
