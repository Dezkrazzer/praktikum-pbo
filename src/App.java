// L0125105_Lazuardi Akbar Imani
public class App {
     public static void main(String[] args) throws Exception {
        Vector2 fatisda = new Vector2(-7.558592134562593, 110.85800061735068);
        Vector2 momoyoAlfian = new Vector2(-7.563187731028337, 110.85171212613771);

        System.out.println(fatisda.distance(momoyoAlfian));

        Vector3 boeing737 = new Vector3(-7.902901940481244, 110.05601267573857, 0);
        Vector3 boeing787 = new Vector3(-7.910458880495463, 110.07132548599691, 0.001);
        System.out.println(boeing737.distance(boeing787));

        // Cek tabrakan
        Entitas entitasA = new Entitas("Mas Rusdi", 2, false);
        Entitas entitasB = new Entitas("Mas Gatot", 2, false);
        entitasA.point = new Vector2(0, 0);
        entitasB.point = new Vector2(3, 0);
        System.out.println("Bertabrakan? " + entitasA.isColliding(entitasB));

        // Cek ga nabrak
        Entitas entitasC = new Entitas("Ambatukam", 1, false);
        Entitas entitasD = new Entitas("Ambatron", 1, false);
        entitasC.point = new Vector2(0, 0);
        entitasD.point = new Vector2(5, 0);
        System.out.println("Bertabrakan? " + entitasC.isColliding(entitasD));
    }
}