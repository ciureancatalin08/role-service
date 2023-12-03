package com.example.roleservice.core.service;

import com.example.roleservice.controller.datamodel.BugDataModel;

import java.util.List;

public interface BugService {

    BugDataModel createBug(BugDataModel bugDataModel);

    List<BugDataModel> getAllBugs();

}
