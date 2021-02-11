package com.jesjobom.persistence.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.hibernate.annotations.SQLInsert;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "test")
@SQLInsert(sql = "insert into test (test_date, name, uuid) values (?, ?, ?)")
public class Test implements Serializable {

    @EmbeddedId
    private TestPK pk;

    @Column(name = "name")
    private String name;

    @Column(name = "test_date")
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate date;

    public TestPK getPk() {
        return pk;
    }

    public void setPk(TestPK pk) {
        this.pk = pk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Objects.equals(pk, test.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }
}
