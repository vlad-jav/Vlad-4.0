public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task8() {
        System.out.println("задача 8");
        int masha = 67760;
        int dinis = 83690;
        int kris = 76230;
        float percent = 1.1f;
        byte year = 12;
        int mashaPersent = (int) (masha*percent);
        System.out.println("надбавка маши "+mashaPersent);
        int mashaYear = masha* year;
        System.out.println("зарплата маши в год составляет "+mashaYear);
        int mashaYearPercent = mashaPersent* year;
        System.out.println("зарплата маши за год с 10% состовляет "+mashaYearPercent);
        int mashaDifference = mashaYearPercent - mashaYear;
        System.out.println("Маша теперь получает  " + mashaPersent+ " рублей. Годовой доход вырос на "+ mashaDifference+ " рублей");
        int dinisPersent = (int) (dinis*percent);
        int dinisYear = dinis * year;
        int dinisYearPercent = dinisPersent * year;
        int dinisDifference = dinisYearPercent-dinisYear;
        System.out.println("Динис теперь получает "+dinisPersent+ " рублей. Годовой доход вырос на "+ dinisDifference+ " рублей");
        int krisPersent = (int) (kris* percent);
        int krisYear = kris * year;
        int krisYearPercent = krisPersent * year;
        int krisDifference = krisYearPercent - krisYear;
        System.out.println("Кристина теперь получает "+krisPersent+ " рублей. Годовой доход вырос на "+ krisDifference+ " рублей ");







    }

    private static void task7() {
        System.out.println("задача 7");
        byte reset = 7;
        short loseWeightA =250;
        short loseWeightB =500;
        short Kg = 7000;
        short resetGrams = (short) (Kg *reset);
        System.out.println("нужно потерять "+resetGrams+ " г !");
        byte  daysA = (byte) (Kg / loseWeightA);
        System.out.println(" при "+loseWeightA+ " г поребуется "+daysA+ " дня ");
        byte dayB = (byte) (Kg / loseWeightB);
        System.out.println(" при "+loseWeightB+ " г поребуется "+dayB+ " дня ");
        byte numberOfOptions =2;
        short Options = (short) (loseWeightA+loseWeightB);
        System.out.println("общее "+Options);
        short average = (short) (Options/ numberOfOptions);
        System.out.println(" средний вес " +average+ " г !");
        double daysD = (short) (Kg / average);
        System.out.println(" Средний показатель "+daysD+ " дней ");



    }

    private static void task6() {
        System.out.println("задача 6");
        byte Bananas = 5;
        byte GramsB = 80;
        short BananasGrams = (short) (Bananas * GramsB);
        System.out.println("Бананы "+BananasGrams+ " г !");
        short MilkGrams = 205;
        System.out.println("Молоко "+MilkGrams+ " г !");
        byte cream =2;
        byte GramsC = 100;
        short creamGrams = (short) (cream * GramsC);
        System.out.println("Пломбир "+ creamGrams+ " г !");
        byte egg = 4;
        byte GramsE = 70;
        short eggGrams = (short) (egg *GramsE);
        System.out.println("Яйца "+eggGrams+ " г !");
        short totalWeight = (short) (eggGrams + creamGrams + MilkGrams + BananasGrams);
        System.out.println("общие количетво завтрака "+totalWeight+ " г !");
        float Kilogram = 0.001f ;
        float bananaskg = BananasGrams * Kilogram ;
        System.out.println("вес банабов "+bananaskg+ " кг !");
        double MilkKg = MilkGrams * Kilogram;
        System.out.println("вес молока "+ MilkKg+ " кг !");
        float creamKg = creamGrams * Kilogram ;
        System.out.println("Все пломбира "+creamKg+ " кг !");
        float eggKg = eggGrams * Kilogram;
        System.out.println("Вес яиц "+eggKg+ " кг !");
        double KilogramDreakfast = bananaskg+MilkKg+creamKg+eggKg;
        System.out.println(" общий вес завтрака "+KilogramDreakfast+ " кг !");






    }

    private static void task5() {
        System.out.println("задача 5");
        byte cans =120;
        byte white =2;
        byte brown =4;
        byte  brownWhite= (byte) (brown+white);
        System.out.println("количество краски на 1 класс "+brownWhite);
        byte cansPaint = (byte) (cans / brownWhite);
        System.out.println("количество классов  "+cansPaint);
        byte WhiteCans = (byte) (cansPaint * white);
        byte BrownCans = (byte) (brown * cansPaint);
        System.out.println("В школе, где "+ cansPaint+ " классов, нужно "+ WhiteCans+ " банок белой краски и "+ BrownCans+ " банок коричневой краски " );


    }

    private static void task4() {
        System.out.println("задача 4");
        byte bottle = 16;
        byte time = 2;
        byte timeA= 20;
        short timeB = 1440;
        short timeC = 4320;
        int timeD = 43200;
        byte bottleS = (byte) (bottle / time);
        System.out.println("бутылок в минуту "+bottleS+"шт !");
        short bottleSa = (short) (bottleS * timeA);
        System.out.println("За "+timeA+ " минут машина произвела "  +bottleSa+" штук бутылок");
        short bottleSb = (short) (bottleS * timeB);
        System.out.println("За "+timeB+ " минут машина произвела "  +bottleSb+" штук бутылок");
        int bottleSc = timeC * bottleS;
        System.out.println("За "+timeC+ " минут машина произвела "  +bottleSc+" штук бутылок");
        int bottleSd = bottleS * timeD;
        System.out.println("За "+timeD+ " минут машина произвела "  +bottleSd+" штук бутылок");








    }

    private static void task3() {
        System.out.println("задача 3");
        short paper = 480;
        byte teacherL = 23;
        byte teacherE = 30;
        byte teacherA = 27;
        byte milfs = (byte) (teacherA + teacherE+teacherL);
        System.out.println(" общее количество детей  " +milfs);
        byte paperВ = (byte) (paper / milfs);
        System.out.println("На каждого ученика рассчитано "+paperВ+ " листов бумаги ");

    }

    private static void task2() {
        System.out.println("задача 2");
        byte a = 67;
        System.out.println(a);
        short b = -159;
        System.out.println(b);
        int c =27897;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        long e =987678965549L;
        System.out.println(e);
        float h =27.12f;
        System.out.println(h);
        double g = 2.786;
        System.out.println(g);







    }


    private static void task1() {
        System.out.println("задача 1");
        byte a = 2;
        System.out.println(a);
        int b = 200000;
        System.out.println(b);
        long c = 987678967548L;
        System.out.println(c);
        short d = 32000;
        System.out.println(d);
        float e = 28.28f;
        System.out.println(e);
        double g = 28.28888;
        System.out.println(g);




    }

}
