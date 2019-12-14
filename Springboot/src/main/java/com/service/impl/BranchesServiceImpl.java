package com.service.impl;

import com.mapper.BranchesMapper;
import com.pojo.Branches;
import com.service.BranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 1181739925@qq.com LiuLinQiu
 * @date 2019/11/24 - 17:48
 */
@Service
public class BranchesServiceImpl implements BranchesService {

    @Autowired
    private BranchesMapper branchesMapper;


    @Override
    public List<Branches> getBranchesList() {
        return branchesMapper.getBranchesList();
    }

    @Override
    public Branches getBranchesId(Integer id) {
        return branchesMapper.getBranchesId(id);
    }

    @Override
    public Branches getBranchesNo(String businessNo) {
        return branchesMapper.getBranchesNo(businessNo);
    }

    @Override
    public int addBranches(Branches branches) {
        return branchesMapper.addBranches(branches);
    }
}
