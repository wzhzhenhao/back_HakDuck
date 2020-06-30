package pojo.hakduck_commodity;


public class CommodityDetails {

  private long id;
  private long commodityKeyId;
  private String commodityKeyHtml;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCommodityKeyId() {
    return commodityKeyId;
  }

  public void setCommodityKeyId(long commodityKeyId) {
    this.commodityKeyId = commodityKeyId;
  }


  public String getCommodityKeyHtml() {
    return commodityKeyHtml;
  }

  public void setCommodityKeyHtml(String commodityKeyHtml) {
    this.commodityKeyHtml = commodityKeyHtml;
  }

}
