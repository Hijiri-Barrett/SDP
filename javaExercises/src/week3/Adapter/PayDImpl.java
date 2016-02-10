package week3.Adapter;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class PayDImpl implements PayD {

    private XpayToPayDAdapter adapter;

    public PayDImpl() {
        adapter = new XpayToPayDAdapter();
    }

    public String getCustCardNo() {
        return adapter.getCustCardNo();
    }

    public void setCustCardNo(String custCardNo) {
        adapter.setCustCardNo(custCardNo);
    }

    public String getCardOwnerName() {
        return adapter.getCardOwnerName();
    }

    public void setCardOwnerName(String cardOwnerName) {
        adapter.setCardOwnerName(cardOwnerName);
    }

    public String getCardExpMonthDate() {
        return adapter.getCardExpMonthDate();
    }

    public void setCardExpMonthDate(String cardExpMonthDate) {
        adapter.setCardExpMonthDate(cardExpMonthDate);
    }

    public Integer getCVVNo() {
        return adapter.getCVVNo();
    }

    public void setCVVNo(Integer cVVNo) {
        adapter.setCVVNo(cVVNo);
    }

    public Double getTotalAmount() {
        return adapter.getTotalAmount();
    }

    public void setTotalAmount(Double totalAmount) {
        adapter.setTotalAmount(totalAmount);
    }
}
