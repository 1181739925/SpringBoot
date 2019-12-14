package com.controller;

import com.pojo.Branches;
import com.service.BranchesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.*;
import java.util.List;

/**
 * @author 1181739925@qq.com LiuLinQiu
 * @date 2019/11/24 - 18:20
 */
@Controller
public class BranchesController {

    @Autowired
    private BranchesService branchesService;

    @RequestMapping("/index")
    public String index(Model model){
        List<Branches> list= branchesService.getBranchesList();
        model.addAttribute("list",list);
        return "index";
    }



    @GetMapping("/add")
    public String add(){
        return "add";
    }

    @PostMapping("/sava")
    public String sava(Branches branches){
        int num=branchesService.addBranches(branches);
        if(num>0){
            return "redirect:/index";
        }
        return "add";
    }

    @GetMapping("show")
    public String show(Integer id,Model model){
        Branches branches=branchesService.getBranchesId(id);
        model.addAttribute("branches",branches);
        return "show";
    }
}
