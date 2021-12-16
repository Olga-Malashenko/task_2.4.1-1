package ru.netology.sqr;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"bordery values, 100, 9801, 90",
        "outside bordery values, 99, 9802, 90",
        "inside bordery values, 101, 9800, 88",
        "equivalent values, 4000, 5000, 7",
        "exsample from technical task values, 200, 300, 3",
        "outside diapason values, 4, 8, 0",}
    )
    void shouldCalcNumberOfSqrAtDiapason(String name, int bottom, int upper, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcNumberOfSqrAtDiapason(bottom, upper);
        assertEquals(expected, actual);
    }
}