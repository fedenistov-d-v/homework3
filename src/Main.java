public class Main {
    public static void main(String[] args) {

        // Task 1
        byte byteA = -128;
        short shortA = 128;
        int intA = 1000000;
        long longA = 5L;
        float floatA= 3.5f;
        double doubleA = 1.5E8;

        System.out.println("Значение переменной byteA с типом "
            + type(byteA) + " равно " + byteA);
        System.out.println("Значение переменной shortA с типом "
            + type(shortA) + " равно " + shortA);
        System.out.println("Значение переменной intA с типом "
            + type(intA) + " равно " + intA);
        System.out.println("Значение переменной longA с типом "
            + type(longA) + " равно " + longA);
        System.out.println("Значение переменной floatA с типом "
            + type(floatA) + " равно " + floatA);
        System.out.println("Значение переменной doubleA с типом "
            + type(doubleA) + " равно " + doubleA);

        // Task 2
        float floatB = 27.12f;
        long longB = 987_678_965_549L;
        float floatC = 2.786f;
        short shortB = 569;
        short shortC = -159;
        short shortD = 27897;
        byte byteB = 67;

        // Task 3
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        byte sheetsPaper = (byte) (480 / (lp + as + ea));
        System.out.println("На каждого ученика рассчитано "
                + sheetsPaper + " листов бумаги");

        // Task 4
        byte bottlesInMin = 16 / 2;
        long bottles = 20 * bottlesInMin;
        System.out.println("За 20 минут машина произвела " + bottles
                + " штук бутылок");
        bottles = 24 * 60 * bottlesInMin;
        System.out.println("За 1 сутки машина произвела " + bottles
                + " штук бутылок");
        bottles = 3 * 24 * 60 * bottlesInMin;
        System.out.println("За 3 дня машина произвела " + bottles
                + " штук бутылок");
        bottles = 30 * 24 * 60 * bottlesInMin;
        System.out.println("За 1 месяц машина произвела " + bottles
                + " штук бутылок");

        // Task 5
        byte whiteJar = 120;
        short brownJar = (short)(whiteJar * 2);
        byte classsrooms = (byte)(whiteJar / 2);
        System.out.println("В школе, где " + classsrooms + " классов, нужно " + whiteJar +
                " банок белой краски и " + brownJar + " банок коричневой краски");

        // Task 6
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        short breakfastG = (short)(banana * 5 + milk * 2 + iceCream * 2 + egg * 4);
        float breakfastKg = (float) breakfastG / 1000;
        System.out.printf("Завтрак для спортсменов весит %dг или %.3fкг", breakfastG, breakfastKg);

    }

    // Функция type() определяет тип переменной
    // Подсмотрел на сайте https://devhops.ru/code/java/instanceof.php#example
    // Не понятно мне условие "value instanceof"
    public static String type(Object value) {
        if (value instanceof Integer) {
            return "int";
        } else if (value instanceof Byte) {
            return "byte";
        } else if (value instanceof Float) {
            return  "float";
        } else if (value instanceof Double) {
            return "double";
        }else if (value instanceof Long) {
            return "long";
        }else if (value instanceof Short) {
            return "short";
        }
        return "0";
    }

}