import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
	
	// -------------------------- Data Field ----------------------------
	private int doctorSerial;
	private String doctorName;
	private String doctortype;
	private ArrayList<Doctor> list;
	
	
	
	
	
	// -------------------------- Constructors -------------------------------
	public Doctor() {
		
	}
	public Doctor(int doctorSerial, String doctorName, String doctortype) {
		this.doctorSerial = doctorSerial;
		this.doctorName = doctorName;
		this.doctortype = doctortype;
	}
	
	
	
	
	
	
	// ------------------ Getter & Setter Methods -------------------
	public int getDoctorSerial() {
		return doctorSerial;
	}
	public void setDoctorSerial(int doctorSerial) {
		this.doctorSerial = doctorSerial;
	}
	
	
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	
	public String getDoctortype() {
		return doctortype;
	}
	public void setDoctortype(String doctortype) {
		this.doctortype = doctortype;
	}
	
	
	public ArrayList<Doctor> getList() {
		return list;
	}
	public void setList(ArrayList<Doctor> list) {
		this.list = list;
	}
	
	
	
	
	// --------------------------------- toString() ------------------------
	@Override
	public String toString() {
		return doctorSerial + " : " + doctorName + "\t" + doctortype;
	}
	
	
	
	
	
	
	
	// ------------------ Necessary Method -------------------
	
	public ArrayList<Doctor> doctorList() {
		
		list = new ArrayList<>();
		File fileToRead = new File("input.txt");
		
		try {
			Scanner readFromFile = new Scanner(fileToRead);
			
			while (readFromFile.hasNext()) {
				String string = (String) readFromFile.nextLine();
				
				String[] fullDescriptionOfDoctor = string.split("\\{");
				String nameWithSerial = fullDescriptionOfDoctor[0];
				String type = fullDescriptionOfDoctor[1];
				
				String[] aString = nameWithSerial.split("\\-");
				String serial = aString[0];
				int serialCode = Integer.parseInt(serial);
				String name = aString[1];
				
				Doctor doctorInformation = new Doctor(serialCode, name, type);
				list.add(doctorInformation);
				
			}
			readFromFile.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("File not Found :(");
		}
		
		return list;
	}
	
	
}
