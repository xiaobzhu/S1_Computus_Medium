import java.util.*;

/**
 * @author Zhuxiaobing
 * @version 1.0
 * This is the main class of the whole project, in this project, this file is used to get the user input in the controller
 * and insert the user input into the Date class, to do the calculation of the holiday then use the System.out.prinln to print
 * the output in the controller
 */
public class Computus {
    /**
     * This is the main method of the whole project, It use to scan the user input, and put the user input into the calculation
     * file to do the calculation, after do the calculation, output the answers in the controller
     *
     * @param args this is a part of the main function , it also can be change to any other thing
     */
    public static void main(String[] args) {
        /**
         * This is the main method that used to call Date class, also in this method I created one Scanner object to get
         * the user input
         * In the medium part, I create the an ArrayList to store the data of calculated holiday, then put the data in
         * ArrayList into the HashSet, make the data be the key, and the time be the value of the hashset, then output
         * key and the value.
         */
        System.out.println("Enter year:");
        Scanner input = new Scanner(System.in);//This Scanner is used to get the user input from the keyboard.
        int Y = input.nextInt();
        Date date = new Date(Y);//This is a constructor that used to run the date class. Because in the print part, I need to use the get methods
        System.out.println("The Easter is: " + date.getMonth() + " " + date.getDay() + ", " + Y);
        // Create this ArrayList is used to store the data that after calculate the date value.
        ArrayList<Integer> date1 = new ArrayList<>();
        int data = 1;
        for (int i = 0; i < 5700000; i++) { //this for loop is used to run 5700000 times to calculate all the holiday in 5700000 years,
            Date easter = new Date(data);
            date1.add(easter.getMonth2() * 100 + easter.getDay());//this line is used to add the data after calculated into the ArrayList that created in before.
            data++;
        }
        Set<Integer> hashed = new HashSet<>();//I create this hashset is used to store the data that after calculated. Make data be the key, the times be the value
        hashed.addAll(date1);
        String month;
        for (int tmp : hashed) {
            if (tmp / 100 == 3) {
                month = "March";
            } else {
                month = "April";
            }
            System.out.println(month  + " "+ tmp % 100  + "th " + " - " + +Collections.frequency(date1, tmp));//The Collections.frequency is used to find the how many times of each date in 5700000years
        }
    }
}