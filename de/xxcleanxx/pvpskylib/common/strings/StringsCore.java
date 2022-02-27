<<<<<<< HEAD
package de.xxcleanxx.pvpskylib.common.strings;

public class StringsCore {
    public static String[] getSubArguments(String[] arguments) {
        if (arguments.length > 0) {
            String[] args = new String[arguments.length - 1];

            System.arraycopy(arguments, 1, args, 0, arguments.length - 1);

            return args;
        }

        return arguments;
    }

    public static String concat(String[] strings) {
        StringBuilder string = new StringBuilder();

        for(String item : strings) {
            string.append(" ").append(item);
        }

        return string.toString().trim();
    }
=======
package de.xxcleanxx.pvpskylib.common.strings;

public class StringsCore {
    public static String[] getSubArguments(String[] arguments) {
        if (arguments.length > 0) {
            String[] args = new String[arguments.length - 1];

            System.arraycopy(arguments, 1, args, 0, arguments.length - 1);

            return args;
        }

        return arguments;
    }

    public static String concat(String[] strings) {
        StringBuilder string = new StringBuilder();

        for(String item : strings) {
            string.append(" ").append(item);
        }

        return string.toString().trim();
    }
>>>>>>> aa12e26b5d4dc7afcdfc3c4b3383140b8b60bc35
}