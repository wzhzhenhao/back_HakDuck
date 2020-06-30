package pojo.hakduck_user;


public class User {

  private long id;
  private String userImage;
  private String userEmail;
  private long userPhone;
  private String userName;
  private String _LoginName;
  private String password;
  private long permissions;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUserImage() {
    return userImage;
  }

  public void setUserImage(String userImage) {
    this.userImage = userImage;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public long getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(long userPhone) {
    this.userPhone = userPhone;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String get_LoginName() {
    return _LoginName;
  }

  public void set_LoginName(String _LoginName) {
    this._LoginName = _LoginName;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getPermissions() {
    return permissions;
  }

  public void setPermissions(long permissions) {
    this.permissions = permissions;
  }

}
