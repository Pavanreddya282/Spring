package com.AarogyaHospital;

public interface DaoInterface {
	public void patientRegistartion(Patient p);
	public void showAllPatients();
	public void searchPatientById();
	public void searchPatientByCity();
	public void searchPatientByAge();
	public void recoveryStatus();
	public void deletePatientById();
	public void medicineDetails(Medicine m);
	public void ShowAllMedicines();
	public void searchMedicineByID();
	public void deleteMedicineByID();
	public void supplierDetails(Supplier s);
	public void showAllSupllier();
	public void searchSupplierByID();
	public void deleteSupplierByID();
}
