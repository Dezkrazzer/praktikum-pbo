// L0125105_Lazuardi Akbar Imani
public class Vector2 {
    double x;
    double y;

    public Vector2() {
        this.x = this.y = 0;
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Vector2 v) {
        // Ini elemen vektor yang sekarang
        double x1, y1, z1;
        x1 = this.x;
        y1 = this.y;
        z1 = 0;

        if (this instanceof Vector3) {
            z1 = ((Vector3) this).z;
        }

        // Titik ini, kita udah dapet nilai final x,y,z dari objek ini
        double x2, y2, z2;
        x2 = v.x;
        y2 = v.y;
        z2 = 0;

        if (v instanceof Vector3) {
            z2 = ((Vector3) v).z;
        }

        double x3 = Math.pow(x1 - x2, 2);
        double y3 = Math.pow(y1 - y2, 2);
        double z3 = Math.pow(z1 - z2, 2);

        return Math.sqrt(x3 + y3 + z3);
    }
}