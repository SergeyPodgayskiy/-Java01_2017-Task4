package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class AncientScroll extends Treasure {
    private String title;
    private short age;
    private String text;
    private String schoolOfMagic;
    private double price;

    public AncientScroll() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSchoolOfMagic() {
        return schoolOfMagic;
    }

    public void setSchoolOfMagic(String schoolOfMagic) {
        this.schoolOfMagic = schoolOfMagic;
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
        if (!(o instanceof AncientScroll)) return false;
        if (!super.equals(o)) return false;

        AncientScroll that = (AncientScroll) o;

        if (getAge() != that.getAge()) return false;
        if (Double.compare(that.getPrice(), getPrice()) != 0) return false;
        if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) return false;
        if (getText() != null ? !getText().equals(that.getText()) : that.getText() != null) return false;
        return getSchoolOfMagic() != null ? getSchoolOfMagic().equals(that.getSchoolOfMagic()) : that.getSchoolOfMagic() == null;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
        result = 31 * result + (int) getAge();
        result = 31 * result + (getText() != null ? getText().hashCode() : 0);
        result = 31 * result + (getSchoolOfMagic() != null ? getSchoolOfMagic().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "AncientScroll{" +
                "title='" + title + '\'' +
                ", age=" + age +
                ", text='" + text + '\'' +
                ", schoolOfMagic='" + schoolOfMagic + '\'' +
                ", price=" + price +
                '}';
    }
}
