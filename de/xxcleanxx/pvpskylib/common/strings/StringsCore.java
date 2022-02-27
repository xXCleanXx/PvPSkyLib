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
}