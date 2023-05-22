import java.util.*;
    public class LongLineCheck implements Check {
        // fields
        private int maxLineLength = 100;
        private int errorNumber = 1;

        // methods
        public Optional<Error> lint(String line, int lineNumber) {
            if (line.length() >= maxLineLength) {
                return Optional.of("Line " + lineNumber + " contains " + maxLineLength + " characters. Error code: " + errorNumber);
            }
            return Optional.empty();
        }
    }