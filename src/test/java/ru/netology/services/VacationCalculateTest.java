package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationCalculateTest {
    @ParameterizedTest
    @CsvSource({
            "3,10000,3000,20000",
            "2,100000,60000,150000"
    })
    public void testTresholintd(int expected, int income, int expenses, int threshold){

        VacationCalculate service = new VacationCalculate();

        int actual  = service.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected,actual);
    }
}


