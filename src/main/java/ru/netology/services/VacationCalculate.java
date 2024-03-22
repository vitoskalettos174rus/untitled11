package ru.netology.services;

public class VacationCalculate {
    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {

            if (money < threshold) { // можем ли отдыхать?
                System.out.println("месяц" + month + "Денег" + money + "Придеться работать" + "заработал" + income +
                        "потратил" + expenses);

                money = money + income - expenses;
            } else {

                int moneyBalance = money - expenses;
                int vacMoneyBalance = moneyBalance - ((money - expenses) / 3);


                System.out.println("месяц" + month + "Денег" + money + "буду отдыхать " + "потратил " + expenses +
                        "затем еще" + moneyBalance);

                money = (money - expenses) / 3;

                count++; // увеличиваем счётчик месяцев отдыха
            }
        }
        return count;
    }
}