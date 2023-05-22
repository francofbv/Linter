import java.util.*;
    public class BlankPrintlnCheck implements Check {
        // fields
        private String blankPrintLn = "System.out.println("")";

        // methods
        public Optional<Error> lint(String line, int lineNumber) {
            if (line.contains(blankPrintLn)) {
                return 
            }
            return Optional.empty();
        }
    }