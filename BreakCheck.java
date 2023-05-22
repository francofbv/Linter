import java.util.*;
    public class BreakCheck implements Check {

    // methods
        public Optional<Error> lint(String line, int lineNumber) {
            if (line.contains("break") && (!line.contains("//"))) {
                return //whatever the error thing is lol
            }
            return Optional.empty();
        }
    }