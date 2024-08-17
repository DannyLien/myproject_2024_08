package com.hank;


import com.hank.kotlin.Student;

public class Hello {

    public static void main(String[] args) {
//        System.out.println("Java Hello word");
//        new Person().hello();
        Student stu = new Student("Hank", 50,60);
        stu.highest();
        String s = "abcde";
//        String s = null;
        System.out.println(s.charAt(3)+"  s.charAt");
//        System.out.println(s.length());
//        System.out.println(s.substring(3));
        System.out.println(s.substring(1, 4)+"  s.substring");

        Person p = new Person("Tom", 66.5f, 1.7f);
        p.hello();
        System.out.println(p.bmi());
        System.out.println(p.name);
        int score = 88;
        System.out.println(score > 60);
        System.out.println(score < 60);
        System.out.println(score == 60);
        System.out.println(score >= 60);
        System.out.println(score <= 60);
        System.out.println(score > 80 && score < 90);
        System.out.println(score < 80 || score > 90);
        char c = 'A';
        System.out.println((c > 60) + "  c > 60");
        System.out.println((c > 'a') + "  c > a");

//        com.homeworkkotlin.Dice d = new com.homeworkkotlin.Dice();
//        System.out.println(d.max);
//        System.out.println(d.point);

//        int age = 19;
//        Integer age2 = 20;
//        char c1 = '我';
//        Character c2 = c1;
//        byte b = 120;
//        float wieght = 66.5f;
//        float height = 1.7f;
//        boolean adult = true;
//        boolean enroll = false;
//        String name = "Tom";

    }


}
