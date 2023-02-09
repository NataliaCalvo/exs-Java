package com.natalia.Geometry;

public class Triangle {
    private int base;
    private int height;
    
    public Triangle(int base, int height) {
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
