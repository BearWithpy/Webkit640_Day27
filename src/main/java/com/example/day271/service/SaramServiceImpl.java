package com.example.day271.service;

import com.example.day271.model.SaramDAO;
import com.example.day271.model.SaramDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@ComponentScan(basePackages={"com.example.day271.model"})
public class SaramServiceImpl implements SaramService {
    @Autowired
    SaramDAO dao;

    @Override
    public List<SaramDTO> selectAll() {
        System.out.println(">>>>> selectAll():List<SaramDTO> - ServiceImpl 실행");
        dao.selectAll();
        return null;
    }

    @Override
    public SaramDTO selectOne(SaramDTO dto) {
        System.out.println(">>>>> selectOne():SaramDTO - ServiceImpl 실행");
        dao.selectOne(dto);
        return null;
    }

    @Override
    public void insert(SaramDTO dto) {
        System.out.println(">>>>> insert():void - ServiceImpl 실행");
        dao.insert(dto);
    }

    @Override
    public void update(SaramDTO dto) {
        System.out.println(">>>>> update():void - ServiceImpl 실행");
        dao.update(dto);
    }

    @Override
    public void delete(SaramDTO dto) {
        System.out.println(">>>>> delete():void - ServiceImpl 실행");
        dao.delete(dto);
    }
}
