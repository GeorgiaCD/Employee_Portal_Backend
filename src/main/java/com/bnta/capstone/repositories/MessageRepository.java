package com.bnta.capstone.repositories;

import com.bnta.capstone.models.Employee;
import com.bnta.capstone.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
