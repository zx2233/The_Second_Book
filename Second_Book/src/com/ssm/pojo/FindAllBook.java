/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-27下午7:50:18
 */
package com.ssm.pojo;

/**
 * @ClassName:FindAllBook
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-27下午7:50:18
 */
public class FindAllBook extends User_book {
	private String User_Uid;
	private String Book_Bid;
	private String Book_BUid;
	private String Selling_status;
	private String Aduit_status;
	private String Book_Name;
	private String Book_New_or_Old;
	private String Book_Number;
	private String  Book_Price;
	private String Book_Description;
	private String Book_Image;
	private String  Book_Up_Down;
	/** 
	 * @author:Rabbit
	 * @return the book_Name
	 */
	public String getBook_Name() {
		return Book_Name;
	}
	/**
	 * @author:Rabbit
	 * @param book_Name the book_Name to set
	 */
	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}
	/** 
	 * @author:Rabbit
	 * @return the book_New_or_Old
	 */
	public String getBook_New_or_Old() {
		return Book_New_or_Old;
	}
	/**
	 * @author:Rabbit
	 * @param book_New_or_Old the book_New_or_Old to set
	 */
	public void setBook_New_or_Old(String book_New_or_Old) {
		Book_New_or_Old = book_New_or_Old;
	}
	/** 
	 * @author:Rabbit
	 * @return the book_Number
	 */
	public String getBook_Number() {
		return Book_Number;
	}
	/**
	 * @author:Rabbit
	 * @param book_Number the book_Number to set
	 */
	public void setBook_Number(String book_Number) {
		Book_Number = book_Number;
	}
	/** 
	 * @author:Rabbit
	 * @return the book_Price
	 */
	public String getBook_Price() {
		return Book_Price;
	}
	/**
	 * @author:Rabbit
	 * @param book_Price the book_Price to set
	 */
	public void setBook_Price(String book_Price) {
		Book_Price = book_Price;
	}
	/** 
	 * @author:Rabbit
	 * @return the book_Description
	 */
	public String getBook_Description() {
		return Book_Description;
	}
	/**
	 * @author:Rabbit
	 * @param book_Description the book_Description to set
	 */
	public void setBook_Description(String book_Description) {
		Book_Description = book_Description;
	}
	/** 
	 * @author:Rabbit
	 * @return the book_Image
	 */
	public String getBook_Image() {
		return Book_Image;
	}
	/**
	 * @author:Rabbit
	 * @param book_Image the book_Image to set
	 */
	public void setBook_Image(String book_Image) {
		Book_Image = book_Image;
	}
	/** 
	 * @author:Rabbit
	 * @return the book_Up_Down
	 */
	public String getBook_Up_Down() {
		return Book_Up_Down;
	}
	/**
	 * @author:Rabbit
	 * @param book_Up_Down the book_Up_Down to set
	 */
	public void setBook_Up_Down(String book_Up_Down) {
		Book_Up_Down = book_Up_Down;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	

	/** 
	 * @author:Rabbit
	 * @return the aduit_status
	 */
	public String getAduit_status() {
		return Aduit_status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 *
	/**
	 * @author:Rabbit
	 * @param aduit_status the aduit_status to set
	 */
	public void setAduit_status(String aduit_status) {
		Aduit_status = aduit_status;
	}
	/** 
	 * @author:Rabbit
	 * @return the book_Bid
	 */
	public String getBook_Bid() {
		return Book_Bid;
	}
	/**
	 * @author:Rabbit
	 * @param book_Bid the book_Bid to set
	 */
	public void setBook_Bid(String book_Bid) {
		Book_Bid = book_Bid;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/** 
	 * @author:Rabbit
	 * @return the user_Uid
	 */
	public String getUser_Uid() {
		return User_Uid;
	}
	/**
	 * @author:Rabbit
	 * @param user_Uid the user_Uid to set
	 */
	public void setUser_Uid(String user_Uid) {
		User_Uid = user_Uid;
	}
	
	/** 
	 * @author:Rabbit
	 * @return the selling_status
	 */
	public String getSelling_status() {
		return Selling_status;
	}
	/**
	 * @author:Rabbit
	 * @param selling_status the selling_status to set
	 */
	public void setSelling_status(String selling_status) {
		Selling_status = selling_status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/** 
	 * @author:Rabbit
	 * @return the book_BUid
	 */
	public String getBook_BUid() {
		return Book_BUid;
	}
	/**
	 * @author:Rabbit
	 * @param book_BUid the book_BUid to set
	 */
	public void setBook_BUid(String book_BUid) {
		Book_BUid = book_BUid;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FindAllBook [User_Uid=" + User_Uid + ", Book_Bid=" + Book_Bid
				+ ", Book_BUid=" + Book_BUid + ", Selling_status="
				+ Selling_status + ", Aduit_status=" + Aduit_status
				+ ", Book_Name=" + Book_Name + ", Book_New_or_Old="
				+ Book_New_or_Old + ", Book_Number=" + Book_Number
				+ ", Book_Price=" + Book_Price + ", Book_Description="
				+ Book_Description + ", Book_Image=" + Book_Image
				+ ", Book_Up_Down=" + Book_Up_Down + "]";
	}




	
}
