/**
 * @author Zhuxiaobing
 * @version 1.0
 */

/**
 * This class is used to to the calculate of the holiday, in this class, I create three private variable used to do the
 * calculation
 */
public class Date {
    /**
     * This private month value type is String, because this String will be used to store the String style month
     */
    private String month;
    /**
     * The private month2 value type is integer, I create this value because I will use it  to do the calculation for the
     * hashset
     */
    private int month2;
    /**
     * this private day value type is integer, I create this value because I will use this value to store the date of the
     * hoiliday date, and use it to do the calculate for the hashset.
     */
    private int day;

    /**
     * This is the constructor of the Date class, In this part, I create many variable like a,b,c,d... , use them to do
     * the normal variable, or temp variable to the calculation
     *
     * @param Y this Y is a int value that after use the scanner get the user input from the main class, use the constructor
     *          to get the value from the main class. input here to do the calculation
     */
    public Date(int Y) {
        int a = Y % 19;
        int b = Y / 100;
        int c = Y % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int month = (h + 1 - 7 * m + 114) / 31;
        int month2 = (h + 1 - 7 * m + 114) / 31;
        int day = ((h + l - 7 * m + 114) % 31) + 1;
        setDay(day);
        setMonth(month);
        setMonth2(month2);

    }

    /**
     * This method is used to transfer the digital month to character month
     *
     * @param month This int month is get the input from the upper class, after following the calculation in the upper class,
     *              it will output a digital month to this class, and use a for loop to do the check in the String array m,
     *              find the word month
     */
    private void setMonth(int month) {//this method method is used to transfer the number style month to word style month
        String[] m = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < m.length; i++) {
            if (i == month) {
                this.month = m[i - 1];
            }
        }
    }

    /**
     * this method is a get method for month2 that calculated in the above method
     *
     * @return The month2 it will be used in the other class, the return value is a int value
     */
    public int getMonth2() {//this method is used to get the month2 that calculated in the above method
        return month2;
    }

    /**
     * this method is a get method for month that calculated in the above method
     *
     * @return the month will be used in the other class, the return value is a String value
     */
    public String getMonth() {//this method is used to get the value of month in the above method.
        return month;
    }

    /**
     * this method is a set method for the date, it used to set the date variable in the above class
     *
     * @param date this day value is calculated from the above class
     */
    private void setDay(int date) {// this method is used to set the value of date
        this.day = date;
    }

    /**
     * this method is a get method for the date, The value returned will be used in other class
     *
     * @return the value of day returned is the date calculated from the above class
     */
    public int getDay() {// this method is used to set the value of date
        return day;
    }

    public void setMonth2(int month2) {
        this.month2 = month2;
    }
}
