package nerehira.proyect.Modelos;

public class parking {
    String monday;
    String   tuesday;
    String  wednesday;
    String thursday;
    String friday;
    String saturday;
    String sunday;

    public parking(){}

    public parking(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday) {
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }



    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }
    @Override
    public String toString() {
        return "parking{" + "monday='" + monday + '\'' + ", tuesday='" + tuesday + '\'' + ", wednesday='" + wednesday + '\'' + ", thursday='" + thursday + '\'' + ", friday='" + friday + '\'' + ", saturday='" + saturday + '\'' + ", sunday='" + sunday + '\'' + '}';
    }
}
