package com.algaworks.algashop.ordering.domain.valueobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class BirthDateTest {

    @Test
    void shouldThrowExceptionWhenDateIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            new BirthDate(null);
        });
    }

    @Test
    void shouldThrowExceptionWhenDateIsFutureDate() {
        LocalDate futureDate = LocalDate.now().plusDays(1);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new BirthDate(futureDate);
        });
    }

    @Test
    void shouldReturnCorrectAge() {
        LocalDate date = LocalDate.now().minusYears(20);
        BirthDate birthDate = new BirthDate(date);
        Assertions.assertEquals(20, birthDate.age());
    }

}