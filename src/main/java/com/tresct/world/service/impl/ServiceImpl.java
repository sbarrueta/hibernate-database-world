package com.tresct.world.service.impl;

import com.tresct.hibernate.dao.CityDAO;
import com.tresct.hibernate.dao.impl.CityDAOImpl;
import com.tresct.world.hibernate.entities.City;
import com.tresct.world.service.Service;

public class ServiceImpl implements Service {

	@Override
	public City dameCiudad(int codigo) {
		CityDAO cityDAO = new CityDAOImpl();
		City city = cityDAO.getCity(codigo);
		return city;
	}

}
