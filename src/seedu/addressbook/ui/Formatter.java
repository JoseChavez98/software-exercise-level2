package seedu.addressbook.ui;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static seedu.addressbook.ui.TextUi.*;

interface Formatter {
    static final String LINE_PREFIX = "|| ";
    static final String LS = System.lineSeparator();
    final PrintStream out = null;
    final Scanner in = null;
    default void showToUser(String... message) {
        for (String m : message) {
            out.println(LINE_PREFIX + m.replace("\n", LS + LINE_PREFIX));
        }
    }

}
