package pojo.hakduck_seckill;


public class SeckillOrder {

  private long id;
  private long seckillId;
  private double price;
  private long userId;
  private java.sql.Date createTime;
  private java.sql.Date payTime;
  private long status;
  private String buyerAddress;
  private long buyerPhone;
  private String buyerUser;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSeckillId() {
    return seckillId;
  }

  public void setSeckillId(long seckillId) {
    this.seckillId = seckillId;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
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


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public String getBuyerAddress() {
    return buyerAddress;
  }

  public void setBuyerAddress(String buyerAddress) {
    this.buyerAddress = buyerAddress;
  }


  public long getBuyerPhone() {
    return buyerPhone;
  }

  public void setBuyerPhone(long buyerPhone) {
    this.buyerPhone = buyerPhone;
  }


  public String getBuyerUser() {
    return buyerUser;
  }

  public void setBuyerUser(String buyerUser) {
    this.buyerUser = buyerUser;
  }

}
