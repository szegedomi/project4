package week11.project4;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint tp){
        this.trackPoints.add(tp);
    }

    public double getDistance(){
        return 0;
    }

}
