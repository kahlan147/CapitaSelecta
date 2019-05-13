package REST;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Niels Verheijen on 13/05/2019.
 */
@Stateless
@Path("test")
public class testResource {

    @GET
    public String test(){
        return "Booya, it works!";
    }
}
