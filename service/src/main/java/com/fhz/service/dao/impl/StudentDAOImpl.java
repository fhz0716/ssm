package com.fhz.service.dao.impl;

import com.fhz.dao.entity.Student;
import com.fhz.service.dao.StudentDAO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: ssm
 * @description: 学生DAO实现
 * @author: FuHZ
 * @create: 2019-11-28 22:14
 **/
@Service("studentDAO")
public class StudentDAOImpl extends SqlSessionDaoSupport implements StudentDAO {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    public SqlSessionTemplate getSessionTemplate()
    {
        return sqlSessionTemplate;
    }

    public SqlSession getBaseSqlSession()
    {
        return super.getSqlSession();
    }

    private String getStatement(String sqlId)
    {
        StringBuffer sb = new StringBuffer();
        sb.append(getClass().getName());
        sb.append(".");
        sb.append(sqlId);

        return sb.toString();
    }

    @Override
    public int insertStudent(Student student) {
        return sqlSessionTemplate.insert(getStatement("insert"), student);
    }
}
