package com.algaworks.algashop.ordering.domain.valueobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FullNameTest {

    @Test
    void shouldThrowExceptionWhenFirstNameIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            new FullName(null, "Any");
        });
    }

    @Test
    void shouldThrowExceptionWhenLastNameIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            new FullName("Any", null);
        });
    }

    @Test
    void shouldThrowExceptionWhenFirstNameIsBlank() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new FullName(" ", "Any");
        });
    }

    @Test
    void shouldThrowExceptionWhenLastNameIsBlank() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new FullName("Any", "");
        });
    }

    @Test
    void shouldTrimFirstNameAndLastName() {
        String name = "Name ";
        String lastName = "Lastname ";
        FullName fullName = new FullName(name, lastName);

        Assertions.assertEquals(fullName.firstName(), "Name");
        Assertions.assertEquals(fullName.lastName(), "Lastname");
    }

}