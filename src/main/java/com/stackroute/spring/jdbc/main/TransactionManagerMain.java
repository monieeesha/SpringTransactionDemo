package com.stackroute.spring.jdbc.main;

import com.stackroute.spring.jdbc.model.Actor;
import com.stackroute.spring.jdbc.model.Movie;
import com.stackroute.spring.jdbc.service.MovieManagerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.spring.jdbc.service.MovieManager;

public class TransactionManagerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");

		MovieManager movieManager = ctx.getBean("movieManager", MovieManagerImpl.class);

		Movie cust = createDummyMovie();
		movieManager.createMovie(cust);

		ctx.close();
	}

	private static Movie createDummyMovie() {
		Movie movie = new Movie();
		movie.setMid(102);
		movie.setMname("dhadak");
		movie.setReleaseyear(2017);
		movie.setRatings(4.3);
		Actor actor = new Actor();
		actor.setId(1);
		actor.setName("sharukh");
		movie.setActor(actor);
		return movie;
	}

}
