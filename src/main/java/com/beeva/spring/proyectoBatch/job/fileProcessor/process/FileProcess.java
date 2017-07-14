package com.beeva.spring.proyectoBatch.job.fileProcessor.process;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.beeva.spring.proyectoBatch.job.fileProcessor.model.Cliente;
import com.beeva.spring.proyectoBatch.job.fileProcessor.model.User;

@Component
public class FileProcess implements ItemProcessor<User, Cliente> {

	public Cliente process(User u) throws Exception {
		Cliente cl = new Cliente();
		cl.setIdcliente(u.getIdcliente());
		cl.setNombre(u.getNombre());
		cl.setApellido(u.getApellido());
		return cl;
	}

}
