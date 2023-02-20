package ie.atu.productv5;

public class Horse extends Animal {
    private String dam;
    private  String sire;
    private int height;

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "horse{" +
                "dam='" + dam + '\'' +
                ", sire='" + sire + '\'' +
                ", height=" + height +
                '}';
    }
}
