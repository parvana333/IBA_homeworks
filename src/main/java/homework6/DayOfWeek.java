package homework6;

public enum DayOfWeek {
    Monday ("do laundry"),Tuesday("go to sport"),Wednesday ("read daily book"),Thursday("go to cinema");

    String activity;
    DayOfWeek(String s) {
        this.activity=s;

    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }
}
