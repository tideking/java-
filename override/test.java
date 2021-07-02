package com.java.over;

class Animal {
    public void cry() {
        System.out.println("动物叫唤");
        }
}

class Dog extends Animal {
    @Override
    public void cry() {
        System.out.println("汪汪汪");
    }
}

public class OverrideTry {
    public static void main(String[] args) {
        Animal a = new Animal(); // Animal对象
        Animal d = new Dog(); //狗对象

        a.cry();
        d.cry();
    }
}
