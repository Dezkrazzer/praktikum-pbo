// L0125105_Lazuardi Akbar Imani
public class Entitas {
    Vector2 point;
    String nama;
    double radius;

    public Entitas(String nama, double radius, boolean is3D) {
        this.nama = nama;
        this.radius = radius;
        this.point = (is3D) ? new Vector3() : new Vector2();
    }

    // Bikin method buat cek dia nabrak apa enggak
    public boolean isColliding(Entitas e) {
        boolean thisIs3D = point instanceof Vector3;
        boolean otherIs3D = e.point instanceof Vector3;

        if (thisIs3D != otherIs3D) {
            return false;
        }

        double distance = point.distance(e.point);
        return distance <= radius + e.radius;
    }
}