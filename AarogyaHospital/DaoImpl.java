package com.AarogyaHospital;

import java.sql.*;
import java.util.*;

public class DaoImpl implements DaoInterface
{
	Scanner sc=new Scanner(System.in);
	Connection con;
	DaoImpl(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aarogya","root","");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void patientRegistartion(Patient p) {
		try
		{
			PreparedStatement pstmt=con.prepareStatement
					("INSERT INTO patient(name,gender,AadharNumber, contactNumber, city, address,"
							+ "dateOfAdmission, guardianName, guardianAddress, "
							+ "guardianContactNumber,age,status) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt .setString(1,p.getName());
			pstmt .setString(2,p.getGender());
			pstmt .setString(3,p.getAadharNumber());
			pstmt .setString(4,p.getContactNumber());
			pstmt .setString(5,p.getCity());
			pstmt .setString(6,p.getAddress());
			pstmt .setString(7,p.getDateOfAdmission());
			pstmt .setString(8,p.getGuardianName());
			pstmt .setString(9,p.getGuardianAddress());
			pstmt .setString(10,p.getGuardianContactNumber());
			pstmt .setInt(11,p.getAge());
			pstmt .setString(12,p.getStatus());		
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Patient registered Succesfully");
			}
			else {
				System.out.println("ERROR while registering");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void showAllPatients() {
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM patient");
			ResultSetMetaData rsmd=rs.getMetaData();
			int colscount=rsmd.getColumnCount();
			for(int i=1;i<=colscount;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t      ");
			}
			while(rs.next()) {
				for(int i=1;i<=colscount;i++) {
					System.out.print(rs.getString(i)+"\t      ");
				}
				System.out.println();
			}
			con.close();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void searchPatientById() {
		System.out.println("Enter patient ID to search");
		int id1=sc.nextInt();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM patient");
			//rs=setInt(1,id.getID);
			ResultSetMetaData rsmd=rs.getMetaData();
			int colscount=rsmd.getColumnCount();
			for(int i=1;i<=colscount;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t      ");
			}
			while(rs.next()) {
				if(rs.getInt(1)==id1) {
				for(int i=1;i<=colscount;i++) {
					System.out.print(rs.getString(i)+"\t      ");
				}
				System.out.println();
			}
			}
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void searchPatientByCity() {
		System.out.println("Enter patient city to search: ");
		String city=sc.nextLine();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM patient");
			//rs=setString(city.getCity());
			ResultSetMetaData rsmd=rs.getMetaData();
			int colscount=rsmd.getColumnCount();
			for(int i=1;i<=colscount;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t      ");
			}
			while(rs.next()) {
				if(rs.getString(6).equalsIgnoreCase(city)) {
				for(int i=1;i<=colscount;i++) {
					System.out.print(rs.getString(i)+"\t      ");
				}
				System.out.println();
			}
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void searchPatientByAge() {
		System.out.println("Enter patient strating age group: ");
		int age1=sc.nextInt();
		System.out.println("Enter patient ending age group: ");
		int age2=sc.nextInt();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM patient");
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int colscount=rsmd.getColumnCount();
			for(int i=1;i<=colscount;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t      ");
			}
			while(rs.next()) {
				if(rs.getInt(1)>=age1&&rs.getInt(1)<=age2) {
				for(int i=1;i<=colscount;i++) {
					System.out.print(rs.getString(i)+"\t      ");
				}
				System.out.println();
			}
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void recoveryStatus() {
		try {
			System.out.println("Enter patient ID to search: ");
			int id1=sc.nextInt();
			PreparedStatement pstmt=con.prepareStatement("UPDATE patient SET status='recovered' WHERE id="+id1+"");
			int i=pstmt.executeUpdate();
			if(i==1)
			{
				System.out.println("Record Updated Successfully");
			}
			else 
			{
				System.out.println("ERROR OCCUR WHILE Updating");
			}
			
			//con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deletePatientById() {
		try {
			System.out.println("Enter patient ID to search: ");
			int id1=sc.nextInt();
			PreparedStatement pstmt=con.prepareStatement("DELETE FROM patient WHERE id="+id1+"");
			int i=pstmt.executeUpdate();
			if (i!=0) {
				System.out.println("Patient information deleted succesfully");
			}else {
				System.out.println("Error while deleting Patient information");
			}
			//con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void medicineDetails(Medicine m) {
		try {
			PreparedStatement pstmt=con.prepareStatement
					("INSERT INTO medicine(MedicineID,MedicineName,UnitPrice,Quantity,"
							+ "ManufactureDate,ExpiryDate) VALUES(?,?,?,?,?,?)");
			
			pstmt.setInt(1,m.getMedicineID());
			pstmt.setString(2,m.getMedicineName());
			pstmt.setInt(3,m.getUnitPrice());
			pstmt.setInt(4,m.getQuantity());
			pstmt.setString(5,m.getManufactureDate());
			pstmt.setString(6,m.getExpiryDate());
			
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Medicine details added Succesfully");
			}else {
				System.out.println("Error While adding Medicine details");
				//con.close();
			}
		
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void ShowAllMedicines()
	{
		try {
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM medicine");
			ResultSetMetaData rsmd=rs.getMetaData();
			int colscount=rsmd.getColumnCount();
			for(int i=1;i<=colscount;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t      ");
			}
			while(rs.next()) {
				for(int i=1;i<=colscount;i++) {
					System.out.print(rs.getString(i)+"\t      ");
				}
				System.out.println();
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void searchMedicineByID() {
		System.out.println("Enter medicine ID to search");
		int id1=sc.nextInt();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM medicine");
			//rs=setInt(1,id.getID);
			ResultSetMetaData rsmd=rs.getMetaData();
			int colscount=rsmd.getColumnCount();
			for(int i=1;i<=colscount;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t      ");
			}
			while(rs.next()) {
				if(rs.getInt(1)==id1) {
				for(int i=1;i<=colscount;i++) {
					System.out.print(rs.getString(i)+"\t      ");
				}
				System.out.println();
			}
			}
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteMedicineByID() {
		try {
			System.out.println("Enter medicine ID to delete: ");
			int id1=sc.nextInt();
			PreparedStatement pstmt=con.prepareStatement("DELETE FROM medicine WHERE id="+id1+"");
			int i=pstmt.executeUpdate();
			if (i!=0) {
				System.out.println("Medicine information deleted succesfully");
			}else {
				System.out.println("Error while deleting medicine information");
			}
			//con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void supplierDetails(Supplier s) {
		try {
			PreparedStatement pstmt=con.prepareStatement
					("INSERT INTO supplier(SupplierID,SupplierName,DateandTimeOfSupply)VALUES(?,?,?)");
			
			pstmt.setInt(1,s.getSupllierID());
			pstmt.setString(2,s.getSupplierName());
			pstmt.setString(3,s.getDateandTimeOfSupply());
			
			int i=pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Supplier details added Succesfully");
			}else {
				System.out.println("Error While adding Supplier details");
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void showAllSupllier() {
		try {
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM supplier");
			ResultSetMetaData rsmd=rs.getMetaData();
			int colscount=rsmd.getColumnCount();
			for(int i=1;i<=colscount;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t      ");
			}
			while(rs.next()) {
				for(int i=1;i<=colscount;i++) {
					System.out.print(rs.getString(i)+"\t      ");
				}
				System.out.println();
			}
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void searchSupplierByID() {
		System.out.println("Enter supplier ID to search");
		int id1=sc.nextInt();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM supplier");
			//rs=setInt(1,id.getID);
			ResultSetMetaData rsmd=rs.getMetaData();
			int colscount=rsmd.getColumnCount();
			for(int i=1;i<=colscount;i++) {
				System.out.print(rsmd.getColumnName(i)+"\t      ");
			}
			while(rs.next()) {
				if(rs.getInt(1)==id1) {
				for(int i=1;i<=colscount;i++) {
					System.out.print(rs.getString(i)+"\t      ");
				}
				System.out.println();
			}
			}
			
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteSupplierByID() {
		try {
			System.out.println("Enter supplier ID to delete: ");
			int id1=sc.nextInt();
			PreparedStatement pstmt=con.prepareStatement("DELETE FROM supplier WHERE id="+id1+"");
			int i=pstmt.executeUpdate();
			if (i!=0) {
				System.out.println("supplier information deleted succesfully");
			}else {
				System.out.println("Error while deleting supplier information");
			}
			//con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

