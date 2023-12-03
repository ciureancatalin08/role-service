package com.example.roleservice.persistence.dao;

import com.example.roleservice.persistence.entity.Bug;

import java.util.List;

public interface BugDao {

    Bug createBug(Bug bug);

    List<Bug> getAll();

    void updateBug(Bug newBug);

    Bug getById(long id);

}
