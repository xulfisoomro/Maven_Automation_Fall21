package Day8_122621;

import java.util.ArrayList;

public class Arraylist_Example {

    public static void main(String[] args) {
        /*ArrayList is a resizeable array which means you dont need to add the Lenght to
        add more array values
         */
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Brooklyn");
        cities.add("Brooklyn");
        cities.add("Brooklyn");

        //shourtcut for printLn is sout Lowercase
        System.out.println("My city is" + cities.get(2));

        ArrayList<Integer> streetNumber = new ArrayList<>();
        streetNumber.add(111);
        streetNumber.add(112);
        streetNumber.add(113);

        System.out.println("My third city is " + cities.get(2) + " and my third house number is " + streetNumber.get(2));


    }//end of main method

}//end of java class
