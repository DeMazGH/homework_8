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

        int deliveryDistance = 88;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        System.out.println(printDeliveryMessage(deliveryDays));

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

        if (clientOs == 0 && clientPhoneYear < LocalDate.now().getYear()) {
            return "«Установите облегченную версию приложения для iOS по ссылке».";
        } else if (clientOs == 0 && !(clientPhoneYear < LocalDate.now().getYear())) {
            return "«Установите версию приложения для iOS по ссылке».";
        } else if (clientOs == 1 && clientPhoneYear < LocalDate.now().getYear()) {
            return "«Установите облегченную версию приложения для Android по ссылке».";
        } else if (clientOs == 1 && !(clientPhoneYear < LocalDate.now().getYear())) {
            return "«Установите версию приложения для Android по ссылке».";
        }
        return "Ошибка, вы не можете установить приложение. Для уточнения обратитесь в тех. поддержку";
    }

    public static int calculateDeliveryDays(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        }
        throw new RuntimeException("Доставка не производится.");
    }

    public static String printDeliveryMessage(int deliveryDays) {
            return "Потребуется дней: " + deliveryDays;
    }
}