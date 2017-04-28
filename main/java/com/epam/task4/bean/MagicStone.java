package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class MagicStone extends Treasure {
    private String title;
    private String type;
    private short age;
    private String magicWords;
    private String translation;
    private double price;

    public MagicStone() {
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

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getMagicWords() {
        return magicWords;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
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

        MagicStone magicStone = (MagicStone) o;

        if (price != magicStone.price) {
            return false;
        }
        if (age != magicStone.age) {
            return false;
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(magicStone.type)) {
                return false;
            }
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(magicStone.title)) {
                return false;
            }
        }
        if (magicWords == null) {
            return false;
        } else {
            if (!magicWords.equals(magicStone.magicWords)) {
                return false;
            }
        }
        if (translation == null) {
            return false;
        } else {
            if (!translation.equals(magicStone.translation)) {
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
        result = 31 * result + (int) getAge();
        result = 31 * result + (getMagicWords() != null ? getMagicWords().hashCode() : 0);
        result = 31 * result + (getTranslation() != null ? getTranslation().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return  super.toString() + "{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", magicWords='" + magicWords + '\'' +
                ", translation='" + translation + '\'' +
                ", price=" + price +
                '}';
    }
}
