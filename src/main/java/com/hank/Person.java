package com.hank;

public class Person {
    String naem;
    float weight;
    float height;

    public float bmi() {
        float bmi = weight / (height * height);
        return bmi;
    }

    public void hello() {
        System.out.println("Java Person Hello word");
    }


}
