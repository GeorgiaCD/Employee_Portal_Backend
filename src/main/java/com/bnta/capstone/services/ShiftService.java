package com.bnta.capstone.services;

import com.bnta.capstone.models.Shift;
import com.bnta.capstone.models.ShiftDTO;
import com.bnta.capstone.models.Type;
import com.bnta.capstone.repositories.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ShiftService {
    @Autowired
    ShiftRepository shiftRepository;

    @Autowired
    EmployeeService employeeService;

//    GET ALL SHIFTS
    public List<Shift> findAllShifts() {
        return shiftRepository.findAll();
    }

//    GET all shifts DTOs
    public List<ShiftDTO>  findAllShiftDTOs(){
        List<Shift> shift = shiftRepository.findAll();
        List<ShiftDTO> simplifedShiftDTOS = new ArrayList<>();
        ShiftDTO shiftDTO ;
        for(Shift shiftList : shift){
            shiftDTO = new ShiftDTO(shiftList.getDate(),shiftList.getType(), shiftList.getEmployee().getId());
           simplifedShiftDTOS.add(shiftDTO);
        }
        return simplifedShiftDTOS;
    }



//    GET SHIFT BY ID
    public Shift findShiftById(int id){
        return shiftRepository.findById(id).get();
    }

//    GET SHIFTS BY EMPLOYEE ID
    public List<Shift> findAllShiftsByEmployeeId(int id) {
        return shiftRepository.findByEmployeeId(id);
    }

//    GET SHIFTS BY TYPE
    public List<Shift> findShiftsByType(Type type) {
        return shiftRepository.findByType(type);
    }

//    GET SHIFTS BY DATE
    public List<Shift> findShiftsByDate(LocalDate date) {
        return shiftRepository.findByDate(date);
    }
//    add a shift method
    public Shift saveShift(ShiftDTO shiftDTO){
        Shift newShift = new Shift(shiftDTO.getDate(),
                                   shiftDTO.getType(),
                                    employeeService.findEmployeeById(shiftDTO.getEmployeeId())
                );
        shiftRepository.save(newShift);
        return newShift;
    }

    }

