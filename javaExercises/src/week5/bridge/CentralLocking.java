package week5.bridge;

/**
 * Created by Hijiri on 15/02/2016.
 */
public class CentralLocking implements Product {

    private String detail;

    public CentralLocking(String detail) {
        this.detail = detail;
    }

    public String getDetail() {
        return detail;
    }
}
