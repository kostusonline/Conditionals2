public class Main {
    public static void main(String[] args) {
        String divider = "-------------------------------------";

        System.out.println(divider);
        System.out.println("Задача #1");
        // лучше было бы enum, но пока не проходили,
        // и лучше бы 0 было чем-то неизвестным, чтобы выбор
        // нужно было сделать намеренно, а не оставлять значение по умолчанию
        // для переменной clientOS
        // по именованию: https://google.github.io/styleguide/javaguide.html#s5-naming
        final int osiOS = 0;
        final int osAndroid = 1;
        int clientOS = osAndroid;
        String osMessage;
        if (osiOS == clientOS) {
            osMessage = "iOS";
        } else if (osAndroid == clientOS) {
            osMessage = "Android";
        } else {
            osMessage = "чего-нибудь";
        }
        System.out.printf("Установите версию приложения для %s по ссылке", osMessage);
        System.out.println();

        System.out.println(divider);
        System.out.println("Задача #2");
        final int yearMilestone1 = 2015;
        clientOS = osAndroid;
        int clientDeviceYear = 2014;
        if (osiOS == clientOS) {
            osMessage = "iOS";
        } else if (osAndroid == clientOS) {
            osMessage = "Android";
        } else {
            osMessage = "чего-нибудь";
        }
        boolean isLightVersionNeeded = clientDeviceYear < yearMilestone1;
        if (isLightVersionNeeded) {
            System.out.printf("Установите облегчённую версию приложения для %s по ссылке", osMessage);
        } else {
            System.out.printf("Установите версию приложения для %s по ссылке", osMessage);
        }
        System.out.println();

        System.out.println(divider);
        System.out.println("Задача #3");
        final int leapYearBorn = 1584;
        int year = 2024; // 1900, 1992, 2000, 2004, 2008, 2012, 2016, 2020
        boolean isYearLeap = false;
        if (year > leapYearBorn && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            isYearLeap = true;
        }
        if (isYearLeap) {
            System.out.printf("%d год является високосным", year);
        } else {
            System.out.printf("%d год не является високосным", year);
        }
        System.out.println();

        System.out.println(divider);
        System.out.println("Задача #4");
        final int noDelivery = -1;
        int deliveryDistance = 95;
        int deliveryDays = noDelivery;
        if (deliveryDistance < 20) {
            deliveryDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        }
        if (noDelivery == deliveryDays) {
            System.out.printf("Дистанция %d км слишком велика для доставки", deliveryDistance);
            System.out.println();
        } else {
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        // задача №5
        int monthNumber = 6;
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println(divider);
            System.out.println("Задача #5");
            String seasonName = switch (monthNumber) {
                case 12, 1, 2 -> "зима";
                case 3, 4, 5 -> "весна";
                case 6, 7, 8 -> "лето";
                case 9, 10, 11 -> "осень";
                default -> "чёрт знает что";
            };
            String monthName = switch (monthNumber) {
                case 1 -> "январь";
                case 2 -> "февраль";
                case 3 -> "март";
                case 4 -> "апрель";
                case 5 -> "май";
                case 6 -> "июнь";
                case 7 -> "июль";
                case 8 -> "август";
                case 9 -> "сентябрь";
                case 10 -> "октябрь";
                case 11 -> "ноябрь";
                case 12 -> "декабрь";
                default -> "янвабрь";
            };
            System.out.printf("%d-й месяц (он же %s) - это %s", monthNumber, monthName, seasonName);
        }
    }
}