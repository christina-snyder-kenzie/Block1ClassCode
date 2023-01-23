package org.example;

public class Pants {
    //size (number)
    //length (number)
    //color (String)
    //style (String)

    //Your task: create properties, constructor, getter/setter, toString
    private int size, length;
    private String color, style;

    public Pants(int size, int length, String color, String style){
        this.size = size;
        this.length = length;
        this.color = color;
        this.style = style;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Pants{" +
                "size=" + size +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", style='" + style + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other){
        if (this == other){ //reflexivity
            return true;
        }
        if (other == null){ //non-nullity
            return false;
        }
        if (! (other instanceof Pants)){
            return false;
        }

        //type-case so we can use pants things
        Pants otherPants = (Pants) other;

        return this.size == otherPants.size &&
                this.length == otherPants.length &&
                this.style.equals(otherPants.style) &&
                this.color.equals(otherPants.color);
    }
}
