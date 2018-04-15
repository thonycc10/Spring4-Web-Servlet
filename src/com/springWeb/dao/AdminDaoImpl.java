package com.springWeb.dao;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springWeb.pojo.Admin;
@Transactional // por todos los metodos de DAo deben ser transactionales o dan errores
@Repository // indicamos al spring que es una clase dao
public class AdminDaoImpl implements AdminDao{

	//Importamos del persistence-context.xml sessionFactory;
	@Autowired
	private SessionFactory sessionFactory;
	
	// retornar la session de hibernate
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void save(Admin admin) {
		// TODO Auto-generated method stub
		getSession().save(admin); // hibernate te facilita y ya no es requerido crear un codigo sql o mysql
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from Admin"); // consulta HQL, es identico a Msql -> select * from Admin;
		return query.list();
	}

	@Override
	public Admin findById(int id) { // encontrar por id
		Criteria crit = getSession().createCriteria(Admin.class);
		crit.add(Restrictions.eq("idAd", id)); // de acuerdo a la anotacion jpa
		return (Admin) crit.uniqueResult();
	}

	@Override // encontrar por nombre
	public List<Admin> findByNombre(String nombre) {
		Criteria crit = getSession().createCriteria(Admin.class);
		crit.add(Restrictions.like("nombre", "%" + nombre + "%")); // se utiliza like si es string
		return  crit.list();
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int idAd) {
		// TODO Auto-generated method stub
		
	}
	


}
