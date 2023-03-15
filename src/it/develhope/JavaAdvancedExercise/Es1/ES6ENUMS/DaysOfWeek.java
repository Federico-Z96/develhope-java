package it.develhope.JavaAdvancedExercise.Es1.ES6ENUMS;

public enum DaysOfWeek {
    LUNEDI(false),
    MARTEDI(false),
    MERCOLEDI(false),
    GIOVEDI(false),
    VENERDI(false),
    SABATO(true),
    DOMENICA(true);

    public boolean isWeekend;


    DaysOfWeek( boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public boolean setWeekend(boolean weekend) {
        isWeekend = weekend;
        return isWeekend;
    }
}
