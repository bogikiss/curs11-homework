package ex4;

public class DaySchedule {
    String Day;

    public DaySchedule(String day) {
        this.Day = day;
    }
    
    String result(){
        return switch (this.Day) {
            case "monday" -> "Daily schedule on " + Days.MONDAY + ": " + Days.MONDAY.schedule();
            case "tuesday" -> "Daily schedule on " + Days.TUESDAY + ": " + Days.TUESDAY.schedule();
            case "wednesday" -> "Daily schedule on " + Days.WEDNESDAY + ": " + Days.WEDNESDAY.schedule();
            case "thursday" -> "Daily schedule on " + Days.THURSDAY + ": " + Days.THURSDAY.schedule();
            case "friday" -> "Daily schedule on " + Days.FRIDAY + ": " + Days.FRIDAY.schedule();
            case "saturday" -> "Daily schedule on " + Days.SATURDAY + ": " + Days.SATURDAY.schedule();
            case "sunday" -> "Daily schedule on " + Days.SUNDAY + ": " + Days.SUNDAY.schedule();
            default -> "Write the name of the day with lowercase letters. Ex: monday";
        };
    }
}
