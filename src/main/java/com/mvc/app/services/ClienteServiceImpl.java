package com.mvc.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.app.models.Dao.IClienteDao;
import com.mvc.app.models.entities.Cliente;



@Service
public class ClienteServiceImpl  implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {		
		return (List<Cliente>)clienteDao.findAll();
	}

	@Override
	@Transactional (readOnly=true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
		
	}
	
	

}
