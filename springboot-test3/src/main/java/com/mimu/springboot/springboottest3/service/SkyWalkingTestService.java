package com.mimu.springboot.springboottest3.service;


import com.mimu.springboot.springboottest3.dao.SchoolDao;
import com.mimu.springboot.springboottest3.model.SchoolSchoolInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkyWalkingTestService {

    private SchoolDao schoolDao;

    @Autowired
    public void setSchoolDao(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    public SchoolSchoolInfo getSchoolInfo(int serial){
        return schoolDao.getSchoolInfo(serial);
    }
}
