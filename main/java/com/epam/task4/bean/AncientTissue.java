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
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        AncientTissue ancientTissue = (AncientTissue) o;

        if (size != ancientTissue.size) {
            return false;
        }
        if (price != ancientTissue.price) {
            return false;
        }
        if (hasPattern != ancientTissue.hasPattern) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(ancientTissue.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(ancientTissue.type)) {
                return false;
            }
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(ancientTissue.material)) {
                return false;
            }
        }
        if (typePattern == null) {
            return false;
        } else {
            if (!typePattern.equals(ancientTissue.typePattern)) {
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
        return  super.toString() +"{" +
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
