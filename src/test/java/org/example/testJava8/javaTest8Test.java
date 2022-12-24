package org.example.testJava8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


class JavaTest8Test {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/javaTest8.csv")
    public void resultNumbers(int expected, int a, int b) {
        JavaTest8 javaTest8 = new JavaTest8();
        int actual = javaTest8.twoNumber(5, 3);
        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/javaTest8.csv")
    public void resultNumbersReturn(int expected, int a, int b) {
        JavaTest8 javaTest8 = new JavaTest8();
        int actual = javaTest8.twoNumber(3, 5);
        Assertions.assertEquals(expected, actual);
    }
}
