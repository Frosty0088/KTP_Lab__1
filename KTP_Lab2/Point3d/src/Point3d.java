public class Point3d extends Point2d {
    private double zCoord;
    public Point3d(double x, double y, double z){
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    public Point3d(){
        this(0,0,0);
    }

    public double getZ(){
        return zCoord;
    }

    public void setZ(double val){
        zCoord = val;
    }
    public boolean equals(Point3d another) {
        return xCoord == another.xCoord && yCoord == another.yCoord && zCoord == another.zCoord;
    }
    public double distanceTo(Point3d another) {
        double dist = Math.sqrt(Math.pow(another.getX()-getX(), 2) + Math.pow(another.getY()-getY(), 2) + Math.pow(another.getZ()-getZ(), 2));
        String str = String.format(java.util.Locale.ROOT, "%.2f", dist);
        return Double.parseDouble(str);
    }

}
