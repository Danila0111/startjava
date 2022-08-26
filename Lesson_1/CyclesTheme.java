public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int x = -10;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if (x % 2 == 0) {
                sumOdd += x;
            } else {
                sumEven += x;
            }
            x++;
        } while (x < 22);
        System.out.println("Сумма четных чисел = " + sumOdd);
        System.out.println("Сумма нечетных чисел = " + sumEven);

        System.out.println("\n2. Вывод чисел между max и min");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = 0;
        if ((number1 > number2) && (number1 > number3)) {
            max = number1;
        } else if ((number2 > number1) && (number2 > number3)) {
            max = number2;
        } else {
            max = number3;
        }
        int min = 0;
        if ((number1 < number2) && (number1 < number3)) {
            min = number1;
        } else if ((number2 < number1) && (number2 < number3)) {
            min = number2;
        } else {
            min = number3;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.println(i);
        }

        System.out.println("\n3 Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sumDigits = 0;
        int currDigit;
        System.out.print("исходное число в обратном порядке: ");
        while (srcNum > 0) {
            currDigit = srcNum % 10;
            srcNum /= 10;
            sumDigits += currDigit;
            System.out.print(currDigit);
        }
        System.out.println("\tсумма цифр числа: " + sumDigits);

        System.out.println("\n4. Вывод чисел [1, 24) на консоль в несколько строк");
        int counter = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.format("%4d", i);
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
            }
        }
        for (int i = 1; i <= (5 - counter % 5); i++) {
            System.out.format("%4d", 0);
        }

        System.out.println("\n\n5. Проверка количества единиц на четность");
        srcNum = 3141591;
        int tmpNum = srcNum;
        int countOne = 0;
        while (tmpNum > 0) {
            if (tmpNum % 10 == 1) {
                countOne++;
            }
            tmpNum /= 10;
        }
        if (countOne % 2 == 0) {
            System.out.println("Количество единиц является четным");
        } else {
            System.out.println("Количество единиц является нечетным");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        // отображаем фигуру из *
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // отображаем фигуру из #
        int lineCounter = 5;
        counter = 0;
        while (lineCounter > 0) {
            counter = lineCounter;
            while (counter > 0) {
                System.out.print("#");
                counter--;
            }
            System.out.println();
            lineCounter--;
        } 
        System.out.println();

        // отображаем фигуру из $
        int ouputCounter = 1;
        lineCounter = 1;
        counter = 1;
        do {
            ouputCounter = 1;
            do {
                System.out.print("$");
                ouputCounter++;
            } while (ouputCounter <= counter);
            System.out.println();
            lineCounter++;
            if (lineCounter <= 3) {
                counter++;
            } else {
                counter--;
            }
        } while (lineCounter <= 5);

        //Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.println("Dec Char");
        for (int i = 1; i != 49; i += 2) {
            System.out.format("%-3d %-3c%n", i, i);
        }
        for (int i = 97; i != 123; i = i + 2) {
            System.out.format("%-3d %-3c%n", i, i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        tmpNum = srcNum;
        int reverceNum = 0;
        while (tmpNum > 0) {
            reverceNum = reverceNum * 10 + tmpNum % 10;
            tmpNum /= 10;
        }
        if (srcNum == reverceNum) {
            System.out.println("Число 1234321 является палиндромом");
        } else {
            System.out.println("Число 1234321 неявляется палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNum = 123132;
        sumDigits = 0;
        while (srcNum > 0) {
            if (srcNum / 1000 > 0) {
                sumDigits += srcNum % 10;
            } else {
                sumDigits -= srcNum % 10;
            }
            srcNum /= 10;
        }
        if (sumDigits == 0) {
            System.out.println("число является счастливым");
        } else {
            System.out.println("число НЕ является счастливым");
        }

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("   |  2  3  4  5  6  7  8  9");
        System.out.println("----------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.format("%2d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.format("%3d", i * j);
            }
            System.out.println();
        }
   }
}