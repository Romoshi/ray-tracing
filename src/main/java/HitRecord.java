public class HitRecord {
    Vec3 p;
    Vec3 normal;
    double t;
    boolean frontFace;

    public void setFaceNormal(Ray r, Vec3 outwardNormal) {
        frontFace = r.direction().dot(outwardNormal) < 0;
        normal = frontFace ? outwardNormal : outwardNormal.mul(-1);
    }

    public void set(HitRecord hr) {
        t = hr.t;
        p = hr.p;
        normal = hr.normal;
    }
}
