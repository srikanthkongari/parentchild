package com.edyoda.classroom;
abstract class Parent{

    void message() { }

}

    class Subclass1 extends Parent{

        void message() {

            System.out.println("This is First subclass.");

        }

    }

    class Subclass2 extends Parent{

        void message() {

            System.out.println("This is Second subclass.");

        }

    }

