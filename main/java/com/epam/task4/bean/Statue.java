package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Statue extends Treasure {
    private String title;
    private double weight;
    private double size;
    private String type;
    private String creationDate;
    private String creator;
    private double price;

    public Statue() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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

        Statue statue = (Statue) o;

        if (price != statue.price) {
            return false;
        }
        if (weight != statue.weight) {
            return false;
        }
        if (size != statue.size) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(statue.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(statue.type)) {
                return false;
            }
        }
        if (creationDate == null) {
            return false;
        } else {
            if (!creationDate.equals(statue.creationDate)) {
                return false;
            }
        }
        if (creator == null) {
            return false;
        } else {
            if (!creator.equals(statue.creator)) {
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
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (getCreationDate() != null ? getCreationDate().hashCode() : 0);
        result = 31 * result + (getCreator() != null ? getCreator().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                ", type='" + type + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", creator='" + creator + '\'' +
                ", price=" + price +
                '}';
    }
}
