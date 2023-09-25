package com.bnta.capstone.repositories;

import com.bnta.capstone.models.Shift;
import com.bnta.capstone.models.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ShiftRepository extends JpaRepository<Shift, Integer> {

    List<Shift> findByEmployeeId(int EmployeeId);

    List<Shift> findByType(Type type);

    List<Shift> findByDate(LocalDate date);
}
