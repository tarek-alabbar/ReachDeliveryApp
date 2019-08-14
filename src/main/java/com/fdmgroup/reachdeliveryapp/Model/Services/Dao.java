package com.fdmgroup.reachdeliveryapp.Model.Services;

import java.util.List;

/**
 * Dao
 */
public interface Dao<T> {
    void Create(T t);
    T Read(Integer id);
    T Read(String name);    
    void Update(T oldObject, T newObject);
    void Delete(T t);
    List<T> getAll();
}