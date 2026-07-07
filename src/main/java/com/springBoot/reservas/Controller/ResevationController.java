package com.springBoot.reservas.Controller;

import com.springBoot.reservas.dto.ReservationDTO;
import com.springBoot.reservas.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ResevationController {

    private ReservationService service;

    @Autowired
    public ResevationController(ReservationService service){
        this.service =service;
    }

    @GetMapping
    public ResponseEntity<List<ReservationDTO>> getReservation() {
        List<ReservationDTO> response = service.getReservations();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservationDTO> getReservationById(@PathVariable Long id) {
        ReservationDTO response = service.getReservationById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ReservationDTO> save(@RequestBody ReservationDTO reservation) {
        ReservationDTO response = service.save(reservation);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservationDTO> update(@PathVariable Long id, @RequestBody ReservationDTO reservation) {
        ReservationDTO response = service.update(id, reservation);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> dealite(@PathVariable Long id) {
        service.delete(id);
        return new ResponseEntity<>( HttpStatus.OK);
    }


}
