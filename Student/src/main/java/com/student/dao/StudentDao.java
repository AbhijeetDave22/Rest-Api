package com.student.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.student.pojos.*;

public interface StudentDao extends JpaRepository<Student,Long>{

}
