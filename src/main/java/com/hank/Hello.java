package com.hank;

public class Hello {

    public static void main(String[] args) {
//        System.out.println("Java Hello word");
//        new Person().hello();
        Person p = new Person();
        p.hello();
        p.weight=66.5f;
        p.height=1.7f;
        System.out.println(p.bmi());

//        int age = 19;
//        Integer age2 = 20;
//        char c = '§Ú';
//        Character c2 = c;
//        byte b = 120;
//        float wieght = 66.5f;
//        float height = 1.7f;
//        boolean adult = true;
//        boolean enroll = false;
//        String name = "Tom";

    }


}
