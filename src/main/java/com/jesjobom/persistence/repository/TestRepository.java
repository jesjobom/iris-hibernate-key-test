package com.jesjobom.persistence.repository;

import com.jesjobom.persistence.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
