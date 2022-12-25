package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqr.csv")

    public void calculateTest(int expected, int lowerBound, int upperBound) {
        SQRService service = new SQRService();

        int actual = service.calculate(lowerBound, upperBound);
       // int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}
