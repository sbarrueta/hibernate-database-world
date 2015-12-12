/**
 * 
 */
package com.tresct.hibernate.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.tresct.hibernate.dao.CityDAO;
import com.tresct.world.hibernate.entities.City;
import com.tresct.hibernate.*;

public class CityDAOImpl implements CityDAO {

	@Override
	public City getCity(int codigo) {
		
		SessionFactory  sessionFactory=HibernateUtil.getSessionfactory();
		Session sessionHibernate = sessionFactory.openSession();
		City city = (City)sessionHibernate.get(City.class, codigo);
		if (city!=null){
			return city;
		}else{
			System.out.println("No se realizó la lectura");
		}
		return null;
	}

}
