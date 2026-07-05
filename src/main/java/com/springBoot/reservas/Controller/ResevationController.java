package com.springBoot.reservas.Controller;

import com.springBoot.reservas.dto.ReservationDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ResevationController {

    @GetMapping
    public ResponseEntity<List<ReservationDTO>> getReservation() {
        List<ReservationDTO> response = new ArrayList<>();
        response.add(new ReservationDTO());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReservationDTO> getReservationById(@PathVariable Long id) {
        ReservationDTO response = new ReservationDTO();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ReservationDTO> save(@RequestBody ReservationDTO reservation) {
        ReservationDTO response = new ReservationDTO();
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ReservationDTO> update(@PathVariable Long id, @RequestBody ReservationDTO reservation) {
        ReservationDTO response = new ReservationDTO();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> dealite(@PathVariable Long id) {
        return new ResponseEntity<>( HttpStatus.OK);
    }

}
