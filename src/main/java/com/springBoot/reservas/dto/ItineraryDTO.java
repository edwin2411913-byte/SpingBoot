package com.springBoot.reservas.dto;

import jakarta.validation.Valid;

import java.util.List;

public class ItineraryDTO {
    private List<SegmentDTO> segment;

    private PriceDTO price;
    @Valid
    public List<SegmentDTO> getSegment() {
        return segment;
    }

    public void setSegment(List<SegmentDTO> segment) {
        this.segment = segment;
    }

    public PriceDTO getPrice() {
        return price;
    }

    public void setPrice(PriceDTO price) {
        this.price = price;
    }
}
