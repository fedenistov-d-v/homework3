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
        double floatB = 27.12;
        long longB = 987_678_965_549L;
        double floatC = 2.786;
        short shortB = 569;
        short shortC = -159;
        short shortD = 27897;
        byte byteB = 67;
        System.out.println();
        System.out.println("Значение переменной floatB с типом "
                + type(floatB) + " равно " + floatB);
        System.out.println("Значение переменной longB с типом "
                + type(longB) + " равно " + longB);
        System.out.println("Значение переменной floatC с типом "
                + type(floatC) + " равно " + floatC);
        System.out.println("Значение переменной shortB с типом "
                + type(shortB) + " равно " + shortB);
        System.out.println("Значение переменной shortC с типом "
                + type(shortC) + " равно " + shortC);
        System.out.println("Значение переменной shortD с типом "
                + type(shortD) + " равно " + shortD);
        System.out.println("Значение переменной doubleA с типом "
                + type(byteB) + " равно " + byteB);

        // Task 3
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        byte sheetsPaper = (byte) (480 / (lp + as + ea));
        System.out.println();
        System.out.println("На каждого ученика рассчитано "
                + sheetsPaper + " листов бумаги");

        // Task 4
        byte bottlesInMin = 16 / 2;
        long bottles = 20 * bottlesInMin;
        System.out.println();
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
        byte jar = 120;
        byte classsrooms = (byte)(jar / (2 + 4));
        byte whiteJar = (byte) (classsrooms * 2);
        byte brownJar = (byte) (classsrooms * 4);
        System.out.println();
        System.out.println("В школе, где " + classsrooms + " классов, нужно " + whiteJar +
                " банок белой краски и " + brownJar + " банок коричневой краски");

        // Task 6
        byte banana = 5;
        byte weightBanana = 80;
        byte milk = 2;
        byte weigthMilk = 105;
        byte iceCream = 2;
        byte weightIceCream = 100;
        byte egg = 4;
        byte weightEgg = 70;
        short breakfastG = (short)(banana * weightBanana + milk * weigthMilk + iceCream * weightIceCream + egg * weightEgg);
        float breakfastKg = (float) breakfastG / 1000;
        System.out.printf("%nЗавтрак для спортсменов весит %dг или %.3fкг%n", breakfastG, breakfastKg);

        // Task 7
        short weight = 7000;
        short minLoss = 250;
        short maxLoss = 500;
        byte maxTime = (byte)(weight / minLoss);
        byte minTime = (byte)(weight / maxLoss);
        System.out.printf("%nПри похудении на %dг в день, потребуется - %d дней чтобы сбросить 7кг веса.%n",
                minLoss, maxTime);
        System.out.printf("При похудении на %dг в день, потребуется - %d дней чтобы сбросить 7кг веса.%n",
                maxLoss, minTime);
        System.out.printf("Среднее время похудения - %d день%n", (maxTime + minTime) / 2);

        // Task 8
        // Использовал массивы и цикл, так как это логично.
        String[] name = new String[] {"Маша", "Денис", "Крестина"};
        int[] salary = new int[] {67_760, 83_690, 76_230};
        int[] newSalary = new int[3];
        int[] dIncome = new int[3];
        System.out.println();
        for(byte i = 0; i < 3; i++) {
            newSalary[i] = (int)(salary[i] * 1.1);
            dIncome[i] = (int)(salary[i] * 0.1 * 12);
            System.out.printf("%s теперь получает %d рублей. Годовой доход вырос на %d рублей.%n",
                    name[i], newSalary[i], dIncome[i]);
        }

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