package ru.itis.lab2_6;

import java.util.Objects;

public class Entry {
    private Long id;

    public Entry() {
    }

    public Entry(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null) return false;
        if (getClass() != o.getClass()) return false;

        Entry entry = (Entry) o;

        return Objects.equals(id, entry.id);
    }

    @Override
    public int hashCode() {
        return 1;//id != null ? (int)(id * 17) : 0;
    }
}
