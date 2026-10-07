
public class MainDriver {

	public static void main(String[] args) {

        Doctor d = new Doctor(1, "Dr. Smith", 45, "Cardiology", 150.0);
        Nurse n = new Nurse(2, "Nurse Amy", 30, "ER", "Night");
        Surgeon s = new Surgeon(3, "Dr. Brown", 50, "Orthopedics", 200.0, "Knee Replacement", "OR-5");
        EmergencyDoctor e = new EmergencyDoctor(4, "Dr. Lee", 38, "Emergency Medicine", 180.0);

        System.out.println("\n--- Doctor ---");
        d.performDuties();
        d.diagnosePatient();

        System.out.println("\n--- Nurse ---");
        n.performDuties();
        n.assistPatient();

        System.out.println("\n--- Surgeon ---");
        s.performDuties();
        s.performSurgery();

        System.out.println("\n--- Emergency Doctor ---");
        e.performDuties();
        e.handleEmergency();
        e.prescribeMedication();
        e.generateBill();

        System.out.println("\n--- Polymorphism Demo ---");
        Person person;

        person = d;
        person.performDuties();

        person = n;
        person.performDuties();

        person = s;
        person.performDuties();

        person = e;
        person.performDuties();
    }
}
