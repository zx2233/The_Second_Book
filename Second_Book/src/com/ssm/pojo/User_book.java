/**
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-17下午2:48:08
 */
package com.ssm.pojo;

/**
 * @ClassName:user_book
 * @Description:TODO
 * @author:20155875_张轩
 * @date2018-5-17下午2:48:08
 */
public class User_book {
	private String User_Uid;
	private String Book_Bid;
	private String Aduit_status;
	private String Selling_status;
	private String isCollection;
	
	public User_book() {
		super();
	}
	public User_book(String user_Uid, String book_Bid, String aduit_status,
			String selling_status, String isCollection) {
		super();
		User_Uid = user_Uid;
		Book_Bid = book_Bid;
		Aduit_status = aduit_status;
		Selling_status = selling_status;
		this.isCollection = isCollection;
	}
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
	/** 
	 * @author:Rabbit
	 * @return the aduit_status
	 */
	public String getAduit_status() {
		return Aduit_status;
	}
	/**
	 * @author:Rabbit
	 * @param aduit_status the aduit_status to set
	 */
	public void setAduit_status(String aduit_status) {
		Aduit_status = aduit_status;
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
	/** 
	 * @author:Rabbit
	 * @return the isCollection
	 */
	public String getIsCollection() {
		return isCollection;
	}
	/**
	 * @author:Rabbit
	 * @param isCollection the isCollection to set
	 */
	public void setIsCollection(String isCollection) {
		this.isCollection = isCollection;
	}
	
}
