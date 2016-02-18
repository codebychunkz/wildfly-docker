package com.docker.web;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * The ApplicationPath annotation serves as the base url for our webservices.
 * Example: <host>:<port>/<war-name>/rest/
 * 
 * @author Chunkz
 *
 */
@ApplicationPath("/rest")
public class Activator extends Application
{
}