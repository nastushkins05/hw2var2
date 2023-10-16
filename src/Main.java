public class Main {
    public static void main(String[] args) {
        int v1 = 467;
        byte v2 = 80;
        short v3 = 3498;
        long v4 = 567893029L;
        float v5 = 6.8f;
        double v6 = 68.89;

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println(v6);

        System.out.println("Номер 2");
        int i = 569;
        byte b = 67;
        double d = 27.12;
        float f = 2.786f;
        short s1 = -159;
        long l = 987_678_965_549L;
        short s2 = 27897;
        System.out.println(i);
        System.out.println(b);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        System.out.println("Номер 3");
        int LP = 23;
        int AS = 27;
        int EA = 30;
        int p = 480;
        int onepaper = p / (LP + AS + EA);
        System.out.println("На каждого ученика рассчитано " + onepaper + " листов бумаги");

        System.out.println("Number 4");
        int min = 8;
        int twmin = min * 20;
        int day = min * 1440;
        int thday = day * 3;
        int month = day * 31;
        System.out.println("За 20 минут машина произвела " + twmin +" штук бутылок");
        System.out.println("За день машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + thday + " штук бутылок");
        System.out.println("За месяц машина произвела "+ month + " штук бутылок");

        System.out.println("Номер 5");
        int s = 120;
        int w = 2;
        int br = 4;
        int c = s / (w + br);
        System.out.println("В школе, где " + c + " классов, нужно " + w * c +" банок белой краски и " +br * c + " банок коричневой краски");

        System.out.println("Number 6");
        int ban = 5 * 80;
        int milk = 105 * 2;
        int ice = 2 * 100;
        int eggs = 4 * 70;
        double sum = ban + eggs + ice + milk;
        System.out.println("Всего грамм " + sum + " В кг это " + sum / 1000 );

        System.out.println("Number 7");
        int total = 7;
        double day1 = 0.25;
        double day2 = 0.5;
        double resday1 = total / day1;
        double resday2 = total / day2;
        System.out.println("В среднем у него удет " +(resday1 + resday2) / 2+ " дней");

        System.out.println("Number 8");
        int m = 67_760;
        int den = 83_690;
        int k = 76_230;
        double m1 = m * 1.1;
        double den1 = den * 1.1;
        double k1 = k * 1.1;

        double mtotal = m * 12;
        double dentotal = den * 12;
        double ktotal = k * 12;
        double m1total = m1 * 12;
        double den1total = den1 * 12;
        double k1total = k1 * 12;

        System.out.println("Маша теперь получает "+ m1 + " рублей. Годовой доход вырос на " + (m1total - mtotal) +" рублей");
        System.out.println("Денис теперь получает "+ den1 + " рублей. Годовой доход вырос на " + (den1total - dentotal) + " рублей");
        System.out.println("Кристина теперь получает "+ k1 + " рублей. Годовой доход вырос на " + (k1total - ktotal) +" рублей");



    }
}