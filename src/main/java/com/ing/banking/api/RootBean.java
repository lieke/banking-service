package com.ing.banking.api;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Lieke on 13/04/15.
 */
@XmlRootElement
public class RootBean {

    public String message = "Welcome to the ING banking API";

    public RootBean() {}
}
