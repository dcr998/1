package com.one;

public class Hello {
    public static void main(String[] args) {
        System.out.println("�򵥵�Java����");
        Student stu=new Student();
        stu.speak("students");
    }
}
class Student{
    public void speak(String s){
        System.out.println(s);
    }
}
