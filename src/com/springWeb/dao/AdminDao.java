package com.springWeb.dao;

import java.util.List;

import com.springWeb.pojo.Admin;

public interface AdminDao {
	
	public boolean save(Admin admin);
	public List<Admin> findAll();
	public Admin findById(int id);
	public List<Admin> findByNombre(String nombre);
	public boolean update(Admin admin);
	public boolean delete(int idAd);
	public int[] saveAll(List<Admin> admins);
}
