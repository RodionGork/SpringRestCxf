package none.rg.springblank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Service("restService")
@Path("/groups")
public class GroupServices {

    @Autowired
    private Dao dao;

    @GET
    @Path("/")
    @Produces("application/json")
    public Response groupList() {
        return Response.ok(dao.getGroups()).build();
    }

    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Response productList(@PathParam("id") String id) {
        if (id == null || !id.matches("\\d+")) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        int groupId = Integer.parseInt(id);
        return Response.ok(dao.getProductsByGroupId(groupId)).build();
    }
}
