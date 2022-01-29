package Day4_121221;

public class Loop_Array_Condition {

    public static void main(String[] args) {
        //create a dynamic array for 4 different cities, iterate through the values but only print when city is
        //either brooklyn or queens
        String[] cities = new String[4];
        cities[0] = "Queens";
        cities[1] = "Brooklyn";
        cities[2] = "Bronx";
        cities[3] = "Manhattan";

        int r = 0;
        while (r <cities.length) {
            //two if conditions
            if (cities[r] == "Brooklyn") {
                System.out.println("City is " + cities[r]);
            } else if (cities[r] == "Queens") {
                System.out.println("City is " + cities[r]);
            }//end of conditions
            r++;
        }//end of while loop



        int i = 0;
        while(i <cities.length){
            //two if conditions
            //when you are not sure if the value is in upper case, lower case or mixed case
            if(cities[i].toLowerCase().equals("brooklyn")) {
                System.out.println("City is " + cities[i]);
            }else if (cities[i].toUpperCase().equals("QUEENS")) {
                System.out.println("City is " + cities[i]);
            }//end of conditions
            i++;

        }//end of while loop
    }//end of main
}//end of java

