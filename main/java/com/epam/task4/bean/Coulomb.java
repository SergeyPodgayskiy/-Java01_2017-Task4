package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Coulomb extends Treasure {
    private String material;
    private double size;
    private double weight;
    private String form;
    private boolean hasPicture;
    private double price;

    public Coulomb() {
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
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

        Coulomb coulomb = (Coulomb) o;

        if (price != coulomb.price) {
            return false;
        }
        if (size != coulomb.size) {
            return false;
        }
        if (weight != coulomb.weight) {
            return false;
        }
        if (hasPicture != coulomb.hasPicture) {
            return false;
        }
        if (form == null) {
            return false;
        } else {
            if (!form.equals(coulomb.form)) {
                return false;
            }
        }
        if (material == null) {
            return false;
        } else {
            if (!material.equals(coulomb.material)) {
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
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getForm() != null ? getForm().hashCode() : 0);
        result = 31 * result + (isHasPicture() ? 1 : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "material='" + material + '\'' +
                ", size=" + size +
                ", weight=" + weight +
                ", form='" + form + '\'' +
                ", hasPicture=" + hasPicture +
                ", price=" + price +
                '}';
    }
}
