import java.math.BigDecimal;

public class IfElseStatementTheme {
    public static void main(String[] args) {

        // 1 Перевод псевдокода на язык Java

        boolean isManSex = true;
        if (!isManSex) {
            System.out.println("это не мужчина");
        } else {
            System.out.println("это мужчина");
        }
        byte age = 99;
        if (age > 18) {
            System.out.println("старшой");
        } else {
            System.out.println("пиздюк");
        }
        float height = 2.3f;
        if (height < 1.8) {
            System.out.println("карлан");
        } else {
            System.out.println("длинный");
        }
        char firstCharName = "Саша".charAt(0);
        if (firstCharName == 'С') {
            System.out.println("это может быть Саша");
        } else if (firstCharName == 'Н') {
            System.out.println("это может быть Никита");
        } else {
            System.out.println("это натурал");
        }

        // 2 поиск большего числа

        byte x = 10;
        byte y = 20;
        if (x > y) {
            System.out.println(x);
        } else if (x < y) {
            System.out.println(y);
        } else {
            System.out.println("x равен y");
        }

        // 3 проверка числа

        byte z = 0;
        boolean isEvenNumber = z % 2 == 0;
        boolean isPositives = (z > 0);
        if (z == 0) {
            System.out.println("z равен 0");
        } else if (isEvenNumber == true & z > 0) {
            System.out.println("Число " + z + " является четным и положительным");
        } else if (isEvenNumber == false & z > 0) {
            System.out.println("Число " + z + " является нечетным и положительным");
        } else if (isEvenNumber == true & z < 0) {
            System.out.println("Число " + z + " является четным и отрицательным");
        } else if (isEvenNumber == false & z < 0) {
            System.out.println("Число " + z + " является нечетным и отрицательным ");
        }

        // 4 поиск одинаковых цифр в числах

        short n = 123;
        short m = 223;
        String p = Short.toString(n);
        String o = Short.toString(m);


        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == o.charAt(i)) {
                System.out.println("равный разряд: " + (i + 1));
            } else {
                System.out.println("разряды не равны " + (i + 1));
            }
        }

        // 5. Определение символа по его коду


        char p1 = '\u0031';
        String u = Short.toString((short) p1);

        if (Character.isUpperCase(p1)) {
            System.out.println("'" + p1 + "' - Большая буква");
        } else if (Character.isDigit(p1)) {
            System.out.println("'" + p1 + "' - цифра");
        } else if (Character.isAlphabetic(p1)) {
            System.out.println("'" + p1 + "' - маленькая буква");
        } else {
            System.out.println("'" + p1 + "' - ни буква и ни цифра");
        }

        // 6. Подсчет начисленных банком процентов

        float money = 321123.59F;
        if ( money < 100000 ) {
            System.out.println( money );
            System.out.println( money * 0.05 );
            System.out.println( money * 0.05 + money);
        } else if ( 100000 < money && money < 300000 ) {
            System.out.println( money );
            System.out.println( money * 0.07 );
            System.out.println( money * 0.07 + money);
        } else {
            System.out.println( money );
            System.out.println( money * 0.1 );
            System.out.println( money * 0.1 + money);
        }

//        // другое решение через тернарный оператор
//        float money = 321123.59F;
//        float percent = money < 100000
//                ? 0.05F
//                : money < 300000
//                ? 0.07F
//                : 0.1F;
//        float profit1 = money * percent;
//        profit1 = money * percent;
//        System.out.println(money);
//        System.out.println(profit1);
//        System.out.println(money + profit1);


        // 7. Определение оцеки по предметам

        byte percentHistory = 59;
        byte percentProgram = 92;
        float averageScore = 0F;
        int count = 0;
        if (percentHistory <= 60) {
            System.out.println("История - 2");
            averageScore += 2;
            count++;
        } else if (percentHistory > 60 && percentHistory < 73) {
            System.out.println("История - 3");
            averageScore += 3;
            count++;
        } else if (percentHistory > 73 && percentHistory < 91) {
            System.out.println("История - 4");
            averageScore += 4;
            count++;
        } else {
            System.out.println("История - 5");
            averageScore += 5;
            count++;
        }
        if (percentProgram <= 60) {
            System.out.println("Програмированние - 2");
            averageScore += 2;
            count++;
        } else if (percentProgram > 60 && percentProgram < 73) {
            System.out.println("Програмированние - 3");
            averageScore += 3;
            count++;
        } else if (percentProgram > 73 && percentProgram < 91) {
            System.out.println("Програмированние - 4");
            averageScore += 4;
            count++;
        } else {
            System.out.println("Програмированние - 5");
            averageScore += 5;
            count++;
        }
        System.out.println(averageScore);
        System.out.println(count);
        System.out.println("" + (averageScore / count) + " - средний балл по предметам");
        System.out.println("" + (percentHistory + percentHistory / 2) + "% - средний процент по предметам");


        // 8. Расчет годовой прибыли

        float product = 193025.233F;
        float room = 5123.018F;
        float production = 9001.729F;
        float profit = (product - room - production);
        System.out.println(profit);
        if (profit > 0) {
            System.out.println("прибыль за год +" + (profit * 12) + "");
        } else if (profit < 0) {
            System.out.println("прибыль за год " + (profit* 12) + "");
        } else {
            System.out.println("прибыль за год 0");
        }

        // 10. Расчет годовой прибыли
        BigDecimal product2 = new BigDecimal("193025.233");
        BigDecimal room2 = new BigDecimal("5123.018");
        BigDecimal production2 = new BigDecimal("9001.729");
        BigDecimal profit2 = product2.subtract(production2).subtract(room2);
        System.out.println(profit2);
        if (profit2.compareTo(BigDecimal.ZERO)> 0) {
            System.out.println("прибыль за год +" + (profit2.multiply(new BigDecimal(12))) + "");
        } else if (profit2.compareTo(BigDecimal.ZERO)< 0) {
            System.out.println("прибыль за год " + (profit2.multiply(new BigDecimal(12))) + "");
        } else {
            System.out.println("прибыль за год 0");

    }
        }
}

