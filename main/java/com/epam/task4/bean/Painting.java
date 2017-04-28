package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Painting extends Treasure {
    private String title;
    private String type;
    private String creationDate;
    private String creator;
    private String quality;
    private String paintType;
    private double price;

    public Painting() {
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

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getPaintType() {
        return paintType;
    }

    public void setPaintType(String paintType) {
        this.paintType = paintType;
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

        Painting painting = (Painting) o;

        if (price != painting.price) {
            return false;
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(painting.type)) {
                return false;
            }
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(painting.title)) {
                return false;
            }
        }
        if (quality == null) {
            return false;
        } else {
            if (!quality.equals(painting.quality)) {
                return false;
            }
        }
        if (paintType == null) {
            return false;
        } else {
            if (!paintType.equals(painting.paintType)) {
                return false;
            }
        }
        if (creator == null) {
            return false;
        } else {
            if (!creator.equals(painting.creationDate)) {
                return false;
            }
        }
        if (creationDate == null) {
            return false;
        } else {
            if (!creationDate.equals(painting.creationDate)) {
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
        result = 31 * result + (getCreationDate() != null ? getCreationDate().hashCode() : 0);
        result = 31 * result + (getCreator() != null ? getCreator().hashCode() : 0);
        result = 31 * result + (getQuality() != null ? getQuality().hashCode() : 0);
        result = 31 * result + (getPaintType() != null ? getPaintType().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", creationDate='" + creationDate + '\'' +
                ", creator='" + creator + '\'' +
                ", quality='" + quality + '\'' +
                ", paintType='" + paintType + '\'' +
                ", price=" + price +
                '}';
    }
}
