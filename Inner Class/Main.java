package com.company;
public class Main {
    public static void main(String[] args) {
        NewClass newClass = new NewClass();
        newClass.print(); // prints com.company.Main$NewClass@1b6d3586
    }
    // Inner class named NewClass
     static class NewClass{
        //prints this
        public void print(){
            System.out.println(this);
        }
    }
}




