package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class AncientFossil extends Treasure {
    private String title;
    private int age;
    private String accessory;
    private double price;

    public AncientFossil() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
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

        AncientFossil ancientFossil = (AncientFossil) o;

        if (age != ancientFossil.age) {
            return false;
        }
        if (price != ancientFossil.price) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(ancientFossil.title)) {
                return false;
            }
        }
        if (accessory == null) {
            return false;
        } else {
            if (!accessory.equals(ancientFossil.accessory)) {
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
        result = 31 * result + getAge();
        result = 31 * result + (getAccessory() != null ? getAccessory().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "title='" + title + '\'' +
                ", age=" + age +
                ", accessory='" + accessory + '\'' +
                ", price=" + price +
                '}';
    }
}
