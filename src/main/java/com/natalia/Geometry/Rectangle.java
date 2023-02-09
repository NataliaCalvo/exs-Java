package com.natalia.Geometry;

public class Rectangle {
    private int base;
    private int height;
    
    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getBase() {
        return base;
    }
    public int getHeight() {
        return height;
    }
}
