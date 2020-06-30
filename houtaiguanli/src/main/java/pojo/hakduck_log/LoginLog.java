package pojo.hakduck_log;


public class LoginLog {

  private long id;
  private long userId;
  private java.sql.Date loginTime;
  private long loginIp;


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


  public java.sql.Date getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(java.sql.Date loginTime) {
    this.loginTime = loginTime;
  }


  public long getLoginIp() {
    return loginIp;
  }

  public void setLoginIp(long loginIp) {
    this.loginIp = loginIp;
  }

}
