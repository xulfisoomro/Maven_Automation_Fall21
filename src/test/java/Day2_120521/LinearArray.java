package Day2_120521;

public class LinearArray {

    public static void main(String[] args) {

        //create a linear string array for cities
        //declare the variable first
        String[] cities,zipcodes;
        //define the linear array for cities
        cities = new String[]{"Brooklyn", "Queens","Manhattan","Staten Island","Bronx"};
        zipcodes = new String[]{"11212","22222","33333","44444","10000"};

        //declare int variable
        int[] streetNumber;
        //define integer array for street number
        streetNumber = new int[]{22,44,55,66,77,88};

        //print the first city and first streetNumber
        System.out.println("My first city is "+cities[2] + " and a street number is " + streetNumber[2]);

    } //End of main method
} //End of java class


