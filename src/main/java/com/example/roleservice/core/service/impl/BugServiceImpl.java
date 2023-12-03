package com.example.roleservice.core.service.impl;

import com.example.roleservice.controller.datamodel.BugDataModel;
import com.example.roleservice.core.service.BugService;
import com.example.roleservice.persistence.dao.BugDao;
import com.example.roleservice.persistence.entity.Bug;
import com.example.roleservice.core.utils.BugConverter;
import com.example.roleservice.core.utils.MessageCatalog;
import com.example.roleservice.core.utils.exceptions.BugStatus;
import com.example.roleservice.core.utils.exceptions.BusinessWebAppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BugServiceImpl implements BugService {

    @Autowired
    private BugDao bugDao;

    @Autowired
    private BugConverter bugConverter;

    @Override
    public BugDataModel createBug(BugDataModel bugDataModel) {

        Bug newBug = bugConverter.convertInputDataModelToEntity(bugDataModel);

        newBug.setStatus(String.valueOf(BugStatus.NEW));
        try {
            bugDao.createBug(newBug);
        } catch (Exception e) {
            throw new BusinessWebAppException(MessageCatalog.BUG_INVALID_PATTERN, 400);
        }
        return bugConverter.convertEntityToInputDataMode(newBug);
    }

    @Override
    public List<BugDataModel> getAllBugs() {

        return bugDao.getAll()
                .stream()
                .map(bug -> bugConverter.convertEntityToInputDataMode(bug))
                .collect(Collectors.toList());
    }
}
