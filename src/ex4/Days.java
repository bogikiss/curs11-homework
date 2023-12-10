package ex4;

import java.util.Arrays;
import java.util.List;

public enum Days {
    MONDAY(),
    TUESDAY(),
    WEDNESDAY(),
    THURSDAY(),
    FRIDAY(),
    SATURDAY(),
    SUNDAY();

    public List<String> schedule() {
        return switch (this) {
            case MONDAY -> Arrays.asList(new String[]{"work", "coffee"});
            case TUESDAY -> Arrays.asList(new String[]{"work", "shopping"});
            case WEDNESDAY -> Arrays.asList(new String[]{"work", "team building", "manicure"});
            case THURSDAY -> Arrays.asList(new String[]{"work", "meet Anne"});
            case FRIDAY -> Arrays.asList(new String[]{"work", "cocktails"});
            case SATURDAY -> Arrays.asList(new String[]{"birthday party"});
            case SUNDAY -> Arrays.asList(new String[]{"brunch"});
        };
    }
}
