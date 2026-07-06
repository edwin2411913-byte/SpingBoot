package com.springBoot.reservas.services;

import com.springBoot.reservas.dto.ReservationDTO;
import com.springBoot.reservas.exeption.ExeptionPersonal;
import com.springBoot.reservas.model.Reservation;
import com.springBoot.reservas.repository.ReservationRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRespository repository;
    private final ConversionService conversionService;


    @Autowired
    public ReservationService(ReservationRespository repository,
                              ConversionService conversionService) {
        this.repository = repository;
        this.conversionService = conversionService;
    }

    public List<ReservationDTO> getReservations(){
        return conversionService.convert(repository.getReservations(), List.class );
    }

    public ReservationDTO getReservationById(Long id){
        Optional<Reservation> result = repository.getReservationById(id);
        if(result.isEmpty()){
            throw new ExeptionPersonal("No existe");
        }
        return  conversionService.convert(result.get(), ReservationDTO.class);
    }

    public ReservationDTO save(ReservationDTO reservation){
        if(Objects.nonNull(reservation.getId())) {
            throw new ExeptionPersonal("Duplicate it");
        }
        Reservation transformed = conversionService.convert(reservation, Reservation.class);
        Reservation result =  repository.save(Objects.requireNonNull(transformed));
        return conversionService.convert(result, ReservationDTO.class);

    }

    public ReservationDTO update(Long id, ReservationDTO reservation) {
        if(repository.getReservationById(id) == null){
            throw new ExeptionPersonal("No existe");
        }
        Reservation transformed = conversionService.convert(reservation, Reservation.class);
        Reservation result =  repository.update(id,Objects.requireNonNull(transformed));
        return conversionService.convert(result, ReservationDTO.class);
    }


    public void delete(Long id) {
        if(repository.getReservationById(id) == null){
            throw new ExeptionPersonal("No existe");
        }
        repository.delete(id);
    }


}
