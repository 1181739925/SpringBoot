package com.mapper;

import com.pojo.Branches;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 1181739925@qq.com LiuLinQiu
 * @date 2019/11/24 - 17:20
 */
@Repository
public interface BranchesMapper {

    /**
     * 查询所有营业网点信息
     * @return
     */
    List<Branches> getBranchesList();

    /**
     * 根据iD查询指定网点信息
    * @param businessNo
     * @return
     */
    Branches getBranchesId(Integer id);

    /**
     * 根据营业执照号查询指定网点
     * @param businessNo
     * @return
     */
    Branches getBranchesNo(String businessNo);

    /**
     * 添加营业厅
     * @param branches
     * @return
     */
    int addBranches(Branches branches);
}
