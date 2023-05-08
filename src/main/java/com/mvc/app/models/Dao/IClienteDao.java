package com.mvc.app.models.Dao;


import org.springframework.data.repository.CrudRepository;
import com.mvc.app.models.entities.Cliente;

public interface IClienteDao extends CrudRepository <Cliente,Long>{

}
