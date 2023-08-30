public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.");
        byte a = 1;
        short b = 120;
        int c = 500;
        long d = 100_000L;
        float e = 0.5000007006f;
        double f = 0.5000000006;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом  равно " + f);
        System.out.println();

        System.out.println("Задача 2.");
        float a1 = 27.12f;
        long b1 = 987_678_965_549L;
        double c1 = 2.786; // по критериям оценки задания нужно перечислить все типы переменных, хотя можно обойтись и float
        short d1 = 569;
        short e1 = -159;
        int f1 = 27897;
        byte g1 = 67;
        System.out.println("По заданию нужно только инициализировать, без вывода в консоль.");
        System.out.println();

        System.out.println("Задача 3.");
        byte classStudentsLP = 23;
        byte classStudentsAS = 27;
        byte classStudentsEA = 30;
        short allPaper = 480;
        int allStudents = (classStudentsLP+classStudentsAS+classStudentsEA);
        int paperToStudent = allPaper/allStudents;
        System.out.println("На каждого ученика рассчитано " + paperToStudent + " листов бумаги.");
        System.out.println();

        System.out.println("Задача 4.");
        byte efficiencyPerTwoMinuts = 16;
        byte timeOfWork0 = 2;
        byte timeOfWork20 = 20;
        short timeOfWorkOneDay = 24*60;
        short timeOfWorkThreeDays = 24*3*60;
        int timeOfWorkOneMonth = 24*30*60;
        int efficiency =  efficiencyPerTwoMinuts/timeOfWork0;
        int efficiencyPer20Minuts =  efficiency*timeOfWork20;
        int efficiencyOneDay =  efficiency*timeOfWorkOneDay;
        int efficiencyThreeDays =  efficiency*timeOfWorkThreeDays;
        int efficiencyOneMonth =  efficiency*timeOfWorkOneMonth;
        System.out.println("За " + timeOfWork20 + " минут машина произвела " + efficiencyPer20Minuts + " штук бутылок.");
        System.out.println("За 1 сутки (" + timeOfWorkOneDay + " минут) машина произвела " + efficiencyOneDay + " штук бутылок.");
        System.out.println("За 3 дня (" + timeOfWorkThreeDays + " минут) машина произвела " + efficiencyThreeDays + " штук бутылок.");
        System.out.println("За 1 месяц (" + timeOfWorkOneMonth + " минут) машина произвела " + efficiencyOneMonth + " штук бутылок.");
        System.out.println();

        System.out.println("Задача 5.");
        byte requirement = 120;
        byte potsOfWhiteToOneClass = 2;
        byte potsOfBrownToOneClass = 4;
        int numberOfClasses = requirement/(potsOfWhiteToOneClass+potsOfBrownToOneClass);
        int numberOfWhitePaint = numberOfClasses*potsOfWhiteToOneClass;
        int numberOfBrownPaint = numberOfClasses*potsOfBrownToOneClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfWhitePaint + " банок белой краски и " + numberOfBrownPaint + " банок коричневой краски.");
        System.out.println();

        System.out.println("Задача 6.");
        byte oneBananaWeight = 80;
        float oneMilkMlWeight = 105/100f;
        byte oneIceCreamWeight = 100;
        byte oneEggWeight = 70;
        byte numberOfBananas = 5;
        short numberOfMlMilk = 200;
        byte numberOfIceCream = 2;
        byte numberOfEggs = 4;
        short grPerKg = 1000;
        int bananasWeight = oneBananaWeight*numberOfBananas;
        float milkWeight = oneMilkMlWeight*numberOfMlMilk;
        int iceCreamWeight = oneIceCreamWeight*numberOfIceCream;
        int eggsWeight = oneEggWeight*numberOfEggs;
        float weightOfBreakfastGr = bananasWeight+milkWeight+iceCreamWeight+eggsWeight;
        float weightOfBreakfastKg = weightOfBreakfastGr/grPerKg;
        System.out.println("Вес спортзавтрака составляет " + weightOfBreakfastGr + " граммов.");
        System.out.println("Вес спортзавтрака составляет " + weightOfBreakfastKg + " килограммов.");
        System.out.println();

        System.out.println("Задача 7.");
        short kgToGr= 1000;
        short resultKg = 7;
        short result250GrPerDay = 250;
        short result500GrPerDay = 500;
        int resultGr = resultKg*kgToGr;
        int numberOfDaysPer250Gr = resultGr/result250GrPerDay;
        int numberOfDaysPer500Gr = resultGr/result500GrPerDay;
        int avegareValueOfWeight = (result250GrPerDay+result500GrPerDay)/2;
        float numberOfDaysPerAverageValueW = (float)resultGr/avegareValueOfWeight; //Это если считать через средний вес похудения в день. Можно было оставить в int, тогда округлится до 19 дней.
        int numberOfDaysPerAverageValueD = (numberOfDaysPer250Gr+numberOfDaysPer500Gr)/2; //Это если считать через среднее количество дней.
        System.out.println(numberOfDaysPer250Gr + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + result250GrPerDay + " граммов.");
        System.out.println(numberOfDaysPer500Gr + " дней уйдет на похудение, если спортсмен будет терять каждый день по " + result500GrPerDay + " граммов.");
        System.out.println("В среднем " + numberOfDaysPerAverageValueW + " дней уйдет на похудение."); //Это если считать через средний вес похудения в день. Можно было оставить в int, тогда округлится до 19 дней.
        System.out.println("В среднем " + numberOfDaysPerAverageValueD + " день уйдет на похудение."); //Это если считать через среднее количество дней.
        System.out.println();

        System.out.println("Задача 8.");
        int salaryOfMashaPerMonth = 67_760; // Текущая зп Маши в месяц
        int salaryOfDenisPerMonth = 83_690; // Текущая зп Дениса в месяц
        int salaryOfKrisPerMonth = 76_230;  // Текущая зп Кристины в месяц
        byte numberOfMonths = 12;   //количество месяцев в году
        int salaryOfMashaPerYearBeforeProm = salaryOfMashaPerMonth*numberOfMonths;  //Годовая зп Маши до повышения
        int salaryOfDenisPerYearBeforeProm = salaryOfDenisPerMonth*numberOfMonths;  //Годовая зп Дениса до повышения
        int salaryOfKrisPerYearBeforeProm = salaryOfKrisPerMonth*numberOfMonths;    //Годовая зп Кристины до повышения
        int salaryOfMashaPerMonthAfterProm = salaryOfMashaPerMonth + salaryOfMashaPerMonth * 10/100;  //Месячная зп Маши после повышения
        int salaryOfDenisPerMonthAfterProm = salaryOfDenisPerMonth + salaryOfDenisPerMonth * 10/100;  //Месячная зп Дениса после повышения
        int salaryOfKrisPerMonthAfterProm = salaryOfKrisPerMonth + salaryOfKrisPerMonth * 10/100;    //Месячная зп Кристины после повышения
        int salaryOfMashaPerYearAfterProm = salaryOfMashaPerMonthAfterProm * numberOfMonths;  //Годовая зп Маши после повышения
        int salaryOfDenisPerYearAfterProm = salaryOfDenisPerMonthAfterProm * numberOfMonths;  //Годовая зп Дениса после повышения
        int salaryOfKrisPerYearAfterProm = salaryOfKrisPerMonthAfterProm * numberOfMonths;   //Годовая зп Кристины после повышения
        int salaryDifferenceOfMasha = salaryOfMashaPerYearAfterProm % salaryOfMashaPerYearBeforeProm;   //разница между годовыми зп Маши до и после повышения
        int salaryDifferenceOfDenis = salaryOfDenisPerYearAfterProm % salaryOfDenisPerYearBeforeProm;   //разница между годовыми зп Дениса до и после повышения
        int salaryDifferenceOfKris = salaryOfKrisPerYearAfterProm % salaryOfKrisPerYearBeforeProm;  //разница между годовыми зп Кристины до и после повышения
        System.out.println("Маша теперь получает " + salaryOfMashaPerMonthAfterProm + " рублей. Годовой доход вырос на " + salaryDifferenceOfMasha + " рублей.");
        System.out.println("Денис теперь получает " + salaryOfDenisPerMonthAfterProm + " рублей. Годовой доход вырос на " + salaryDifferenceOfDenis + " рублей.");
        System.out.println("Кристина теперь получает " + salaryOfKrisPerMonthAfterProm + " рублей. Годовой доход вырос на " + salaryDifferenceOfKris + " рублей.");
    }
}