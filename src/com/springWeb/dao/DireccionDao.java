package com.springWeb.dao;

import java.util.List;

import com.springWeb.pojo.Admin;
import com.springWeb.pojo.Direccion;

public interface DireccionDao {

	public void save(Direccion direccion);
	public List<Direccion> findAll(Admin admin);
}
