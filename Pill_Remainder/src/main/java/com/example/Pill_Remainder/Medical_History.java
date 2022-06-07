package com.example.Pill_Remainder;

import java.util.Date;

/**
 * @author Prasanna & Chidanand
 *
 */
public class Medical_History {
	private String Illness;
	 private String Doctor_Details;
	 private String Medcines;
	 private Date Start_Date;
	 private Date End_Date;
	 private String Dosage_Frequency;
	 private String Dosage_Time;
	 private String Email_Notification;
	 private String Remove;
	public Medical_History() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medical_History(String illness, String doctor_Details, String medcines, Date start_Date, Date end_Date,
			String dosage_Frequency, String dosage_Time, String email_Notification, String remove) {
		super();
		Illness = illness;
		Doctor_Details = doctor_Details;
		Medcines = medcines;
		Start_Date = start_Date;
		End_Date = end_Date;
		Dosage_Frequency = dosage_Frequency;
		Dosage_Time = dosage_Time;
		Email_Notification = email_Notification;
		Remove = remove;
	}
	@Override
	public String toString() {
		return "Medical_History [Illness=" + Illness + ", Doctor_Details=" + Doctor_Details + ", Medcines=" + Medcines
				+ ", Start_Date=" + Start_Date + ", End_Date=" + End_Date + ", Dosage_Frequency=" + Dosage_Frequency
				+ ", Dosage_Time=" + Dosage_Time + ", Email_Notification=" + Email_Notification + ", Remove=" + Remove
				+ "]";
	}
	public String getIllness() {
		return Illness;
	}
	public void setIllness(String illness) {
		Illness = illness;
	}
	public String getDoctor_Details() {
		return Doctor_Details;
	}
	public void setDoctor_Details(String doctor_Details) {
		Doctor_Details = doctor_Details;
	}
	public String getMedcines() {
		return Medcines;
	}
	public void setMedcines(String medcines) {
		Medcines = medcines;
	}
	public Date getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(Date start_Date) {
		Start_Date = start_Date;
	}
	public Date getEnd_Date() {
		return End_Date;
	}
	public void setEnd_Date(Date end_Date) {
		End_Date = end_Date;
	}
	public String getDosage_Frequency() {
		return Dosage_Frequency;
	}
	public void setDosage_Frequency(String dosage_Frequency) {
		Dosage_Frequency = dosage_Frequency;
	}
	public String getDosage_Time() {
		return Dosage_Time;
	}
	public void setDosage_Time(String dosage_Time) {
		Dosage_Time = dosage_Time;
	}
	public String getEmail_Notification() {
		return Email_Notification;
	}
	public void setEmail_Notification(String email_Notification) {
		Email_Notification = email_Notification;
	}
	public String getRemove() {
		return Remove;
	}
	public void setRemove(String remove) {
		Remove = remove;
	}
}
	 
