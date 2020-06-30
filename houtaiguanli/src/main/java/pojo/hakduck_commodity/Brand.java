package pojo.hakduck_commodity;


public class Brand {

  private long id;
  private String brandName;
  private String brandWeb;
  private String brandDesc;
  private long brandstatus;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public String getBrandWeb() {
    return brandWeb;
  }

  public void setBrandWeb(String brandWeb) {
    this.brandWeb = brandWeb;
  }


  public String getBrandDesc() {
    return brandDesc;
  }

  public void setBrandDesc(String brandDesc) {
    this.brandDesc = brandDesc;
  }


  public long getBrandstatus() {
    return brandstatus;
  }

  public void setBrandstatus(long brandstatus) {
    this.brandstatus = brandstatus;
  }

}
