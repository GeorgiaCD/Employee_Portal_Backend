package com.bnta.capstone.services;

import com.bnta.capstone.models.Shift;
import com.bnta.capstone.models.Type;
import com.bnta.capstone.repositories.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ShiftService {
    @Autowired
    ShiftRepository shiftRepository;

//    GET ALL SHIFTS
    public List<Shift> findAllShifts() {
        return shiftRepository.findAll();
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
}
