package pojo.hakduck_comment;


public class CommodityComment {

  private long id;
  private long replyId;
  private long replyuserId;
  private String replywnerName;
  private long commentuserId;
  private String commentTxt;
  private long commentscore;
  private java.sql.Date commentTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getReplyId() {
    return replyId;
  }

  public void setReplyId(long replyId) {
    this.replyId = replyId;
  }


  public long getReplyuserId() {
    return replyuserId;
  }

  public void setReplyuserId(long replyuserId) {
    this.replyuserId = replyuserId;
  }


  public String getReplywnerName() {
    return replywnerName;
  }

  public void setReplywnerName(String replywnerName) {
    this.replywnerName = replywnerName;
  }


  public long getCommentuserId() {
    return commentuserId;
  }

  public void setCommentuserId(long commentuserId) {
    this.commentuserId = commentuserId;
  }


  public String getCommentTxt() {
    return commentTxt;
  }

  public void setCommentTxt(String commentTxt) {
    this.commentTxt = commentTxt;
  }


  public long getCommentscore() {
    return commentscore;
  }

  public void setCommentscore(long commentscore) {
    this.commentscore = commentscore;
  }


  public java.sql.Date getCommentTime() {
    return commentTime;
  }

  public void setCommentTime(java.sql.Date commentTime) {
    this.commentTime = commentTime;
  }

}
