public class Main {
    public static void main(String[] args) {
        //////////////Task1//////////////
        System.out.println ("//////////////Task1//////////////");
        int empire = 10;
        System.out.println(" Значение переменной empire с типои int равно " + empire);
        byte republic = 5;
        System.out.println(" Значение переменной republic с типои byte равно " + republic);
        short bank = 3;
        System.out.println(" Значение переменной bank с типои short равно " + bank);
        long solarSystemAge = 1_000_000_000L;
        System.out.println(" Значение переменной solarSystemAge с типои long равно " + solarSystemAge);
        float kazna = 3.584585268F;
        System.out.println(" Значение переменной kazna с типои float равно " + kazna);
        double bid = 1.7;
        System.out.println(" Значение переменной bid с типои double равно " + bid);


        //////////////Task2//////////////
        System.out.println ("//////////////Task2//////////////");
        float check1 = 27.12F;
        long check2 = 987_678_965_549L;
        double check3 = 2.786;
        boolean check4 = false;
        char check5 = 569;
        short check6 = -159;
        int check7 = 27897;
        byte check8 = 67;


        //////////////Task3//////////////
        System.out.println ("//////////////Task3//////////////");
        int apprenticeClass1 = 23;
        int apprenticeClass2 = 27;
        int apprenticeClass3 = 30;
        int papersCount = 480;
        int papersPerApprentice = papersCount /(apprenticeClass1+apprenticeClass2+apprenticeClass3);
        System.out.println("На каждого ученика рассчитано " + papersPerApprentice + " листов бумаги");



        //////////////Task4//////////////
        System.out.println ("//////////////Task4//////////////");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinute = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + productivityPerMinute * twentyMinutes + " штук");
        int minutesPerDay = 24 * 60;
        System.out.println("За " + minutesPerDay + " минут машина произвела бутылок " + productivityPerMinute * minutesPerDay + " штук");
        int minutesInThreeDays = 3 * minutesPerDay;
        System.out.println("За " + minutesInThreeDays + " минут машина произвела бутылок " + productivityPerMinute * minutesInThreeDays + " штук");
        int minutesForMounth = 10 *minutesInThreeDays; // в месяце 31 день
        System.out.println("За " + minutesForMounth + " минут машина произвела бутылок " + productivityPerMinute * minutesForMounth + " штук");


        //////////////Task5//////////////
        System.out.println ("//////////////Task5//////////////");
        int totalJars = 120;
        int whiteJars = 2;
        int brownJars = 4;
        int TotalClasses = totalJars / (whiteJars + brownJars);
        int totalWhiteJars = TotalClasses * whiteJars;
        int totalBrownJars = TotalClasses * brownJars;
        System.out.println("В школе, где " + TotalClasses + " классов, нужно " + totalWhiteJars + " банок белой краски и " + totalBrownJars + " банок коричневой краски");


        //////////////Task6//////////////
        System.out.println ("//////////////Task6//////////////");
        int bananas = 5;
        int milk = 210;
        int iceCream = 2;
        int eggs = 4;
        float weightGr = (bananas * 80) + milk + (iceCream * 100) + (eggs * 70);
        int grPerKg = 1000;
        float weightKg = weightGr/(float)grPerKg;
        System.out.println(weightKg);



        //////////////Task7//////////////
        System.out.println ("//////////////Task7//////////////");
        int objective = 7000;
        int ration1 = 250;
        int ration2 = 500;
        int commonDays1 = objective / ration1;
        int commonDays2 = objective / ration2;
        System.out.println ("чтобы добиться результата похудения, может потребоваться в среднем " + commonDays1 + " дней");
        System.out.println ("чтобы добиться результата похудения, может потребоваться в среднем " + commonDays2 + " дней");





        //////////////Task8//////////////
        System.out.println ("//////////////Task8//////////////");
        int MashaCurrent = 67760;
        int DenisCurrent = 83690;
        int KristinaCurrent = 76230;
        int promotion = 10;
        int MashaMounthDouble = promotion * MashaCurrent / 100;
        int NewMashaPayment = MashaMounthDouble + MashaCurrent;
        System.out.println("Маша теперь получает " + NewMashaPayment + " рублей");
        int MashaYearIncome = promotion * MashaCurrent / 100 * 12;
        System.out.println("Годовой доход вырос на " + MashaYearIncome + " рублей");
        int DenisMounthDouble = promotion * DenisCurrent / 100;
        int NewDenisPayment = DenisMounthDouble + DenisCurrent;
        System.out.println("Денис теперь получает " + NewDenisPayment + " рублей");
        int DenisYearIncome = promotion * DenisCurrent / 100 * 12;
        System.out.println("Годовой доход вырос на " + DenisYearIncome + " рублей");
        int KristinaMounthDouble = promotion * KristinaCurrent / 100;
        int NewKristinaPayment = KristinaMounthDouble + KristinaCurrent;
        int KristinaYearIncome = promotion * KristinaCurrent / 100 * 12;
        System.out.println("Кристина теперь получает " + NewKristinaPayment + " рублей ");
        System.out.println("Годовой доход вырос на " + KristinaYearIncome + " рублей");


















    }
}