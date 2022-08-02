public class Main {

    public static void main(String[] args) {

        //task1

        int currentYear = 2000;
        System.out.println(checkingYearForLeapYear(currentYear));


    }

    public static String checkingYearForLeapYear(int year) {
        String ifYearLeap = "";

        if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
            ifYearLeap = year + " год является високосным.";
        } else {
            ifYearLeap = year + " год не является високосным.";
        }
        return ifYearLeap;
    }
}