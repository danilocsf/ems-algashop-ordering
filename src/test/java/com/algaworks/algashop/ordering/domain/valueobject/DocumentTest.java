package com.algaworks.algashop.ordering.domain.valueobject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DocumentTest {

    @Test
    void shouldThrowExceptionWhenDocumentIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            new Document(null);
        });
    }

    @Test
    void shouldThrowExceptionWhenDocumentIsBlank() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Document(" ");
        });
    }

}