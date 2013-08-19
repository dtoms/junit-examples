## junit-execution-order [![Build Status](https://travis-ci.org/dtoms/junit-examples.png)](https://travis-ci.org/dtoms/junit-examples)

This project contains various working test and suite examples mixing different JUnit annotations and rules.
See the [javadoc](testapidocs) for details.  They each produce logging output demonstrating the order of execution.  


Feel free to [contact me](https://twitter.com/danieljtoms) or file [issues or requests](https://github.com/dtoms/junit-examples/issues).

### Goal

The goal of this project is to help canonically demonstrate the execution order and serve as an immediate working reference when the inevitable questions arise.

### Reference
Though unrelated to these works, this blog post [Understanding JUnit method order execution](http://garygregory.wordpress.com/2011/09/25/understaning-junit-method-order-execution/) provides a more written background on this subject.

### Quickstart

```
git clone https://github.com/dtoms/junit-examples.git
cd junit-examples/junit-execution-order
mvn test
```

Or run from your favorite IDE.  Have fun comparing IDE execution, IDE Execution with Maven Integration, and command line maven.  No maven failsafe sort options have been applied, that is another subject.

### Sample output
Here is the output of [ExecutionOrderWithRulesTest](testapidocs/com/danieltoms/junit/order/ExecutionOrderWithRulesTest.html)

```
[INFO] LoggingRule - @ClassRule. State: 'starting'. Field: classResourcesTwo
[INFO] LoggingRule - @ClassRule. State: 'starting'. Field: classResourcesOne
[INFO] ExecutionOrderWithRulesTest - @BeforeClass: setupClassResourceTwo
[INFO] ExecutionOrderWithRulesTest - @BeforeClass: setupClassResourceOne
[INFO] LoggingRule - @Rule. State: 'starting'. Field: methodResourcesTwo. Method: acalculateTwo
[INFO] LoggingRule - @Rule. State: 'starting'. Field: methodResourcesOne. Method: acalculateTwo
[INFO] ExecutionOrderWithRulesTest - @Before: setupResourceTwo
[INFO] ExecutionOrderWithRulesTest - @Before: setupResourceOne
[INFO] ExecutionOrderWithRulesTest - @Test: calculateTwo
[INFO] ExecutionOrderWithRulesTest - @After: tearDownResourceOne
[INFO] ExecutionOrderWithRulesTest - @After: tearDownResourceTwo
[INFO] LoggingRule - @Rule. State: 'succeeded'. Field: methodResourcesOne. Method: acalculateTwo
[INFO] LoggingRule - @Rule. State: 'finished'. Field: methodResourcesOne. Method: acalculateTwo
[INFO] LoggingRule - @Rule. State: 'succeeded'. Field: methodResourcesTwo. Method: acalculateTwo
[INFO] LoggingRule - @Rule. State: 'finished'. Field: methodResourcesTwo. Method: acalculateTwo
[INFO] LoggingRule - @Rule. State: 'starting'. Field: methodResourcesTwo. Method: calculateOne
[INFO] LoggingRule - @Rule. State: 'starting'. Field: methodResourcesOne. Method: calculateOne
[INFO] ExecutionOrderWithRulesTest - @Before: setupResourceTwo
[INFO] ExecutionOrderWithRulesTest - @Before: setupResourceOne
[INFO] ExecutionOrderWithRulesTest - @Test: calculateOne
[INFO] ExecutionOrderWithRulesTest - @After: tearDownResourceOne
[INFO] ExecutionOrderWithRulesTest - @After: tearDownResourceTwo
[INFO] LoggingRule - @Rule. State: 'succeeded'. Field: methodResourcesOne. Method: calculateOne
[INFO] LoggingRule - @Rule. State: 'finished'. Field: methodResourcesOne. Method: calculateOne
[INFO] LoggingRule - @Rule. State: 'succeeded'. Field: methodResourcesTwo. Method: calculateOne
[INFO] LoggingRule - @Rule. State: 'finished'. Field: methodResourcesTwo. Method: calculateOne
[INFO] ExecutionOrderWithRulesTest - @AfterClass: teardownClassResourceOne
[INFO] ExecutionOrderWithRulesTest - @AfterClass: teardownClassResourceTwo
[INFO] LoggingRule - @ClassRule. State: 'succeeded'. Field: classResourcesOne
[INFO] LoggingRule - @ClassRule. State: 'finished'. Field: classResourcesOne
[INFO] LoggingRule - @ClassRule. State: 'succeeded'. Field: classResourcesTwo
[INFO] LoggingRule - @ClassRule. State: 'finished'. Field: classResourcesTwo
```
