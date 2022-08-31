public class Location {
    String depot;
    String place;

    Location(String depot, String place){
        this.depot = depot;
        this.place = place;
    }

    String getDepot() {
        return depot;
    }
    void setDepot(String depot) {
        this.depot = depot;
    }

    String getPlace() {
        return place;
    }

    void setPlace(String place) {
        this.place = place;
    }

}
