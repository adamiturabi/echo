# Example on how to call a custom Java function from Xquery in eXist-db

I haven't found a complete working example online with instructions so here is an attempt. I've used code from https://github.com/lcahlander/echo but renamed `echo` to `myfancyexample` because there already exists an `echo` example packaged with eXist-db.

## Instructions

1. Have exist-db (http://exist-db.org/exist/apps/homepage/index.html) and maven (`sudo apt install maven`) installed
2. Clone this repo.
3. `grep` the `src` directory for "myfancyexample" and "MyFancyExample" and rename to whatever you want. You'll also have to rename the files MyFancyExampleFunction.java and MyFancyExampleModule.java and the directory `src/main/java/org/exist/xquery/modules/myfancyexample`.

   Also make sure to rename within the files within the `resources` directory.
4. In the top-level directory (exist-db-xquery-java-example), hit `mvn package` to compile.
5. A `directory` directory should be created with a `.jar` file. In mycase it is `myfancyexample-2015.10.29.jar`.
6. Copy this `.jar` file to `EXIST_HOME/lib/user/`. `$EXIST_HOME` is weherever eXist-db is installed. In my case it is in `$HOME/eXist-db`. Don't worry if you don't have an environment variable called `$EXIST_HOME`.
7. Restart exist-db server.
8. Open Exide IDE and try the following code:
```
xquery version "3.1";

import module namespace myfancyexample_namespace="http://exist-db.org/xquery/myfancyexample"
at "java:org.exist.xquery.modules.myfancyexample.MyFancyExampleModule";

myfancyexample_namespace:myfancyexample("abc")
```
