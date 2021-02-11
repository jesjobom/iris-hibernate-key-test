package com.jesjobom.persistence.manager;

import com.jesjobom.persistence.model.Test;
import com.jesjobom.persistence.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class TestManager {

    @Autowired
    private TestRepository testRepository;

    @Transactional(Transactional.TxType.REQUIRED)
    public Test criar(String nome) {
        Test test = new Test();
        test.setUuid(UUID.randomUUID());
        test.setName(nome);
        test.setDate(LocalDate.now());

        return testRepository.save(test);
    }

    public List<Test> list() {
        return testRepository.findAll();
    }
}
