package Model;

public class Place {
    private String title;
    private String description;
    private double latitude;
    private double longitude;

    public Place(String title, String description, double latitude, double longtitude){
        this.title = title;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longtitude;
    }

     // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }


    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

}
