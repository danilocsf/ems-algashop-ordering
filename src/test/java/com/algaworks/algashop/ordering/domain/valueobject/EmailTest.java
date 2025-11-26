package com.algaworks.algashop.ordering.domain.valueobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldThrowExceptionWhenEmailIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            new Email(null);
        });
    }

    @Test
    void shouldThrowExceptionWhenEmailIsBlank() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Email(" ");
        });
    }

    @Test
    void shouldThrowExceptionWhenEmailIsInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Email("abcdefg");
        });
    }

}