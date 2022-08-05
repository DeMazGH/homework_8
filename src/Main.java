import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        //task1

        int currentYear = LocalDate.now().getYear();
        System.out.println(checkingYearForLeapYear(currentYear));

        //task2

        int clientOs = 0;
        int clientPhoneYear = 2018;
        System.out.println(chekingPhoneOsAndYear(clientOs, clientPhoneYear));

        //task3

        int deliveryDistance = 11;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);

        if (deliveryDays == 0) {
            System.out.println("Доставка не производится.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }

    }

    public static String checkingYearForLeapYear(int year) {
        if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
            return year + " год является високосным.";
        } else {
            return year + " год не является високосным.";
        }
    }

    public static String chekingPhoneOsAndYear(int clientOs, int clientPhoneYear) {

        if (clientOs < 0 || clientOs > 1) {
            return "ОС не распознана";
        }

        boolean isIOS = clientOs == 0;
        boolean isAndroid = clientOs == 1;
        boolean isPhoneOld = clientPhoneYear < LocalDate.now().getYear();

        if (isIOS && isPhoneOld) {
            return "«Установите облегченную версию приложения для iOS по ссылке».";
        } else if (isIOS && !isPhoneOld) {
            return "«Установите версию приложения для iOS по ссылке».";
        } else if (isAndroid && isPhoneOld) {
            return "«Установите облегченную версию приложения для Android по ссылке».";
        } else if (isAndroid && !isPhoneOld) {
            return "«Установите версию приложения для Android по ссылке».";
        }
        return null;
    }

    public static int calculateDeliveryDays(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        }
        return 0;
    }
}