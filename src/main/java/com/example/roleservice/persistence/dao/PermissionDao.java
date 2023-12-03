package com.example.roleservice.persistence.dao;

import com.example.roleservice.persistence.entity.Permission;


public interface PermissionDao {


    public Permission createPermission(Permission p);

    public String removePermission(long id);
}
