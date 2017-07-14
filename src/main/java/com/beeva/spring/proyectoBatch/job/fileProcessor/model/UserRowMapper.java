package com.beeva.spring.proyectoBatch.job.fileProcessor.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {

		public User mapRow(ResultSet rs, int rowNum) throws SQLException {

			User user = new User();
			user.setIdcliente(rs.getInt("idcliente"));
			user.setNombre(rs.getString("nombre"));
			user.setApellido(rs.getString("apellido"));
			
			return user;
	}


}
