package week11.project4;

public class ActivityWithTrack implements Activity{

    private ActivityType activityType;
    private Track track;

    public ActivityWithTrack(ActivityType activityType, Track track) {
        this.activityType = activityType;
        this.track = track;
    }

    public ActivityType getType() {
        return activityType;
    }

    public double getDistance() {
        return this.track.getDistance();
    }
}
