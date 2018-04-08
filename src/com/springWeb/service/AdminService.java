package com.springWeb.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWeb.dao.AdminDao;
import com.springWeb.pojo.Admin;

@Service
public class AdminService {
 // es un rupper
	//instancia
	@Autowired
	private AdminDao adminDao;
	
	public boolean save(Admin admin) {
//		añade la fecha de creacion automaticamente
		admin.setFechaCreacion(new Timestamp(new Date().getTime()));
		return adminDao.save(admin);
	}

	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminDao.findAll();
	}
}
