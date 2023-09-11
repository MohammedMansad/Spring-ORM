package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class studentDao {
	private HibernateTemplate hibernatetemplate;
	@Transactional
	public int insert(Student student)
	{
		
		Integer i=(Integer) this.hibernatetemplate.save(student);
		
		return i;
	}

	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
	

}
