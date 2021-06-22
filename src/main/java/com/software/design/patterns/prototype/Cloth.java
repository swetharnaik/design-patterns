package com.software.design.patterns.prototype;

public abstract class Cloth implements Cloneable {

    private int id;
    private int rate;
    private String type;
    private String color;
    private String pattern;

    //constructor
    public Cloth(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public Object clone() {
        Object clone=null;
        try {
            clone=super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    //abstract methods
    public abstract String toWeave();

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "id=" + id +
                ", rate=" + rate +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", pattern='" + pattern + '\'' +
                '}';
    }


}
