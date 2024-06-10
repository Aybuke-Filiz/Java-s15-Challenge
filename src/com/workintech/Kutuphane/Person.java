package com.workintech.Kutuphane;

public class Person {
private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }
    public String who_you_are(){
        return "My name is" + name;
    }

}
