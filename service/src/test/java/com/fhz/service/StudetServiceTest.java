package com.fhz.service;

import com.fhz.dao.entity.Student;
import com.fhz.dao.service.StudentService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: ssm
 * @description: 学生服务测试类
 * @author: FuHZ
 * @create: 2019-11-28 22:07
 **/
@Ignore
public class StudetServiceTest {
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
    private StudentService studentService;

    @Before
    public void setUp() throws Exception
    {
        studentService = applicationContext.getBean("studentService", StudentService.class);
    }

    @Test
    public void insertStudent() {
        Student student = new Student();
        student.setName("Adrian");
        int id = studentService.insertStudent(student);
        System.out.println(id);
    }
}
