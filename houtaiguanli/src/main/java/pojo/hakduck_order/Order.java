package pojo.hakduck_order;


public class Order {

  private long orderId;
  private long phone;
  private long commodityId;
  private long useraddress;
  private java.sql.Date orderTime;
  private java.sql.Date deliveryTime;
  private String shippingAddress;
  private long deliveryCost;
  private double transactionCode;
  private double orderStatus;
  private double orderOfferCode;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getPhone() {
    return phone;
  }

  public void setPhone(long phone) {
    this.phone = phone;
  }


  public long getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(long commodityId) {
    this.commodityId = commodityId;
  }


  public long getUseraddress() {
    return useraddress;
  }

  public void setUseraddress(long useraddress) {
    this.useraddress = useraddress;
  }


  public java.sql.Date getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(java.sql.Date orderTime) {
    this.orderTime = orderTime;
  }


  public java.sql.Date getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(java.sql.Date deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  public String getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(String shippingAddress) {
    this.shippingAddress = shippingAddress;
  }


  public long getDeliveryCost() {
    return deliveryCost;
  }

  public void setDeliveryCost(long deliveryCost) {
    this.deliveryCost = deliveryCost;
  }


  public double getTransactionCode() {
    return transactionCode;
  }

  public void setTransactionCode(double transactionCode) {
    this.transactionCode = transactionCode;
  }


  public double getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(double orderStatus) {
    this.orderStatus = orderStatus;
  }


  public double getOrderOfferCode() {
    return orderOfferCode;
  }

  public void setOrderOfferCode(double orderOfferCode) {
    this.orderOfferCode = orderOfferCode;
  }

}
