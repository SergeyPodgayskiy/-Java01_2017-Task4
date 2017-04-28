package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Aroma extends Treasure {
    private String title;
    private String type;
    private short amount;
    private double price;

    public Aroma() {
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

    public short getAmount() {
        return amount;
    }

    public void setAmount(short amount) {
        this.amount = amount;
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

        Aroma aroma = (Aroma) o;

        if (price != aroma.price) {
            return false;
        }
        if (amount != aroma.amount) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(aroma.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(aroma.type)) {
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
        result = 31 * result + (int) getAmount();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}

