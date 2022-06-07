package com.example.Pill_Remainder.Entities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.LinkedList;

import com.example.Pill_Remainder.Dependent;


public class DependentDAO<PillApp_Peoples> {
private Connection con;
	
	public DependentDAO() {
		try {
			this.con=DBSingleton.getInstance();
		}
		catch(Exception ex)
		{	
			System.out.println(ex);
			
		}
	}
	
	public int save(Dependent lc)
	{
		String insertt="Replace into Dependent(Dependent_Id,Relationship,Dependent_Name,Dependent_Email,Dependent_Contact,Dependent_Blood_Group,Dependent_DOB,Dependent_Weight,Dependent_Height)"
				+ " values("+lc.getDependent_Id()+",'"+lc.getRelationship()+"',"+lc.getDependent_Name()+",'"+lc.getDependent_Email()+"','"+lc.getDependent_Contact()+"','"+lc.getDependent_Blood_Group()+"','"+lc.getDependent_dob()+"','"+lc.getDependent_Weight()+"','"+lc.getDependent_Height()+"')";
		int x=0;
		Statement st=null;
		System.out.println(insertt);
		try {
			st=this.con.createStatement();
			x=st.executeUpdate(insertt);
		}
		catch(Exception ex) {
			return 0;
		}
		return x;
	}
		
	public int deleteData(int dependent_Id) {
		String delete1="Delete from Dependent where Dependent_Id="+dependent_Id;
		int x=0;
		Statement st=null;
		try {
			st=this.con.createStatement();
			x=st.executeUpdate(delete1);
	     }
		catch(Exception ex)
		{
			System.out.print(ex);
			return 0;
		}
		return x;
}
	
	public Dependent showData(int dependent_id){
		Dependent pl=null;
		Statement st=null;
		try {
			st=this.con.createStatement();
			String str="Select Dependent_Id,Relationship,Dependent_Name,Dependent_Email,Dependent_Contact,Dependent_Blood_Group,Dependent_DOB,Dependent_Weight,Dependent_Height from Dependent where dependent_Id="+dependent_id;
			System.out.println(str);
			ResultSet rs=st.executeQuery(str);
			
			while(rs.next()) {
				pl=new Dependent(rs.getInt("dependent_id"),rs.getString("Relationship"),rs.getString("dependent_Name"),rs.getString("dependent_Email"),rs.getString("dependent_Contact"), rs.getString("dependent_Blood_Group"),rs.getDate("dependent_dob"),rs.getString("dependent_Weight"),rs.getString("dependent_Height"));
			}
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		return pl;
	}
}
