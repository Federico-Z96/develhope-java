package it.develhope.JavaAdvancedExercise.Es1.ES6ENUMS;

public enum Seasons {
    SPRING("20 march" + " 20 june"),
    SUMMER("21 june" + " 20 september"),
    FALL("21 september" + " 20 december"),
    WINTER("21 december" + " 19 march");
    private String month;

    Seasons (String month){
        this.month = month;

    }
    public String months(){
        return month;
    }

        }





