package com.qianfeng.book.po;


public class TbBook {

  private long bookId;
  private String bookName;
  private long authorId;
  private TbAuthor author;


  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }


  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }


  public long getAuthorId() {
    return authorId;
  }

  public void setAuthorId(long authorId) {
    this.authorId = authorId;
  }

  public TbAuthor getAuthor() {
    return author;
  }

  public void setAuthor(TbAuthor author) {
    this.author = author;
  }
}
