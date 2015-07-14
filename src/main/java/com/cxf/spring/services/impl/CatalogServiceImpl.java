package com.cxf.spring.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;

import com.cxf.spring.model.Catalog;
import com.cxf.spring.services.CatalogService;

public class CatalogServiceImpl implements CatalogService {

    static Logger log = Logger.getLogger(CatalogServiceImpl.class.getName());

    private static List<Catalog> catalogList = null;

    static {
        catalogList = new ArrayList<Catalog>();
        Random randomGenerator = new Random();
        Catalog catalog = null;
        for (int i = 0; i < 25; i++) {
            catalog = new Catalog();
            catalog.setCatalogId((long) i);
            catalog.setCatalogName("Trimmer : " + i);
            catalog.setCatalogDesc("Philips : " + i);
            catalog.setPrice(randomGenerator.nextInt(100));
            catalogList.add(catalog);
        }
        for (int i = 25; i < 50; i++) {
            catalog = new Catalog();
            catalog.setCatalogId((long) i);
            catalog.setCatalogName("Shaver : " + i);
            catalog.setCatalogDesc("Panasonic : " + i);
            catalog.setPrice(randomGenerator.nextInt(100));
            catalogList.add(catalog);
        }
    }

    @Override
    public List<Catalog> getCatalogs(String searchText) {
        List<Catalog> searchedCatalog = new ArrayList<Catalog>();
        if (searchText != null && searchText.length() > 0) {
            for (int i = 0; i < catalogList.size(); i++) {
                if (catalogList.get(i).getCatalogName().indexOf(searchText) != -1) {
                    searchedCatalog.add(catalogList.get(i));
                }
            }
        }
        return searchedCatalog;
    }

    @Override
    public List<Catalog> getCatalogsGet(String searchText) {
        List<Catalog> searchedCatalog = new ArrayList<Catalog>();
        if (searchText != null && searchText.length() > 0) {
            for (int i = 0; i < catalogList.size(); i++) {
                if (catalogList.get(i).getCatalogName().indexOf(searchText) != -1) {
                    searchedCatalog.add(catalogList.get(i));
                }
            }
        }
       /* ObjectMapper mapper = new ObjectMapper();
        try {
            return Response.status(Response.Status.ACCEPTED)
                    .entity(mapper.defaultPrettyPrintingWriter().writeValueAsString(searchedCatalog)).build();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Response.status(Status.BAD_REQUEST).build();*/
        return searchedCatalog;
    }

}
