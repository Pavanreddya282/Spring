package com.AarogyaHospital;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	try {
    		DaoInterface dao=new DaoImpl();
    		
    		do {
    			System.out.println("Welcome to Aarogya Hospital");
    			System.out.println("press [1] for patient registration");
    			System.out.println("press [2] for medicine records");
    			System.out.println("press [3] for supplier records");
    			System.out.println("press [4] for Contact Us Information");
    			System.out.println("press [0] to exit application");
    			int option = sc.nextInt();
    			if(option<0 || option>4) {
    				System.out.println("Wrong choice");
    			}
    			else if(option==1) {
    				
    				System.out.println("-- Patient Registration --");
    				System.out.println("[1]. Add new Patient");
    				System.out.println("[2]. To view all patient details");
        			System.out.println("[3]. To serch Patient by Unique ID");
        			System.out.println("[4]. To search a patient from a particular city");
        			System.out.println("[5]. To search a patient from a particular age");
        			System.out.println("[6]. To mark recovery of a patient");
        			System.out.println("[7]. To delete Data of a patient");
        			System.out.println("[0]. To exit");
        			System.out.println("Enter your choice ");
        			int n = sc.nextInt();
        			switch(n) {
        			case 1:
        				Patient p=new Patient();
        				sc.nextLine();
        				System.out.println("Enter Name of the patient: ");
        				String pname=sc.nextLine();
        				System.out.println("Enter patient gender: ");
        				String pgender=sc.nextLine();
        				System.out.println("Enter your 12 digit Aadhar number");
        				String paadhar=sc.nextLine();
        				System.out.println("Enter your 10 digit phone number");
        				String phnnum = sc.nextLine();
        				System.out.println("Enter patient city");
        				String city = sc.nextLine();
        				System.out.println("Enter patient address");
        				String address = sc.nextLine();
        				System.out.println("Enter date of admission(dd-mm-yyy)");
        				String dateofadmission = sc.nextLine();
        				System.out.println("Enter guardian name");
        				String guardianname = sc.nextLine();
        				System.out.println("Enter guardian address ");
        				String guardianaddress = sc.nextLine();
        				System.out.println("Enter guardian 10 digit phone number");
        				String guardianphnnum = sc.nextLine();
        				System.out.println("enter patient age");
        				int age = sc.nextInt();
        				
        				p.setName(pname);
        	            p.setGender(pgender);
        	            p.setAadharNumber(paadhar);
        	            p.setContactNumber(phnnum);
        	            p.setCity(city);
        	            p.setAddress(address);
        	            p.setDateOfAdmission(dateofadmission);
        	            p.setGuardianName(guardianname);
        	            p.setGuardianAddress(guardianaddress);
        	            p.setGuardianContactNumber(guardianphnnum);
        	            p.setAge(age);
        	            p.setStatus("NotRecovered");
        	            dao.patientRegistartion(p);
        	            break;
        	        
        			case 2:
        				dao.showAllPatients();
        				break;
        			case 3:
        				dao.searchPatientById();
        				break;
        			case 4:
        				dao.searchPatientByCity();
        				break;
        			case 5:
        				dao.searchPatientByAge();
        				break;
        			
        			case 6:
        				dao.recoveryStatus();
        				dao.searchPatientById();
        				break;
        			case 7:
        				dao.deletePatientById();
        				dao.searchPatientById();
        				break;
        			case 0:
        				System.exit(0);
        				break;
        				
        				default:
        					System.out.println("invalid option");
        			}
    				
    			}
    			else if(option ==2) {
    				System.out.println("-- Medicine Records --");
        			System.out.println("[1]. Add new Medicine");
        			System.out.println("[2]. View all Medicine details");
        			System.out.println("[3]. search Medicine by ID");
        			System.out.println("[4]. delete Medicine by ID");
        			System.out.println("[0]. To exit");
        			System.out.println("Enter your choice ");
        			int n = sc.nextInt();
        			switch(n) {
        			case 1:
        				Medicine m=new Medicine();
        				sc.nextLine();
        				System.out.println("Enter Medicine ID");
        				int MedID=sc.nextInt();
        				System.out.println("Enter Name of the Medicine: ");
        				String MedName=sc.next();
        				System.out.println("Enter price of medicine per unit");
        				int MedPrice=sc.nextInt();
        				System.out.println("Enter the Quantity");
        				int MedQt=sc.nextInt();
        				System.out.println("Enter Manufactured date of Medicine");
        				String MedMfd=sc.next();
        				System.out.println("Enter Expiry date of Medicine");
        				String MedExp=sc.next();
        				
        				m.setMedicineID(MedID);
        	            m.setMedicineName(MedName);
        	            m.setUnitPrice(MedPrice);
        	            m.setQuantity(MedQt);
        	            m.setManufactureDate(MedMfd);
        	            m.setExpiryDate(MedExp);
        	            dao.medicineDetails(m);
        	            break;
        	            
        			case 2:
        				dao.ShowAllMedicines();
        				break;
        			case 3:
        				dao.searchMedicineByID();
        				break;
        			case 4:
        				dao.deleteMedicineByID();
        				break;
        			case 0:
        				System.exit(0);
        				break;
        				
        				default:
        					System.out.println("invalid option");
        			}
    			}
    			else if(option ==3) {
    				System.out.println("-- Supplier Records --");
    				
        			System.out.println("[1]. Add new Supplier");
        			System.out.println("[2]. View all Supplier details");
        			System.out.println("[3]. search Supplier by ID");
        			System.out.println("[4]. delete Supplier by ID");
        			System.out.println("[0]. To exit");
        			System.out.println("Enter your choice ");
        			int n = sc.nextInt();
        			switch(n) {
        			case 1:
        				Supplier s=new Supplier();
        				sc.nextLine();
        				System.out.println("Enter Supplier ID");
        				int supID=sc.nextInt();
        				System.out.println("Enter Name of the Supplier: ");
        				String supName=sc.next();
        				System.out.println("Enter date and time of supply");
        				String supDT=sc.next();
        				
        				s.setSupllierID(supID);
        	            s.setSupplierName(supName);
        	            s.setDateandTimeOfSupply(supDT);
        	            dao.supplierDetails(s);
        	            break;
        			case 2:
        				dao.searchSupplierByID();
        				break;
        			case 3:
        				dao.deleteSupplierByID();
        				break;
        			case 0:
        				System.exit(0);
        				break;
        				
        				default:
        					System.out.println("invalid option");
        			}
    			}
    			else if(option==4) {
    				System.out.println("-- Contact Us --");
    				System.out.println("Loacate us: ");
    				System.out.println("Contact Number: ");
    				System.out.println("Email us: ");
    			}
    			else if(option==0){
    				break;
    			}
    			else
    			{
    				System.out.println("Invalid Choice");
    			}
    		} while (true);
    	}catch (Exception e) {
    		e.printStackTrace();
    	}

    }
}
    
    	