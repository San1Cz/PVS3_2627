package vlastni.OOP.inheritance;

public class Hospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Jeff");
        doctor.Diagnosis();
        System.out.println(doctor.salary);
        Surgeon surgeon = new Surgeon("Pepa");
        surgeon.Surgery();
        surgeon.Diagnosis();
        CardiacSurgeon cs = new CardiacSurgeon("Max");


    }


}
