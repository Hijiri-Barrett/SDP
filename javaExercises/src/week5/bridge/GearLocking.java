package week5.bridge;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class GearLocking implements Product {

    private String detail;

    public GearLocking(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
