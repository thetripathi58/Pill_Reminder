package com.example.Pill_Remainder;

import java.util.Date;

/**
 * @author Prasanna & Chidanand
 *
 */
public class Users {
	 private String User_Name;
	 private String User_Email;
	 private String User_Password;
	 private int User_Contact;
	 private String User_Country;
	 private Date User_dob;
	 private String User_Weight;
	 private String User_Height;
	 private String User_Blood_Group;
	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getUser_Email() {
		return User_Email;
	}
	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}
	public String getUser_Password() {
		return User_Password;
	}
	public void setUser_Password(String user_Password) {
		User_Password = user_Password;
	}
	public int getUser_Contact() {
		return User_Contact;
	}
	public void setUser_Contact(int user_Contact) {
		User_Contact = user_Contact;
	}
	public String getUser_Country() {
		return User_Country;
	}
	public void setUser_Country(String user_Country) {
		User_Country = user_Country;
	}
	public Date getUser_dob() {
		return User_dob;
	}
	public void setUser_dob(Date user_dob) {
		User_dob = user_dob;
	}
	public String getUser_Weight() {
		return User_Weight;
	}
	public void setUser_Weight(String user_Weight) {
		User_Weight = user_Weight;
	}
	public String getUser_Height() {
		return User_Height;
	}
	public void setUser_Height(String user_Height) {
		User_Height = user_Height;
	}
	public String getUser_Blood_Group() {
		return User_Blood_Group;
	}
	public void setUser_Blood_Group(String user_Blood_Group) {
		User_Blood_Group = user_Blood_Group;
	}
public Users(String user_Name, String user_Email, String user_Password, int user_Contact, String user_Country,
		Date user_dob, String user_Weight, String user_Height, String user_Blood_Group) {
	super();
	User_Name = user_Name;
	User_Email = user_Email;
	User_Password = user_Password;
	User_Contact = user_Contact;
	User_Country = user_Country;
	User_dob = user_dob;
	User_Weight = user_Weight;
	User_Height = user_Height;
	User_Blood_Group = user_Blood_Group;
}
public Users() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Users [User_Name=" + User_Name + ", User_Email=" + User_Email + ", User_Password=" + User_Password
			+ ", User_Contact=" + User_Contact + ", User_Country=" + User_Country + ", User_dob=" + User_dob
			+ ", User_Weight=" + User_Weight + ", User_Height=" + User_Height + ", User_Blood_Group=" + User_Blood_Group
			+ "]";
}
}


     
   
	