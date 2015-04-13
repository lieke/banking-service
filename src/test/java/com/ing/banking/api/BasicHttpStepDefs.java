package com.ing.banking.api;

import cucumber.api.java.en.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Lieke on 13/04/15.
 */
public class BasicHttpStepDefs extends AbstractStepDef {

    @Given("^Server is started$")
    public void Server_is_started() throws Throwable {
        server.setUp();
    }

    @When("^I perform a (\\w+) request at (\\S+)$")
    public void I_perform_a_request_at_(String requestMethod, String uri) throws Throwable {
        if (requestMethod.equals("GET")) {
            response = server.getRequest(uri);
        } else if (requestMethod.equals("DELETE")) {
            response = server.deleteRequest(uri);
        } else {
            throw new Exception("request method does not match GET or DELETE");
        }
    }

    @Then("^I should get a (\\d+) ([\\w,\\s]+) response$")
    public void I_should_get_a_response(int httpStatusCode, String httpStatus) throws Throwable {
        LOG.debug("response: " + response.getStatus() + " " + response.getStatusInfo());
        assertEquals(response.getStatus(), httpStatusCode);
        assertEquals(response.getStatusInfo().toString(), httpStatus);
    }

    @And("^The response should contain the (\\w+) element containing ([\\w,\\s]+)$")
    public void The_response_should_contain_the_message_element_containing(String messageName, String message) throws Throwable {
        String responseString = response.readEntity(String.class);
        LOG.debug("response body: " + responseString);
        assertTrue(responseString.contains(messageName));
        assertTrue(responseString.contains(message));
    }

}
