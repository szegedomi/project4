package week11.project4;

public class ActivityWithoutTrack implements Activity{

    private ActivityType activityType;

    public ActivityWithoutTrack(ActivityType activityType) {
        this.activityType = activityType;
    }

    public double getDistance(){
        return 0;
    }

    public ActivityType getType(){
        return this.activityType;
    }

}
