public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {

        // Задача 1

        byte book = 5;
        short cat = 2;
        int socks = 8;
        long apple = 120L;
        float nutsWeight = 11.5f;
        double potatoWeight = 3.7;
        boolean catIsAdult = cat > 10;
        char bar = 35;

    }
    public static void task2() {

        // Задача 2

        double weightBoxer1 = 78.2;
        double weightBoxer2 = 82.7;

        double totalWeight = weightBoxer1 + weightBoxer2;
        double weightDifference = Math.abs(weightBoxer1 - weightBoxer2);

        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");

    }
    public static void task3() {

        // Задача 3

        int banana = 5;
        int bananaWeight = 80;

        int milk = 200 / 100;
        int milkWeight = 105;

        int iceCream = 2;
        int iceCreamWeight = 100;

        int egg = 4;
        int eggWeight = 70;

        int breakfastWeight = (banana * bananaWeight) + (milk * milkWeight) + (iceCream * iceCreamWeight) + (egg * eggWeight);

        int gramInKg = 1000;

        double breakfastWeightKg = breakfastWeight / (gramInKg * 1.0);
        System.out.println("Общий вес завтрака " + breakfastWeightKg + " кг");
    }

    public static void task4() {

        // Задача 4

        int weight = 7;
        int kgInGrams = 1000;
        int weightInGrams = weight * kgInGrams;

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;

        int mindays = weightInGrams / maxGramsPerDay;
        int maxdays = weightInGrams / minGramsPerDay;

        int avgDays = (mindays + maxdays) / 2;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, понадобиться " + mindays + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, понадобиться " + maxdays + " дней");
        System.out.println("В среднем потребуется " + avgDays + " день");
    }

    public static void task5() {

        // Задача 5

        int percent = 10;
        double multiplier = percent / (100 * 1.0);

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaSalaryIncrease = (int) (mashaSalary + (mashaSalary * multiplier));
        int denisSalaryIncrease = (int) (denisSalary + (denisSalary * multiplier));
        int kristinaSalaryIncrease = (int) (kristinaSalary + (kristinaSalary * multiplier));

        int mashaSalaryYearDifference = (mashaSalaryIncrease - mashaSalary) * 12;
        int denisSalaryYearDifference = (denisSalaryIncrease - denisSalary) * 12;
        int kristinaSalaryYearDifference = (kristinaSalaryIncrease - kristinaSalary) * 12;

        System.out.println("Маша теперь получает " + mashaSalaryIncrease + " рублей. Годовой доход вырос на " + mashaSalaryYearDifference + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryIncrease + " рублей. Годовой доход вырос на " + denisSalaryYearDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryIncrease + " рублей. Годовой доход вырос на " + kristinaSalaryYearDifference + " рублей");

    }
}