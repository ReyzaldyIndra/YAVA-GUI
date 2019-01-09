package com.verdin.jsf.test;



import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/test")
public class TestEndpoint {

	@GET
	@Produces("text/plain")
	public Response doGet() throws Exception {
		
				
			return Response.ok("Howdy: maatjes" ).build();

		
		//return Response.ok("method doGet invoked " + id +" "+ name        ).build();
	}
}