package codeflow;

public class FindFemFejl {

    public static void main(String[] args) {
        codeflow.Cinema biogrande = new codeflow.Cinema(20, 10);

        // Reserver række 1, sæde 5
        System.out.println("Række 1, sæde 5 er reserveret: " + biogrande.reserve(1, 5));



        // Reserver det sidste sæde i den sidste række
        int numberOfRows = biogrande.getRows();
        System.out.println(biogrande.getRows());
        int numberOfSeats = biogrande.getSeats();
        biogrande.reserve(0, 5);

        // Afbestil reservation på række 1, sæde 5
        System.out.println("Række 1, sæde 5 er afbestilt: ");
        biogrande.cancelReservation(1,5);


        System.out.println(biogrande);
    }
}