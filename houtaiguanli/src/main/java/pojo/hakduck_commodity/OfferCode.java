package pojo.hakduck_commodity;


public class OfferCode {

  private long id;
  private String offerCodeid;
  private long money;
  private java.sql.Date receiveTime;
  private java.sql.Date pastdueTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getOfferCodeid() {
    return offerCodeid;
  }

  public void setOfferCodeid(String offerCodeid) {
    this.offerCodeid = offerCodeid;
  }


  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }


  public java.sql.Date getReceiveTime() {
    return receiveTime;
  }

  public void setReceiveTime(java.sql.Date receiveTime) {
    this.receiveTime = receiveTime;
  }


  public java.sql.Date getPastdueTime() {
    return pastdueTime;
  }

  public void setPastdueTime(java.sql.Date pastdueTime) {
    this.pastdueTime = pastdueTime;
  }

}
