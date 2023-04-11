package com.AarogyaHospital;

public class Medicine {
	
	int MedicineID,Quantity;
	String MedicineName,ManufactureDate,ExpiryDate;
	int UnitPrice;
	
	public int getMedicineID() {
		return MedicineID;
	}
	public void setMedicineID(int medicineID) {
		MedicineID = medicineID;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getMedicineName() {
		return MedicineName;
	}
	public void setMedicineName(String medicineName) {
		MedicineName = medicineName;
	}
	public String getManufactureDate() {
		return ManufactureDate;
	}
	public void setManufactureDate(String manufactureDate) {
		ManufactureDate = manufactureDate;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}
	public int getUnitPrice() {
		return UnitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		UnitPrice = unitPrice;
	}
}
