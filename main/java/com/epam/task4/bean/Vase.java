package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Vase extends Treasure {
    private String title;
    private String type;
    private double volume;
    private boolean hasPicture;
    private double price;

    public Vase() {
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isHasPicture() {
        return hasPicture;
    }

    public void setHasPicture(boolean hasPicture) {
        this.hasPicture = hasPicture;
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

        Vase vase = (Vase) o;

        if (price != vase.price) {
            return false;
        }
        if (volume != vase.volume) {
            return false;
        }
        if (hasPicture != vase.hasPicture) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(vase.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(vase.type)) {
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
        temp = Double.doubleToLongBits(getVolume());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isHasPicture() ? 1 : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", volume=" + volume +
                ", hasPicture=" + hasPicture +
                ", price=" + price +
                '}';
    }
}
