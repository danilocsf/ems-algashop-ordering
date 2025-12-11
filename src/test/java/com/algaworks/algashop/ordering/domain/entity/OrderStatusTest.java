package com.algaworks.algashop.ordering.domain.entity;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderStatusTest {

    @Test
    public void canChangeTo() {
        Assertions.assertThat(OrderStatus.DRAFT.canChangeTo(OrderStatus.PLACED)).isTrue();
        Assertions.assertThat(OrderStatus.DRAFT.canChangeTo(OrderStatus.CANCELED)).isTrue();
        Assertions.assertThat(OrderStatus.PLACED.canChangeTo(OrderStatus.PAID)).isTrue();
        Assertions.assertThat(OrderStatus.PLACED.canChangeTo(OrderStatus.CANCELED)).isTrue();
        Assertions.assertThat(OrderStatus.PAID.canChangeTo(OrderStatus.READY)).isTrue();
        Assertions.assertThat(OrderStatus.PAID.canChangeTo(OrderStatus.CANCELED)).isTrue();
        Assertions.assertThat(OrderStatus.READY.canChangeTo(OrderStatus.CANCELED)).isTrue();
    }

    @Test
    public void canNotChangeTo() {
        Assertions.assertThat(OrderStatus.CANCELED.canNotChangeTo(OrderStatus.DRAFT)).isTrue();
        Assertions.assertThat(OrderStatus.CANCELED.canNotChangeTo(OrderStatus.PLACED)).isTrue();
        Assertions.assertThat(OrderStatus.CANCELED.canNotChangeTo(OrderStatus.PAID)).isTrue();
        Assertions.assertThat(OrderStatus.CANCELED.canNotChangeTo(OrderStatus.DRAFT)).isTrue();

        Assertions.assertThat(OrderStatus.READY.canNotChangeTo(OrderStatus.DRAFT)).isTrue();
        Assertions.assertThat(OrderStatus.READY.canNotChangeTo(OrderStatus.PAID)).isTrue();
        Assertions.assertThat(OrderStatus.READY.canNotChangeTo(OrderStatus.PLACED)).isTrue();

        Assertions.assertThat(OrderStatus.PLACED.canNotChangeTo(OrderStatus.DRAFT)).isTrue();
        Assertions.assertThat(OrderStatus.PLACED.canNotChangeTo(OrderStatus.READY)).isTrue();

        Assertions.assertThat(OrderStatus.PAID.canNotChangeTo(OrderStatus.DRAFT)).isTrue();
        Assertions.assertThat(OrderStatus.PAID.canNotChangeTo(OrderStatus.PLACED)).isTrue();

        Assertions.assertThat(OrderStatus.DRAFT.canNotChangeTo(OrderStatus.PAID)).isTrue();
        Assertions.assertThat(OrderStatus.DRAFT.canNotChangeTo(OrderStatus.READY)).isTrue();
    }

}