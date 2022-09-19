public class Main {
    public static void main(String[] args) {
        // Задача 1

        byte book = 5;
        short cat = 2;
        int socks = 8;
        long apple = 120L;
        float nutsWeight = 11.5f;
        double potatoWeight = 3.7;
        boolean catIsAdult = cat > 10;
        char bar = 35;
        System.out.println (bar);
        System.out.println (catIsAdult);

        // Задача 2

        double weightBoxer1 = 78.2;
        double weightBoxer2 = 82.7;
        double totalWeight = weightBoxer1 + weightBoxer2;
        double weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");

        // Задача 3

        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCream = 100;
        int eggWeight = 70;
        double breakfastWeight = bananaWeight * 5 + milkWeight * 2 +iceCream * 2 + eggWeight * 4;
        double breakfastWeightKg = breakfastWeight / 1000;
        System.out.println("Общий вес завтрака " + breakfastWeightKg + " кг");

        // Задача 4

        int loseWeight = 7;
        double numberOfDays250 = loseWeight / 0.25;
        double numberOfDays500 = loseWeight / 0.5;
        double numberOfDaysAverage = (numberOfDays250 + numberOfDays500) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, понадобиться " + numberOfDays250 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, понадобиться " + numberOfDays500 + " дней");
        System.out.println("В среднем потребуется " + numberOfDaysAverage + " день");

        // Задача 5

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float mashaSalaryIncrease = mashaSalary * 1.1f;
        float denisSalaryIncrease = denisSalary * 1.1f;
        float kristinaSalaryIncrease = kristinaSalary * 1.1f;
        float mashaSalaryYearDifference = (mashaSalaryIncrease - mashaSalary) * 12;
        float denisSalaryYearDifference = (denisSalaryIncrease - denisSalary) * 12;
        float kristinaSalaryYearDifference = (kristinaSalaryIncrease - kristinaSalary) * 12;

        System.out.println("Маша теперь получает " + mashaSalaryIncrease + " рублей. Годовой доход вырос на " + mashaSalaryYearDifference + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryIncrease + " рублей. Годовой доход вырос на " + denisSalaryYearDifference + " рублей");
        System.out.println("Кристина теперь получает " + kristinaSalaryIncrease + " рублей. Годовой доход вырос на " + kristinaSalaryYearDifference + " рублей");

    }
}