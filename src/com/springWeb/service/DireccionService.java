package com.springWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWeb.dao.AdminDao;
import com.springWeb.dao.DireccionDao;
import com.springWeb.pojo.Admin;
import com.springWeb.pojo.Direccion;

@Service
public class DireccionService {
 // es un rupper
	//instancia
	@Autowired
	private DireccionDao direccionDao;
	
	@Autowired 
	private AdminDao adminDao;
	
	public void save(Admin admin, Direccion direccion) {
		direccion.setAdmin(admin); // se setea el administrador del mapper de hibernate
		direccionDao.save(direccion);
	}
	
	public List<Direccion> findAll(int idAd){
		/*Hiberna maneja por temas de clases mappeadas*/
		Admin admin = adminDao.findById(idAd);
		return direccionDao.findAll(admin);
	}
}
