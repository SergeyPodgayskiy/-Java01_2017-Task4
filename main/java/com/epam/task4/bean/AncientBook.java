package com.epam.task4.bean;

/**
 * @author serge
 *         16.04.2017.
 */
public class AncientBook extends Treasure {
    private String title;
    private short age;
    private String type;
    private short pages;
    private String language;
    private double price;

    public AncientBook() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public short getPages() {
        return pages;
    }

    public void setPages(short pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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

        AncientBook ancientBook = (AncientBook) o;

        if (age != ancientBook.age) {
            return false;
        }
        if (price != ancientBook.price) {
            return false;
        }
        if (pages != ancientBook.pages) {
            return false;
        }
        if (title == null) {
            return false;
        } else {
            if (!title.equals(ancientBook.title)) {
                return false;
            }
        }
        if (type == null) {
            return false;
        } else {
            if (!type.equals(ancientBook.type)) {
                return false;
            }
        }
        if (language == null) {
            return false;
        } else {
            if (!language.equals(ancientBook.language)) {
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
        result = 31 * result + (int) getAge();
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        result = 31 * result + (int) getPages();
        result = 31 * result + (getLanguage() != null ? getLanguage().hashCode() : 0);
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "title='" + title + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", pages=" + pages +
                ", language='" + language + '\'' +
                ", price=" + price +
                '}';
    }
}
