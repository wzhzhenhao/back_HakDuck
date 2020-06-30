package pojo.hakduck_commodity;


public class CommoditySku {

  private long skuId;
  private long commodityId;
  private String commoditySymbolPath;
  private java.sql.Date productionDate;
  private double price;
  private double priceTime;
  private long stock;


  public long getSkuId() {
    return skuId;
  }

  public void setSkuId(long skuId) {
    this.skuId = skuId;
  }


  public long getCommodityId() {
    return commodityId;
  }

  public void setCommodityId(long commodityId) {
    this.commodityId = commodityId;
  }


  public String getCommoditySymbolPath() {
    return commoditySymbolPath;
  }

  public void setCommoditySymbolPath(String commoditySymbolPath) {
    this.commoditySymbolPath = commoditySymbolPath;
  }


  public java.sql.Date getProductionDate() {
    return productionDate;
  }

  public void setProductionDate(java.sql.Date productionDate) {
    this.productionDate = productionDate;
  }


  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }


  public double getPriceTime() {
    return priceTime;
  }

  public void setPriceTime(double priceTime) {
    this.priceTime = priceTime;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }

}
