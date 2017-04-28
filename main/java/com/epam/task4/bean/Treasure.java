package com.epam.task4.bean;

import java.io.Serializable;

/**
 * @author serge
 *         16.04.2017.
 */
public abstract class Treasure implements Serializable {
    private int id;

    public Treasure() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

        Treasure treasure = (Treasure) o;

        if(id != treasure.id){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        result = 31 * getId();
        return result;
    }

    @Override
    public String toString() {
        return  getClass().getName() + "{" +
                "id=" + id +
                '}';
    }
}
