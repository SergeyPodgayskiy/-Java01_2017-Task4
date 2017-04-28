package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class Axe extends Treasure {
    private String title;
    private String type;
    private String typeBlade;
    private String typeHandle;
    private double damage;
    private double price;

    public Axe() {
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

    public String getTypeBlade() {
        return typeBlade;
    }

    public void setTypeBlade(String typeBlade) {
        this.typeBlade = typeBlade;
    }

    public String getTypeHandle() {
        return typeHandle;
    }

    public void setTypeHandle(String typeHandle) {
        this.typeHandle = typeHandle;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
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

        Axe axe = (Axe) o;

        if (damage != axe.damage) {
            return false;
        }
        if (price != axe.price) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(axe.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(axe.type)) {
                return false;
            }
        }
        if (typeBlade == null) {
            return false;
        } else {
            if (!typeBlade.equals(axe.typeBlade)) {
                return false;
            }
        }
        if (typeHandle == null) {
            return false;
        } else {
            if (!typeHandle.equals(axe.typeHandle)) {
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
        result = 31 * result + (getTypeBlade() != null ? getTypeBlade().hashCode() : 0);
        result = 31 * result + (getTypeHandle() != null ? getTypeHandle().hashCode() : 0);
        temp = Double.doubleToLongBits(getDamage());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", typeBlade='" + typeBlade + '\'' +
                ", typeHandle='" + typeHandle + '\'' +
                ", damage=" + damage +
                ", price=" + price +
                '}';
    }
}
