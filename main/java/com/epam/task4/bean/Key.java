package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Key extends Treasure {
    private double size;
    private String type;
    private String whatOpen;
    private double price;

    public Key() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWhatOpen() {
        return whatOpen;
    }

    public void setWhatOpen(String whatOpen) {
        this.whatOpen = whatOpen;
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
        if (!(o instanceof Key)) return false;
        if (!super.equals(o)) return false;

        Key key = (Key) o;

        if (Double.compare(key.getSize(), getSize()) != 0) return false;
        if (Double.compare(key.getPrice(), getPrice()) != 0) return false;
        if (getType() != null ? !getType().equals(key.getType()) : key.getType() != null) return false;
        return getWhatOpen() != null ? getWhatOpen().equals(key.getWhatOpen()) : key.getWhatOpen() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getWhatOpen() != null ? getWhatOpen().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Key{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", whatOpen='" + whatOpen + '\'' +
                ", price=" + price +
                '}';
    }
}
