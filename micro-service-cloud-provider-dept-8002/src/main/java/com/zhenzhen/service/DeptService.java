package com.zhenzhen.service;

import com.zhenzhen.entity.Dept;

import java.util.List;

public interface DeptService {
    Dept get(Integer deptNo);

    List<Dept> selectAll();
}
