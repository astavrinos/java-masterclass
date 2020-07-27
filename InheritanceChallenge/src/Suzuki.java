public class Suzuki extends Car {

    public String mediaSystem;
    public boolean hasABS;

    public Suzuki() {
        super(4,"V8",4,"Black",4,5,false);
        this.mediaSystem = "InfoEntertainment System";
        this.hasABS = true;
    }

    public String getMediaSystem() {
        return mediaSystem;
    }

    public void setMediaSystem(String mediaSystem) {
        this.mediaSystem = mediaSystem;
    }

    public boolean isHasABS() {
        return hasABS;
    }

    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }

    public String toString() {
        return "Wheels: " + getWheels()
                + "\n Windows: " + getWindows()
                + "\n Engine: " + getEngine()
                + "\n Seats: " + getSeats()
                + "\n Color: " + getColor()
                + "\n Wheels: " + getWheels()
                + "\n Speakers: " + getSpeakers()
                + "\n Cabriolet: " + isCabriolet()
                + "\n ABS: " + isHasABS()
                + "\n Media System: " + getMediaSystem();
    }

}
