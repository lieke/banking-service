package com.ing.banking.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by Lieke on 10/04/15.
 */
public class MockServer extends JerseyTest {

    static final Logger LOG = LoggerFactory.getLogger(MockServer.class);

    @Override
    protected Application configure() {
        return new ResourceConfig(RootResource.class);
    }

    private String getUrl(String relativePath){
        try {
            return new URL("http://localhost:8080/bankingAPI" + relativePath).toString();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return "";
        }
    }

    public Response getRequest(String resource) {
        LOG.debug("Executing GET request to " + resource);
        return target(resource).request(MediaType.APPLICATION_JSON_TYPE).get();
    }

    /*public Response putRequest(String resource) {
        LOG.debug("Executing PUT request to " + resource);
        return target(resource).request(MediaType.APPLICATION_JSON_TYPE).put();
    }*/

    /*public Response postRequest(String resource) {
        LOG.debug("Executing POST request to " + resource);
        return target(resource).request(MediaType.APPLICATION_JSON_TYPE).get();
    }*/

    public Response deleteRequest(String resource) {
        LOG.debug("Executing DELETE request to " + resource);
        return target(resource).request(MediaType.APPLICATION_JSON_TYPE).delete();
    }
}
