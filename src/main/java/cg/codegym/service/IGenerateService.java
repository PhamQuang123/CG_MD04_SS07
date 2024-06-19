package cg.codegym.service;

import java.util.Optional;

public interface IGenerateService<T, E>{
    Iterable<T> findAll();
    void save(T t);
    Optional<T> findById(E e);
    void remove(E e);
}
