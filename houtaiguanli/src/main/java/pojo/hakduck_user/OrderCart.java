package pojo.hakduck_user;


public class OrderCart {

  private long id;
  private long userId;
  private long commoditySkuId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getCommoditySkuId() {
    return commoditySkuId;
  }

  public void setCommoditySkuId(long commoditySkuId) {
    this.commoditySkuId = commoditySkuId;
  }

}
