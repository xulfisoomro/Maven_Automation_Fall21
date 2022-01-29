package ActionItem_2A1;

public class WhileLoopConditionsArray {
    public static void main(String[] args) {
        String[] States = new String[4];
        States [0] = "New York";
        States [1] = "Texas";
        States [2] = "California";
        States [3] = "Ohio";

        int x = 0;
        while (x < States.length) {
            //two if conditions
            if (States[x] == "California") {
                System.out.println("State is " + States[x]);
            } else if (States[x] == "Texas") {
                System.out.println("States is "+ States[x]);

            }//end of consitions
            x++;
            }//end of while Loop

        }//end of main

}//end of class
