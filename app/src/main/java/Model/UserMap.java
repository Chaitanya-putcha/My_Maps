package Model;

import java.util.List;

public class UserMap {
    private String title;
    List<Place> places;

    public UserMap(String title , List<Place> places){
        this.title = title;
        this.places = places;
    }

    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public List<Place> getPlaces() {
        return places;
    }



}
