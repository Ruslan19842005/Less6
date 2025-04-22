public class Main {
    public static void main(String[] args) {


        int clientOs = 0;
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        int clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");


        }


        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance > 60) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }

    }


}







