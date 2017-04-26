package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Staff extends Treasure {
    private String title;
    private double length;
    private String type;
    private String typeTip;
    private double price;

    public Staff() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeTip() {
        return typeTip;
    }

    public void setTypeTip(String typeTip) {
        this.typeTip = typeTip;
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
        if (!(o instanceof Staff)) return false;
        if (!super.equals(o)) return false;

        Staff staff = (Staff) o;

        if (Double.compare(staff.getLength(), getLength()) != 0) return false;
        if (Double.compare(staff.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(staff.getTitle()) : staff.getTitle() != null) return false;
        if (getType() != null ? !getType().equals(staff.getType()) : staff.getType() != null) return false;
        return getTypeTip() != null ? getTypeTip().equals(staff.getTypeTip()) : staff.getTypeTip() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        temp = Double.doubleToLongBits(getLength());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getTypeTip() != null ? getTypeTip().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                ", typeTip='" + typeTip + '\'' +
                ", price=" + price +
                '}';
    }
}
