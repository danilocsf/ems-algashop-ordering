package com.algaworks.algashop.ordering.domain.valueobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PhoneTest {

    @Test
    void shouldThrowExceptionWhenPhoneIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            new Phone(null);
        });
    }

    @Test
    void shouldThrowExceptionWhenPhoneIsBlank() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Phone(" ");
        });
    }

}