package com.md.test.impl;

/**
 * Created by fan on 2016/3/30.
 */
public class ClassReference {
    static class Person {
        @Override
        public String toString(){
            return "I'm a person.";
        }
        public void eat(){
            System.out.println("Person eat");
        }
        public void speak(){
            System.out.println("Person speak");
        }

    }

    static class Boy extends Person{
        @Override
        public String toString(){
            return "I'm a boy";
        }
        @Override
        public void speak(){
            System.out.println("Boy speak");
        }
        public void fight(){
            System.out.println("Boy fight");
        }
    }

    static class Girl extends Person{
        @Override
        public String toString(){
            return "I'm a girl";
        }
        @Override
        public void speak(){
            System.out.println("Girl speak");
        }
        public void sing(){
            System.out.println("Girl sing");
        }
    }

    public static void main(String[] args) {
        Person boy = new Boy();
        Person girl = new Girl();
        System.out.println(boy);
        boy.eat();
        boy.speak();
        //boy.fight();
        System.out.println(girl);
        girl.eat();
        girl.speak();
        //girl.sing();
    }
}