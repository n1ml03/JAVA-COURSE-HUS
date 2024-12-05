package point;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] XYZ = new float[3];
        XYZ[0] = this.getX();
        XYZ[1] = this.getY();
        XYZ[2] = this.z;

        return XYZ;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + "," + z + ")";
    }
}
