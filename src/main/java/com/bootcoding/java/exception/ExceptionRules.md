
# Exception Handling Rules in Java


### Multiple `catch block`

#### Order of Exception in `catch` block

we know multiple catch block supported by Java


##### What should be the order of Exception

Rule - Most Specific Exception should come first 
or Most Generic Exception should come last


- Throwable
    - Exception
        - RuntimeException
            - IllegalArgumentException
                - NumberFormatException (Specific)


### throw and throws


### Stack Trace

Stack - Method Calling - LIFO - Stack

m1() -> m2() -> m3() -> m4() -> m5() ==> CALLING ORDER
m1() <- m2() <- m3() <- m4() <- m5() ===> Execution Order

calling order - m1, m2, m3, m4, m5
Execution order - m5, m4, m3, m2, m1


Trace - 

StackTrace - 

### Checked and Unchecked Exceptions


Exception - Runtime Exception

Checked Exception - we are checking at Compile time ??
IOException - Checked Exception

Unchecked Exception - we are checking at runtime
RuntimeException NullPointerException



