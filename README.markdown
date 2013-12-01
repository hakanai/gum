Gum - A simple wrapper around the com.apple classes in Java to allow your code to compile on non-Mac systems.

Copyright (C) 2013  Trejkaz, Gum Project


WHY WRAP IT
-----------

If you want your application to integrate better with Mac OS X, you
are recommended to use the com.apple extensions where relevant.

However, if you also want to run your application on non-Mac systems,
any attempts to load com.apple classes will bomb your application out
with a `NoClassDefFoundError`. This will be the case until Oracle
start shipping these classes with the JRE (at which point, wrappers
like this will become unnecessary.)


APPROACH
--------

There have been numerous libraries to do this in the past (e.g.
MRJAdapter, Macify) and mine isn't special in any particular way.

I have just tried to wrap all the current APIs. Where possible, I have
changed the API slightly to improve type safety (e.g., replacing magic
numbers with enum values, or replacing `String` file paths with `File`.)
Since this library has Java 7 as the minimum version, I have also
removed any deprecated APIs as there is very little point to keeping
them.

Some wrapper libraries use reflection to do the job. Gum does not -
it uses delegate classes to call the com.apple classes directly. This
is perfectly safe - as long as your application isn't accessing any
of the classes inside packages named "internal", the code which depends
on com.apple classes should never execute. (If it does, it's probably a
bug.)


USING
-----

`com.trypticon.gum.MacFactory` is the main entry point and you can get
to everything else from there.

Documentation is severely lacking on my side, but the methods more or
less correspond one-to-one with their counterparts in com.apple, so it
is possible to consult the com.apple documentation to fill in the gaps.


BUILDING
--------

You'll need a Java build environment.  I'm developing this on Java 7 at
the moment. Additionally, the code will only compile on Mac OS X.

You'll also need Ant.  All the other dependencies should be bundled.
If something is missing, prod me to fix it.

To build, execute `ant` in the top directory. The jar file will appear
in `build/`.


