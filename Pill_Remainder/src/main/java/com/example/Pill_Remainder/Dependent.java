package com.example.Pill_Remainder;

import java.sql.Date;

/**
 * @author Alkesh
 *
 */
public class Dependent {
	
		 private int Dependent_Id;
		 private String Relationship;
		 private String Dependent_Name;
		 private String Dependent_Email;
		 private int Dependent_Contact;
		 private String Dependent_Blood_Group;
		 private Date Dependent_dob;
		 private String Dependent_Weight;
		 private String Dependent_Height;
		public int getDependent_Id() {
			return Dependent_Id;
		}
		public void setDependent_Id(int dependent_Id) {
			Dependent_Id = dependent_Id;
		}
		public String getRelationship() {
			return Relationship;
		}
		public void setRelationship(String relationship) {
			Relationship = relationship;
		}
		public String getDependent_Name() {
			return Dependent_Name;
		}
		public void setDependent_Name(String dependent_Name) {
			Dependent_Name = dependent_Name;
		}
		public String getDependent_Email() {
			return Dependent_Email;
		}
		public void setDependent_Email(String dependent_Email) {
			Dependent_Email = dependent_Email;
		}
		public int getDependent_Contact() {
			return Dependent_Contact;
		}
		public void setDependent_Contact(int dependent_Contact) {
			Dependent_Contact = dependent_Contact;
		}
		public String getDependent_Blood_Group() {
			return Dependent_Blood_Group;
		}
		public void setDependent_Blood_Group(String dependent_Blood_Group) {
			Dependent_Blood_Group = dependent_Blood_Group;
		}
		public Date getDependent_dob() {
			return Dependent_dob;
		}
		public void setDependent_dob(Date dependent_dob) {
			Dependent_dob = dependent_dob;
		}
		public String getDependent_Weight() {
			return Dependent_Weight;
		}
		public void setDependent_Weight(String dependent_Weight) {
			Dependent_Weight = dependent_Weight;
		}
		public String getDependent_Height() {
			return Dependent_Height;
		}
		public void setDependent_Height(String dependent_Height) {
			Dependent_Height = dependent_Height;
		}
		public Dependent(int dependent_Id, String relationship, String dependent_Name, String dependent_Email,
				int dependent_Contact, String dependent_Blood_Group, Date dependent_dob, String dependent_Weight,
				String dependent_Height) {
			super();
			Dependent_Id = dependent_Id;
			Relationship = relationship;
			Dependent_Name = dependent_Name;
			Dependent_Email = dependent_Email;
			Dependent_Contact = dependent_Contact;
			Dependent_Blood_Group = dependent_Blood_Group;
			Dependent_dob = dependent_dob;
			Dependent_Weight = dependent_Weight;
			Dependent_Height = dependent_Height;
		}
		public Dependent() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Dependent [Dependent_Id=" + Dependent_Id + ", Relationship=" + Relationship + ", Dependent_Name="
					+ Dependent_Name + ", Dependent_Email=" + Dependent_Email + ", Dependent_Contact="
					+ Dependent_Contact + ", Dependent_Blood_Group=" + Dependent_Blood_Group + ", Dependent_dob="
					+ Dependent_dob + ", Dependent_Weight=" + Dependent_Weight + ", Dependent_Height="
					+ Dependent_Height + "]";
		}
}


