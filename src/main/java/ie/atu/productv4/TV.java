package ie.atu.productv4;

public class TV extends Product {
    private String screenSize;
    private String manufacture;

    public TV() {
        super();
        manufacture = "";
        screenSize = "";
        count++;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }


    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getLabel() {
        return screenSize;
    }


    @Override
    public String toString() {
        return super.toString() + " by " +manufacture +" Screen Size is " + screenSize;
    }
}



