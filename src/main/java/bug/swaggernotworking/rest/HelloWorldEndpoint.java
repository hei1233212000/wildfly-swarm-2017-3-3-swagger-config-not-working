package bug.swaggernotworking.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Api
@Path("/hello")
public class HelloWorldEndpoint {
    @ApiOperation(value = "Say Hello",
            notes = "Testing",
            response = String.class)
    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok("Hello from WildFly Swarm!").build();
    }
}