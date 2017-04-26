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
        if (this == o) return true;
        if (!(o instanceof Painting)) return false;
        if (!super.equals(o)) return false;

        Painting painting = (Painting) o;

        if (Double.compare(painting.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(painting.getTitle()) : painting.getTitle() != null) return false;
        if (getType() != null ? !getType().equals(painting.getType()) : painting.getType() != null) return false;
        if (getCreationDate() != null ? !getCreationDate().equals(painting.getCreationDate()) : painting.getCreationDate() != null)
            return false;
        if (getCreator() != null ? !getCreator().equals(painting.getCreator()) : painting.getCreator() != null)
            return false;
        if (getQuality() != null ? !getQuality().equals(painting.getQuality()) : painting.getQuality() != null)
            return false;
        return getPaintType() != null ? getPaintType().equals(painting.getPaintType()) : painting.getPaintType() == null;

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
        return "Painting{" +
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
