package com.docker.web.service;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Stateless
@Produces(MediaType.APPLICATION_JSON)
public class SearchService {
    @GET
    @Path("/hello")
    public String list() {
	return "Hello, world!";
    }
}
