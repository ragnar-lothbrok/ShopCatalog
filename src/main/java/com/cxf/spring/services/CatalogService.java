package com.cxf.spring.services;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.cxf.spring.model.Catalog;

@WebService(serviceName = "catalogServices")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public interface CatalogService {

    @POST
    @Produces({ MediaType.APPLICATION_JSON })
    @Consumes({MediaType.TEXT_PLAIN})
    @Path("/product")
    public List<Catalog> getCatalogs(String searchText);

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/product")
    public List<Catalog> getCatalogsGet(@QueryParam("searchText") String searchText);
}

// http://localhost:8080/CatalogDemo/services/catalogServices/product