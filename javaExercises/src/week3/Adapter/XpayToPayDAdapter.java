package week3.Adapter;

/**
 * Created by Hijiri on 10/02/2016.
 */
public class XpayToPayDAdapter implements PayD {

    private Xpay xpay;

    public XpayToPayDAdapter() {
        xpay = new XpayImpl();
    }

    public String getCustCardNo() {
        return xpay.getCreditCardNo();
    }

    public void setCustCardNo(String custCardNo) {
        xpay.setCreditCardNo(custCardNo);
    }

    public String getCardOwnerName() {
        return xpay.getCustomerName();
    }

    public void setCardOwnerName(String cardOwnerName) {
        xpay.setCustomerName(cardOwnerName);
    }

    public String getCardExpMonthDate() {
        return xpay.getCardExpMonth();
    }

    public void setCardExpMonthDate(String cardExpMonthDate) {
        xpay.setCardExpMonth(cardExpMonthDate);
    }

    public Integer getCVVNo() {
        return new Integer(xpay.getCardCVVNo());
    }

    public void setCVVNo(Integer cVVNo) {
        xpay.setCardCVVNo(cVVNo.shortValue());
    }

    public Double getTotalAmount() {
        return xpay.getAmount();
    }

    public void setTotalAmount(Double totalAmount) {
        xpay.setAmount(totalAmount);
    }
}
