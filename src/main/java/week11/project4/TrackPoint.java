package week11.project4;

public class TrackPoint {

    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    public double getDistanceFrom(TrackPoint other){
        return Math.sqrt(Math.pow(this.getElevation()-other.getElevation(),2) + Math.pow(this.getCoordinate().getLatitude()-other.getCoordinate().getLatitude(),2) + Math.pow(this.getCoordinate().getLongitude()-other.getCoordinate().getLongitude(),2));
    }

}
