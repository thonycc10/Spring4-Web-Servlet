package com.springWeb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springWeb.dao.AdminDao;

@Service
public class AdminService {
 // es un rupper
	//instancia
	@Autowired
	private AdminDao adminDao;
}
