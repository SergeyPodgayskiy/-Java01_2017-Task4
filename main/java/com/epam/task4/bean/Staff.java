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
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        Staff staff = (Staff) o;

        if (price != staff.price) {
            return false;
        }
        if (length != staff.length) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(staff.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(staff.type)) {
                return false;
            }
        }
        if (typeTip == null) {
            return false;
        } else {
            if (!typeTip.equals(staff.typeTip)) {
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
        return  super.toString() + "{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", type='" + type + '\'' +
                ", typeTip='" + typeTip + '\'' +
                ", price=" + price +
                '}';
    }
}
