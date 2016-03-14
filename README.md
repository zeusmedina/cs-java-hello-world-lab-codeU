# cs-hello-world-lab

## Objectives

1. Install Java SDK >= 1.7
2. Print the version number to stdout

## Instructions

1. Install a recent Java runtime, if you haven't already. We recommend 1.8, but 1.7 will work, too.
2. In `com.flatironschool.javacs.Main`, we've provided a function `getVersion()`. It should print your system's current version of Java.
   1. We want not only to make this function work but also to make sure that it prints a version compatible with the upcoming lessons.
   2. You might find the following information useful:
      1. You can print information to stdout (usually, your console) with `System.out.println()`.
      2. `System.getProperty()` will, you guessed it, get a system property (just pass in the name as a String, e.g. `System.getProperty("myProperty")`).
      3. The system properties `"java.version"` and `"java.specification.version"` will both return your system's current version of Java. The former, counter-intuitively, is more specific, and you might need to manipulate the `String` that it returns a bit more.
      4. `Double.parseDouble()` converts a `String` to a `Double`.

You can run `ant` or `learn-test` to test your results. Good luck!
