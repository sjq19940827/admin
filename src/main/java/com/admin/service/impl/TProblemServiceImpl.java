package com.admin.service.impl;

import com.admin.pojo.TProblem;
import com.admin.dao.TProblemDao;
import com.admin.service.TProblemService;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TProblem)表服务实现类
 *
 * @author makejava
 * @since 2018-12-24 11:19:36
 */
@Service("tProblemService")
public class TProblemServiceImpl implements TProblemService {
    @Resource
    private TProblemDao tProblemDao;

    /**
     * 通过ID查询单条数据
     *
     * @param questionId 主键
     * @return 实例对象
     */
    @Override
    public TProblem queryById(Integer questionId) {
        return this.tProblemDao.queryById(questionId);
    }


    @Override
    public  TProblem queryByTitle(String title) {
        return this.tProblemDao.queryByTitle(title);
    }
    /**
     * 查询多条数据
     *
     * @param pagenum 查询起始位置
     * @param pagesize 查询条数
     * @return 对象列表
     */
    @Override
    public String queryAllByLimit(int pagenum, int pagesize) {
        PageHelper.startPage(pagenum, pagesize);
        List<TProblem> tProblems = tProblemDao.queryAll();
        return JSON.toJSONString(tProblems);
    }

    /**
     * 新增数据
     *
     * @param tProblem 实例对象
     * @return 实例对象
     */
    @Override
    public String insert(TProblem tProblem) {
        int insert = this.tProblemDao.insert(tProblem);
        if (insert > 0) {
            return JSON.toJSONString(tProblem);
        }else {
            return "新增失败";
        }

    }

    /**
     * 修改数据
     *
     * @param tProblem 实例对象
     * @return 实例对象
     */
    @Override
    public String update(TProblem tProblem) {
        int update = this.tProblemDao.update(tProblem);
        if (update > 0) {
            return JSON.toJSONString(this.queryById(tProblem.getQuestionId()));
        }else {
            return "修改失败";
        }

    }

    /**
     * 通过主键删除数据
     *
     * @param questionId 主键
     * @return 是否成功
     */
    @Override
    public String deleteById(Integer questionId) {
        int i = this.tProblemDao.deleteById(questionId);
        if (i > 0) {
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}