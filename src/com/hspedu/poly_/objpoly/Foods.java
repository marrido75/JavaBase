package com.hspedu.poly_.objpoly;

public class Foods {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Foods(String name) {
        this.name = name;
    }
}

class Fish extends Foods{
    public Fish(String name) {
        super(name);
    }
}

class Bone extends Foods{
    public Bone(String name) {
        super(name);
    }
}