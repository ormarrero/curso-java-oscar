package com.example.control.repetitive;

public class While2 {

    public static void main(String[] args) {

        String[] names = {"person1", "person2", "person3", "person4", "person5"};   // length = 5

        boolean found = false;
        int i = 0;

        while (!found){
            System.out.println("i0: "+names);
            if(names[i].equalsIgnoreCase(("person3")));
            found = true;
            System.out.println("i1: "+names);
            i++;
            System.out.println("i2: "+names);
        }
        System.out.println("i3: "+names);
    }
}
