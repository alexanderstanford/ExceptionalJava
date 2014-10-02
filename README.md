ExceptionalJava
===============

playing around with exception and seeing what i can do with them.

i had the interesting thought to try and use exceptions as way to add another layer to the control flow.
using them as a psuedo GOTO for java.





the Exceptions i've created so far:


1: GotLootException - when you throw this exception, you need to give it an ArrayList. This ArrayList is used to
return information from deep in your code to the catch block that handles this exception.

2: CodeRunException - when you throw this exception, you need to give it an ArrayList and a CodeRunException.Code
interface. The ArrayList given is the parameters that your interface will receive and be able to use for its execution.

3: AsyncCodeExcepton - when you throw this exception, you need to give it an ArrayList and an AsyncCodeException.Code
interface. The ArrayList given is the parametes that your interface will receive and be able to use for its execution.
This interface is run inside an AsyncTask and runs on the UIThread.

4: FireSaleException - when you throw this exception, you need to give it the package name of your app.
getPackageName() works fine. This exception removes all sharedPreferences of the app that belongs to the provided
package name.
