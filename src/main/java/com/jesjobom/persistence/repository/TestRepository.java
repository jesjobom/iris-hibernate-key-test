package com.jesjobom.persistence.repository;

import com.jesjobom.persistence.model.Test;
import com.jesjobom.persistence.model.TestPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, TestPK> {
}
