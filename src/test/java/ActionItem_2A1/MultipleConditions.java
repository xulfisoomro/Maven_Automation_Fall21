package ActionItem_2A1;

public class MultipleConditions {
    public static void main(String[] args) {
        //define the set variables

        int grade = 95;
        if(grade >= 90 && grade <=100) {
            System.out.println("Grade is A");
        } else if(grade>= 80 && grade <90){
            System.out.println("Grade is B");
        } else if(grade>=70 && grade<80){
            System.out.println("Grade is C");
        } else if(grade>=60 && grade<70){
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");
        }

    }//end of main method
}//end of java class
