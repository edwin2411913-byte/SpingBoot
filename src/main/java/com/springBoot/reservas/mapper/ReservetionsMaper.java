package com.springBoot.reservas.mapper;

import com.springBoot.reservas.dto.ReservationDTO;
import com.springBoot.reservas.model.Reservation;
import org.springframework.core.convert.converter.Converter;

import java.util.List;

public interface ReservetionsMaper extends Converter<List<Reservation>, List<ReservationDTO>> {

    @Override
    List<ReservationDTO> convert(List<Reservation> source);

}
