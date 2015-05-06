# Purpose
To provide hands-on guidance on how to start developing an API using JAX-RS as the key framework. 

The specification of the behaviour of the API will be provided by a number of Cucumber-based BDD scenarios. The API’s domain (and its initial implementation) will be lifted from the Locator project. 

For now, Jersey 2.x will be used as the JAX-RS implementation.

# Activities
1. Get the base implementation of the Example API (and add it to the repository)
2. Define the Cucumber features that specify the behaviour of the Example API. Assert that all of these features validate successfully against the base implementation
3. If needed, refactor the base implementation into respectively:  
- Java interfaces that define the API’s (REST) interface  
- Java classes that implement these interfaces  
- Utility classes that provide the ‘backend features’, like accessing the location data (from the spreadsheet)
4. Define the various steps in building the API, starting with a fully empty implementation and ending with a fully functional implementation. Each step correspond to a single Cucumber scenario.
5. For each such step, create a feature branch on the repository. This branch will represent adding the step to the implementation.  The specification of what needs to be implemented in the step is as provided by the corresponding Cucumber scenario. The ‘solution’ to the step will thus be included on the preceding feature branch. 
6. Done.

# Future
A future version will incorporate RIAF components for building the API on. Likewise, a future version will use the Interesting BDD framework for specifying the various scenarios.
