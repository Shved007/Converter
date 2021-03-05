package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ConvertingImpl implements Converting {
    @Override
    public void uahToUsd(BigDecimal money) {
        BigDecimal rate = new BigDecimal("0.0358");
        BigDecimal res = money.multiply(rate).setScale(2, RoundingMode.CEILING);
        System.out.println(res + "$");
    }

    @Override
    public void uahToEur(BigDecimal money) {
        BigDecimal rate = new BigDecimal("0.0293");
        BigDecimal res = money.multiply(rate).setScale(2, RoundingMode.CEILING);
        System.out.println(res + "€");
    }

    @Override
    public void usdToUah(BigDecimal money) {
        BigDecimal rate = new BigDecimal("27.93");
        BigDecimal res = money.multiply(rate).setScale(2, RoundingMode.CEILING);
        System.out.println(res + "₴");
    }

    @Override
    public void usdToEur(BigDecimal money) {
        BigDecimal rate = new BigDecimal("0.82");
        BigDecimal res = money.multiply(rate).setScale(2, RoundingMode.CEILING);
        System.out.println(res + "€");
    }

    @Override
    public void eurToUah(BigDecimal money) {
        BigDecimal rate = new BigDecimal("34.15");
        BigDecimal res = money.multiply(rate).setScale(2, RoundingMode.CEILING);
        System.out.println(res + "₴");
    }

    @Override
    public void eurToUsd(BigDecimal money) {
        BigDecimal rate = new BigDecimal("1.22");
        BigDecimal res = money.multiply(rate).setScale(2, RoundingMode.CEILING);
        System.out.println(res + "$");
    }

    public void convert() throws InterruptedException {
        boolean start = true;
        while(start) {
            Scanner scanner = new Scanner(System.in);
            text();
            String choose2 = scanner.nextLine();
            System.out.println("Вкажіть суму:");
            BigDecimal money = scanner.nextBigDecimal();
            System.out.println("converting...\n" +
                    "........");
            Thread.sleep(200);
            System.out.println(" ...... ");
            Thread.sleep(200);
            System.out.println("  .... ");
            Thread.sleep(200);
            System.out.println("   ..  ");
            Thread.sleep(200);
            System.out.println("    .  ");
            Thread.sleep(200);
            System.out.println("   ..  ");
            Thread.sleep(200);
            System.out.println("  .... ");
            Thread.sleep(200);
            System.out.println(" ...... ");
            Thread.sleep(200);
            System.out.println("........");
            Thread.sleep(200);
            System.out.println("   |\n" +
                    "   V");
            switch (choose2) {
                case "1" -> uahToUsd(money);
                case "2" -> uahToEur(money);
                case "3" -> usdToUah(money);
                case "4" -> usdToEur(money);
                case "5" -> eurToUah(money);
                case "6" -> eurToUsd(money);
                default -> System.out.println("Щось пішло не так!!!!@@@@@@@@@@&&@&@&#&&@!&!&&");
            }
            String choose = convertAgain();
            boolean again = validateConvertAgain(choose);
            start = again;
        }
    }

    public void text() {
        System.out.println(
                "1.Гривні(UAH) перевести у Долари США(USD)\n" +
                        "2.Гривні(UAH) перевести у Євро(EUR)\n" +
                        "3.Долари США(USD) перевести у Гривні(UAH)\n" +
                        "4.Долари США(USD) перевести у Євро(EUR)\n" +
                        "5.Євро(EUR) перевести у Гривні(UAH)\n" +
                        "6.Євро(EUR) перевести у Долари США(USD)");
        System.out.println("Зробіть свій вибір:");
    }

    public static boolean validateConvertAgain(String choose) {
        if (choose.equals("+")) {
            return true;
        } else if (choose.equals("-")) {
            System.out.println("До побачення!");
            return false;
        }
        return false;
    }

    public static String convertAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.println("- Для виходу натисніть -\n" +
                "- Спробувати знову натисніть +");
        String choose = sc.nextLine();
        return choose;
    }
}
