package com.bnta.capstone.repositories;


import com.bnta.capstone.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentRepository extends JpaRepository<Department, Integer> {
}
