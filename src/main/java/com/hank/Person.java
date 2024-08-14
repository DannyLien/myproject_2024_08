package com.hank;

public class Person {
    String name;
    float weight;
    float height;

    public Person(float weight, float height) {
        this.weight = weight;
        this.height = height;

    }

    public Person(String name, float wieight, float height){
        this(wieight, height);
        this.name=name;
    }

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
        System.out.println("Java Person Hello word");
    }


}
