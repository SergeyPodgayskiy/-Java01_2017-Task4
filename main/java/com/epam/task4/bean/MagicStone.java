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
        if (this == o) return true;
        if (!(o instanceof MagicStone)) return false;
        if (!super.equals(o)) return false;

        MagicStone that = (MagicStone) o;

        if (getAge() != that.getAge()) return false;
        if (Double.compare(that.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) return false;
        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;
        if (getMagicWords() != null ? !getMagicWords().equals(that.getMagicWords()) : that.getMagicWords() != null)
            return false;
        return getTranslation() != null ? getTranslation().equals(that.getTranslation()) : that.getTranslation() == null;

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
        return "MagicStone{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                ", magicWords='" + magicWords + '\'' +
                ", translation='" + translation + '\'' +
                ", price=" + price +
                '}';
    }
}
