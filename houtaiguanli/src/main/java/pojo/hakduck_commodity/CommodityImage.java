package pojo.hakduck_commodity;


public class CommodityImage {

  private long id;
  private long dityId;
  private String dityImage;
  private long ismaster;
  private long imgstatus;
  private java.sql.Date modifiedTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getDityId() {
    return dityId;
  }

  public void setDityId(long dityId) {
    this.dityId = dityId;
  }


  public String getDityImage() {
    return dityImage;
  }

  public void setDityImage(String dityImage) {
    this.dityImage = dityImage;
  }


  public long getIsmaster() {
    return ismaster;
  }

  public void setIsmaster(long ismaster) {
    this.ismaster = ismaster;
  }


  public long getImgstatus() {
    return imgstatus;
  }

  public void setImgstatus(long imgstatus) {
    this.imgstatus = imgstatus;
  }


  public java.sql.Date getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(java.sql.Date modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

}
