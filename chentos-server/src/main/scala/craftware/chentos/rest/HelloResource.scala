package craftware.chentos.rest

import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.GET

@Path("hello")
class HelloResource {
    @GET
    @Produces(Array("text/plain"))
	def get = "Hello World"
}