package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Ring extends Treasure {
    private String material;
    private double weight;
    private String style;
    private boolean hasPreciousStone;
    private double price;

    public Ring() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public boolean isHasPreciousStone() {
        return hasPreciousStone;
    }

    public void setHasPreciousStone(boolean hasPreciousStone) {
        this.hasPreciousStone = hasPreciousStone;
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

        Ring ring = (Ring) o;

        if (weight != ring.weight) {
            return false;
        }
        if (hasPreciousStone != ring.hasPreciousStone) {
            return false;
        }
        if (price != ring.price) {
            return false;
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(ring.material)) {
                return false;
            }
        }
        if (style == null) {
            return false;
        } else {
            if (!style.equals(ring.style)) {
                return false;
            }
        }
        return true;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getMaterial() != null ? getMaterial().hashCode() : 0);
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getStyle() != null ? getStyle().hashCode() : 0);
        result = 31 * result + (isHasPreciousStone() ? 1 : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Ring{" +
                "material='" + material + '\'' +
                ", weight=" + weight +
                ", style='" + style + '\'' +
                ", hasPreciousStone=" + hasPreciousStone +
                ", price=" + price +
                '}';
    }
}
