package com.mvc.app.services;

import java.util.List;
import com.mvc.app.models.entities.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Cliente cliente);

}
