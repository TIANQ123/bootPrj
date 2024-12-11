package org.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.dao.StudentMapper;
import org.example.entity.Student;
import org.example.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudnetServiceImpl extends ServiceImpl<StudentMapper,Student> implements StudentService {

}
