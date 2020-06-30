package pojo.hakduck_seckill;


public class SeckillCommodity {

  private long id;
  private long commoditySkuId;
  private String spuid_Title;
  private String smallImage;
  private double price;
  private double costPrice;
  private java.sql.Date createTime;
  private java.sql.Date checkStatus;
  private java.sql.Date startTime;
  private java.sql.Date endTime;
  private long stock;
  private long stockCount;
  private String introduction;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCommoditySkuId() {
    return commoditySkuId;
  }

  public void setCommoditySkuId(long commoditySkuId) {
    this.commoditySkuId = commoditySkuId;
  }


  public String getSpuid_Title() {
    return spuid_Title;
  }

  public void setSpuid_Title(String spuid_Title) {
    this.spuid_Title = spuid_Title;
  }


  public String getSmallImage() {
    return smallImage;
  }

  public void setSmallImage(String smallImage) {
    this.smallImage = smallImage;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public double getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(double costPrice) {
    this.costPrice = costPrice;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public java.sql.Date getCheckStatus() {
    return checkStatus;
  }

  public void setCheckStatus(java.sql.Date checkStatus) {
    this.checkStatus = checkStatus;
  }


  public java.sql.Date getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Date startTime) {
    this.startTime = startTime;
  }


  public java.sql.Date getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Date endTime) {
    this.endTime = endTime;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public long getStockCount() {
    return stockCount;
  }

  public void setStockCount(long stockCount) {
    this.stockCount = stockCount;
  }


  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

}
