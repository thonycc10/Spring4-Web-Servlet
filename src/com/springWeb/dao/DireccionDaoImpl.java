package com.springWeb.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springWeb.pojo.Admin;
import com.springWeb.pojo.Direccion;
@Transactional // por todos los metodos de DAo deben ser transactionales o dan errores
@Repository // indicamos al spring que es una clase dao
public class DireccionDaoImpl implements DireccionDao{

	//Importamos del persistence-context.xml sessionFactory;
	@Autowired
	private SessionFactory sessionFactory;
	
	// retornar la session de hibernate
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Direccion direccion) {
		// TODO Auto-generated method stub
		getSession().save(direccion);
	}

	@Override
	public List<Direccion> findAll(Admin admin) {
		// TODO Auto-generated method stub
		Criteria crit = getSession().createCriteria(Direccion.class)
				.setFetchMode("admin", FetchMode.JOIN) // alias "admin" reunion natural junta las tablas 
				.add(Restrictions.eq("admin.idAd", admin.getIdAd())) // where es la restrinctions el id que desea buscar
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY); // coloca los resultados y que no se repitan iguala las mismas columnas para evitar duplicado
//		select * from springbd.direccion natural join Admin where Direccion.idAd = admin.idAd and Admin.idAd = 1;
		return crit.list();
	}

}
