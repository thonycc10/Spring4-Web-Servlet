package com.springWeb.dao;

import java.util.List;

import com.springWeb.pojo.Admin;

public interface AdminDao {
	// meltodos crud
	public void save(Admin admin); // Guardar
	public List<Admin> findAll(); // Mostrar 
	public Admin findById(int id); // buscar
	public List<Admin> findByNombre(String nombre); //listar
	public void update(Admin admin); // actualizar
	public void delete(Admin admin); // eliminar
}
