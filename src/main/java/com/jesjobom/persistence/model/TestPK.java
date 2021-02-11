package com.jesjobom.persistence.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class TestPK implements Serializable {

    private Long id;

    private UUID uuid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestPK testPK = (TestPK) o;
        return Objects.equals(id, testPK.id) && Objects.equals(uuid, testPK.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uuid);
    }
}
