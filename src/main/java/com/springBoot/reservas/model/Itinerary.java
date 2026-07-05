package com.springBoot.reservas.model;

import java.util.List;

public class Itinerary {
    private Long id;
    private List<Segment> segment;

    public Itinerary() {
    }

    public Itinerary(Long id, List<Segment> segment, Price price) {
        this.id = id;
        this.segment = segment;
        this.price = price;
    }

    private Price price;

    public List<Segment> getSegment() {
        return segment;
    }

    public void setSegment(List<Segment> segment) {
        this.segment = segment;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
