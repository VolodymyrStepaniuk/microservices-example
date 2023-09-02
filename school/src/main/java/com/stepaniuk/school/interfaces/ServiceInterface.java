package com.stepaniuk.school.interfaces;

import java.util.List;

public interface ServiceInterface<T> {
    void save(T t);
    List<T> getAll();
    void delete(T t);
    void update(T t);
    T getById(Integer id);
}
