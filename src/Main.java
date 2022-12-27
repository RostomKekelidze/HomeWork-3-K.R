public class Main {
    public static void main(String[] args) {
        short bananas = 200;
        System.out.println("Бананов" + bananas + "кг" );

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a + 1f;
        System.out.println( g );

        int money = 1000000;
        System.out.println ( "Значение переменной с типом"  + "равно" + money);
        byte cash = 100;
        System.out.println("Значение переменной с типом"  + "равно" + cash );
        short savings = 30000;
        System.out.println("Значение переменной с типом"  + "равно" + savings );
        long purpose = 10000000;
        System.out.println("Значение переменной с типом"  + "равно" + purpose );
        float risk = 2.5f;
        System.out.println("Значение переменной с типом"  + "равно" + risk );
        double ratio = 3.7;
        System.out.println("Значение переменной с типом"  + "равно" + ratio );

        double t2 = 27.12;
        System.out.println("Значение переменной с типом"  + "равно" + t2 );
        long d1 = 987678965549l;
        System.out.println("Значение переменной с типом"  + "равно" + d1 );
        float r1 = 2.786f;
        System.out.println("Значение переменной с типом"  + "равно" + r1 );
        short c1 = 569;
        System.out.println("Значение переменной с типом"  + "равно" + c1 );
        int a1 = 27897;
        System.out.println ( "Значение переменной с типом"  + "равно" + a1);
        byte b1= 67;
        System.out.println("Значение переменной с типом"  + "равно" + b1);

        byte LudmilaPavlovna = 23;
        System.out.println ("У учительницы" + LudmilaPavlovna + "учеников");
        byte AnnaSergeevna = 27;
        System.out.println ("У учительницы" + AnnaSergeevna + "учеников");
        byte EkaterinaAndreevna =30;
        System.out.println ("У учительницы" + EkaterinaAndreevna + "учеников");
        int totalStudent = AnnaSergeevna + EkaterinaAndreevna + LudmilaPavlovna;
        System.out.println("Всего учеников у всех учительниц" + totalStudent );
        int totalPapper = 480;
        System.out.println("Всего на всех ученик закупили" + totalPapper + " Листов бумаги" );
        int sheetsOfPaperForEachStudent = totalPapper / totalStudent;
        System.out.println("На каждого ученика рассчитано" + sheetsOfPaperForEachStudent + " Листов бумаги" );

        byte machinePerformance = 16 /2;
        System.out.println("В минуту машина производит" + machinePerformance + "бутылок" );
        int machinePerformancein20Minutes = machinePerformance * 20;
        System.out.println("За 20 минут машина производит" + machinePerformancein20Minutes + "бутылок" );
        int machinePerformanceinOneDay = machinePerformance * 1440;
        System.out.println("В сутки машина производит" + machinePerformanceinOneDay + "бутылок" );
        int machinePerformanceinThreeDay = machinePerformanceinOneDay * 3;
        System.out.println("За три дня машина производит" + machinePerformanceinThreeDay + "бутылок");
        long machinePerformanceinOneMonth = machinePerformanceinThreeDay * 10l;
        System.out.println("За месяц машина производит" + machinePerformanceinOneMonth + "бутылок");

        byte paintsForSchoolRepairs = 120;
        System.out.println("Всего закупленно" + paintsForSchoolRepairs + "банок краски");
        byte paintsForOneClass = 6;
        System.out.println("На каждый класс необходимо" + paintsForOneClass + "банок краски");
        int ClassInTheSchool = paintsForSchoolRepairs / paintsForOneClass;
        System.out.println("Всего в школе" + ClassInTheSchool + "классов");
        byte cansOfBrownPaintInTheOneClass = 4;
        System.out.println("На один класс используется" + cansOfBrownPaintInTheOneClass + "Банки коричневой краски" );
        byte cansOfWhitePaintInTheOneClass = 2;
        System.out.println("На один класс используется" + cansOfWhitePaintInTheOneClass + "Банки белой краски" );
        int cansOfBrownPaintInTheSchool = 4 * ClassInTheSchool ;
        System.out.println("На всю школу необходимо" + cansOfBrownPaintInTheSchool + "Банки белой краски" );
        int cansOfWhitePaintInTheOneSchool = 2 * ClassInTheSchool;
        System.out.println("На всю школу необходимо" + cansOfWhitePaintInTheOneSchool + "Банки коричневой краски" );
        System.out.println("В школе, где" + ClassInTheSchool + "классов, нужно" + cansOfWhitePaintInTheOneSchool +
         "банок белой краски и" + cansOfBrownPaintInTheSchool + " банок коричневой краски ");

        int bananasQ = 80;
        int milk = 200;
        int iceCream = 2;
        int eggs = 4;
        int bananasGramm = bananasQ * 5;
        System.out.println("Вес бананов которые сьедает спортсмен на затрак" + bananasQ);
        int milkMGramm = milk + 10;
        System.out.println("Вес молока которые сьедает спортсмен на затрак" + milkMGramm);
        int iceCreamGramm = iceCream * 100;
        System.out.println("Вес мороженного которые сьедает спортсмен на затрак" + iceCreamGramm);
        int eggsGramm = eggs * 70;
        System.out.println("Вес яиц которые сьедает спортсмен на затрак" + eggsGramm);
        int totalBreakfastWeight = bananasGramm + milkMGramm + iceCreamGramm + eggsGramm;
        System.out.println("Колличество граммов завтрака спортсмена" + totalBreakfastWeight );
        float totalBreakfastWeightKG = totalBreakfastWeight / 1000f;
        System.out.println("Колличество килограммов завтрака спортсмена" + totalBreakfastWeightKG);

       byte excessWeight = 7;
       System.out.println("Лишний вес спортсмена в килограммах" + excessWeight );
       int excessWeightGR = excessWeight * 1000;
       System.out.println("Лишний вес спортсмена в граммах" + excessWeightGR );
       int daysToLoseWeight1 = excessWeightGR / 250;
       System.out.println("Спортсмен скинет лишний вес за" + daysToLoseWeight1 + "дней" );
       int daysToLoseWeight2 = excessWeightGR / 500;
       System.out.println("Спортсмен скинет лишний вес за" + daysToLoseWeight2 + "дней" );
       int daysToLoseWeightOnAverage = (daysToLoseWeight2 + daysToLoseWeight1) / 2;
       System.out.println("В среднем спортсмен скинет лишний вес за" + daysToLoseWeightOnAverage + "дней" );

        int mashasSalary = 67760;
        int denisSalary = 83690;
        int kristinasSalary = 76230;
        int mashasSalaryRaising10 = mashasSalary * 10 / 100;
        System.out.println("Прибавка к зарплате Маше составит" + mashasSalaryRaising10  + "рублей" );
        int denisSalaryRaising10 = denisSalary * 10 / 100;
        System.out.println("Прибавка к зарплате Денису составит" + denisSalaryRaising10  + "рублей" );
        int kristinasSalaryRaising10 = kristinasSalary * 10 / 100;
        System.out.println("Прибавка к зарплате Кристине составит" + kristinasSalaryRaising10  + "рублей" );
        int mashasSalaryAnnualIncome = mashasSalary * 12;
        System.out.println("Годовой доход Маши до прибавки составил " + mashasSalaryAnnualIncome  + "рублей" );
        int denisSalaryAnnualIncome = denisSalary * 12;
        System.out.println("Годовой доход Денис до прибавки составил" + denisSalaryAnnualIncome  + "рублей" );
        int kristinasSalaryAnnualIncome = kristinasSalary * 12;
        System.out.println("Годовой доход Кристины до прибавки составил" + kristinasSalaryAnnualIncome + "рублей" );
        int mashasSalaryWithAnIncreaseMont = mashasSalary + mashasSalaryRaising10;
        System.out.println("Месячный доход Маши с прибавкой составил" + mashasSalaryWithAnIncreaseMont + "рублей" );
        int denisSalaryWithAnIncreaseMont = denisSalary + denisSalaryRaising10;
        System.out.println("Месячный доход Дениса с прибавкой составил" + denisSalaryWithAnIncreaseMont + "рублей" );
        int kristinasSalaryWithAnIncreaseMont = kristinasSalary + kristinasSalaryRaising10;
        System.out.println("Месячный доход Кристины с прибавкой составил" + kristinasSalaryWithAnIncreaseMont + "рублей" );
        int mashasSalaryWithAnIncreaseYear = mashasSalaryWithAnIncreaseMont * 12;
        System.out.println("Годовой доход Маши с прибавкой составил" + mashasSalaryWithAnIncreaseYear + "рублей" );
        int denisSalaryWithAnIncreaseYear = denisSalaryWithAnIncreaseMont * 12;
        System.out.println("Годовой доход Дениса с прибавкой составил" + denisSalaryWithAnIncreaseYear + "рублей" );
        int kristinasSalaryWithAnIncreaseYear = kristinasSalaryWithAnIncreaseMont * 12;
        System.out.println("Годовой доход Кристины с прибавкой составил" + kristinasSalaryWithAnIncreaseYear + "рублей" );
        int mashaHasADifference = mashasSalaryWithAnIncreaseYear - mashasSalaryAnnualIncome;
        System.out.println("Разница годового дохода Маши до и после повышения составила " + mashaHasADifference + "рублей" );
        int denisHasADifference = denisSalaryWithAnIncreaseYear - denisSalaryAnnualIncome;
        System.out.println("Разница годового дохода Дениса до и после повышения составила " + denisHasADifference + "рублей" );
        int kristinaHasADifference = kristinasSalaryWithAnIncreaseYear - kristinasSalaryAnnualIncome;
        System.out.println("Разница годового дохода Кристины до и после повышения составила " + kristinaHasADifference + "рублей" );

















    }
}
