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

	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return adminDao.findById(id);
	}

	public boolean saveOrUpdate(Admin admin) {
		// TODO Auto-generated method stub
		if (admin.getIdAd() == 0) { // si el id fuera igual a 0 registra sino actualiza
			admin.setFechaCreacion(new Timestamp(new Date().getTime()));
			return adminDao.save(admin);
		}else {
			return adminDao.update(admin);	
		}
	}
}
