package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class DragonsEgg extends Treasure {
    private double size;
    private String dragonsKind;
    private double price;

    public DragonsEgg() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getDragonsKind() {
        return dragonsKind;
    }

    public void setDragonsKind(String dragonsKind) {
        this.dragonsKind = dragonsKind;
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

        DragonsEgg dragonsEgg = (DragonsEgg) o;

        if (price != dragonsEgg.price) {
            return false;
        }
        if (size != dragonsEgg.size) {
            return false;
        }
        if (dragonsKind == null) {
            return false;
        } else {
            if (!dragonsKind.equals(dragonsEgg.dragonsKind)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getDragonsKind() != null ? getDragonsKind().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "size=" + size +
                ", dragonsKind='" + dragonsKind + '\'' +
                ", price=" + price +
                '}';
    }
}
