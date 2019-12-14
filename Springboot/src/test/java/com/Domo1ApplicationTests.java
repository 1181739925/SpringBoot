package com;

import com.pojo.Branches;
import com.service.BranchesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Domo1ApplicationTests {

    @Autowired
    private BranchesService branchesService;

    @Test
    void contextLoads() {
        try {
            List<Branches> list=branchesService.getBranchesList();
            for(Branches b:list){
                System.out.println("========"+b.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
