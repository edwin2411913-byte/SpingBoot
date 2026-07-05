package com.springBoot.reservas.model;

import java.math.BigDecimal;

public class Price {
    private Long id;
    private BigDecimal totalPrice;

    private BigDecimal totalTax;

    private BigDecimal basePrice;

    public Price(Long id, BigDecimal totalPrice, BigDecimal basePrice, BigDecimal totalTax) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.basePrice = basePrice;
        this.totalTax = totalTax;
    }

    public Price() {
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalTax() {
        return totalTax;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTotalTax(BigDecimal totalTax) {
        this.totalTax = totalTax;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }
}
