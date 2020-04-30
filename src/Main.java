import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner input = new  Scanner(System.in);
	public static Doctor doctor = new Doctor();
	public static Time time = new Time();
	public static ArrayList<Doctor> list;
	
	public static void main(String[] args) {
		System.out.println("\n\n\t\t   !!!!Welcome to JU Medical (Doctor) Schedule!!!!\n");
		
		int option;
		do {
			System.out.println("\n\n\t\t-----===================================-----\n");
			System.out.println("\t\t    Press < 1 > :: For Doctor's Schedule         ");
			System.out.println("\t\t    Press < 2 > :: For Doctor's List             ");
			System.out.println("\t\t    Press < 3 > :: For Doctor's Appointment      ");
			System.out.println("\t\t    Press < 4 > :: For To Close The Programm     ");
			System.out.println("\n\t\t-----===================================-----");

			System.out.print("\n\t\t [ CHOICE ]   ---> ");
			option = input.nextInt();
			
			
			
			if (option == 1) {
				time.getTime();
				int hour = time.getHour();
				list = doctor.doctorList();
				
				if(hour >= 0 && hour <= 5) {
			        for(int i = 0; i < 5; i++) {
			        	System.out.println("\t\t   "+ list.get(i));
			        }
			     } else if(hour >= 6 && hour <= 11) {
			        for(int i = 5; i < 10; i++) {
			        	System.out.println("\t\t   "+ list.get(i));
			        }
			     } else if(hour >= 12 && hour <= 17) {
			        for(int i = 10; i < 15; i++) {
			        	System.out.println("\t\t   "+ list.get(i));
			        }
			     } else if(hour >= 18 && hour <= 23) {
			        for(int i=15; i<20; i++) {
			        	System.out.println("\t\t   "+ list.get(i));
			        }
			     }
			} else if (option == 2) {
				getDoctorList(doctor);
			} else if (option == 3) {
				getDoctorList(doctor);
				System.out.println("\nDo You Want to Appoint Any Doctor ? if yes then press 'y' else 'n'");
				
				char choice = input.next().charAt(0);
				if (choice == 'y') {
					System.out.println("Enter Doctor Id : ");
					int id = input.nextInt();
					Doctor doctor = new Doctor();
					System.out.println("Appointed\n"+ doctor.doctorList().get(id-1).getDoctorName()
							+ "\t" + doctor.doctorList().get(id-1).getDoctortype());
				}
			} else if (option == 4) {
				System.out.println("\n\n\t\tEnd the program\n\n");
			} else {
				System.out.println("\n\n\t\t wrong keyword");
			}
			
		} while (option != 4);
	}

	
	
	
	public static void getDoctorList(Doctor sampleDoctor) {
		Doctor doctor = sampleDoctor;
		list = doctor.doctorList();
		
		System.out.println("\n\n\t\tAvailable Doctor List : \n\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	
	
}
