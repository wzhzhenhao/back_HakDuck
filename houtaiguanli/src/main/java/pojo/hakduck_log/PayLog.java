package pojo.hakduck_log;


public class PayLog {

  private long tradeId;
  private java.sql.Date createTime;
  private java.sql.Date payTime;
  private long totalprice;
  private long userId;
  private long orderId;
  private String payType;
  private double tradeStatus;
  private java.sql.Date _UpdateTime;


  public long getTradeId() {
    return tradeId;
  }

  public void setTradeId(long tradeId) {
    this.tradeId = tradeId;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public java.sql.Date getPayTime() {
    return payTime;
  }

  public void setPayTime(java.sql.Date payTime) {
    this.payTime = payTime;
  }


  public long getTotalprice() {
    return totalprice;
  }

  public void setTotalprice(long totalprice) {
    this.totalprice = totalprice;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public String getPayType() {
    return payType;
  }

  public void setPayType(String payType) {
    this.payType = payType;
  }


  public double getTradeStatus() {
    return tradeStatus;
  }

  public void setTradeStatus(double tradeStatus) {
    this.tradeStatus = tradeStatus;
  }


  public java.sql.Date get_UpdateTime() {
    return _UpdateTime;
  }

  public void set_UpdateTime(java.sql.Date _UpdateTime) {
    this._UpdateTime = _UpdateTime;
  }

}
