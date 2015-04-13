package com.ing.banking.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;

/**
 * Created by Lieke on 13/04/15.
 */
public abstract class AbstractStepDef {

    static final Logger LOG = LoggerFactory.getLogger(AbstractStepDef.class);

    static final MockServer server = new MockServer();

    static Response response = null;
}
