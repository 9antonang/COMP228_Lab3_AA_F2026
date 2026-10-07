
public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {

    public EmergencyDoctor(int personId, String name, int age, String specialization, double consultationFee) {
        super(personId, name, age, specialization, consultationFee);
    }

    public void handleEmergency() {
        System.out.println(getName() + " is handling an emergency case!");
    }

    @Override
    public void prescribeMedication() {
        System.out.println(getName() + " is prescribing emergency medication.");
    }

    @Override
    public void generateBill() {
        System.out.println(getName() + " generated an emergency treatment bill.");
    }

    @Override
    public void performDuties() {
        System.out.println(getName() + " is performing emergency doctor duties.");
    }
}
