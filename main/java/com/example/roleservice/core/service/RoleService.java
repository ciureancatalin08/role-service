package com.example.roleservice.core.service;

import com.example.roleservice.controller.datamodel.PermissionDataModel;
import com.example.roleservice.controller.datamodel.RolePermissionDataModel;
import com.example.roleservice.persistence.entity.Role;

import java.util.List;

public interface RoleService {

    List<Role> getRolesByTypeList(List<String> typeList);

    List<String> getAllRoles();

    List<RolePermissionDataModel> getAllRolesAndLinkedPermissions();

    void deletePermissionFromRole(long roleId, long permissionId);

    List<PermissionDataModel> getPermissionsNotFromRole(long roleId);

    void addPermissionToRole(long roleId, long permissionId);
}

