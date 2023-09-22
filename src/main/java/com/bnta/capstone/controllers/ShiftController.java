package com.bnta.capstone.controllers;

import com.bnta.capstone.models.Shift;
import com.bnta.capstone.models.Type;
import com.bnta.capstone.services.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/shifts")
public class ShiftController {

    @Autowired
    ShiftService shiftService;

    @GetMapping
    public ResponseEntity<List<Shift>> getAllShifts(){
        return new ResponseEntity<>(shiftService.findAllShifts(), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Shift>> getAllShiftsByEmployeeId(@PathVariable int id){
        List<Shift> employeeSchedule = shiftService.findAllShiftsByEmployeeId(id);
        return new ResponseEntity<>(employeeSchedule, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Shift>> getShiftsByType(@RequestParam Type type){
        List<Shift> shiftByType = shiftService.findShiftsByType(type);
        return new ResponseEntity<>(shiftByType, HttpStatus.OK);

    }

    @GetMapping
    public ResponseEntity<List<Shift>> getShiftsByDate(@RequestParam LocalDate date){
        List<Shift> shiftByDate = shiftService.findShiftsByDate(date);
        return new ResponseEntity<>(shiftByDate,HttpStatus.OK);
    }


}
