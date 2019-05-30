package com.stackroute.spring.jdbc.dao;

import javax.sql.DataSource;

import com.stackroute.spring.jdbc.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDAOImpl implements MovieDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void create(Movie movie) {
		String queryCustomer = "insert into moviedetail (movieid, moviename,releaseyear,ratings) values (?,?,?,?)";
		String queryAddress = "insert into Actor(id,name) values (?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(queryCustomer, new Object[] { movie.getMid(),movie.getMname(),movie.getRatings(),movie.getReleaseyear() });
		System.out.println("Inserted into Movie Table Successfully");
		jdbcTemplate.update(queryAddress, new Object[] { movie.getActor().getId(), movie.getActor().getName()});
		System.out.println("Inserted into Actor Table Successfully");
	}

}
