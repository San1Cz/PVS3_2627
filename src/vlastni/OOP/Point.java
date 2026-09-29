package vlastni.OOP;

 class Point {
    String name;
    double x,y,z;
    final double DEFAULT_Z = 0;
    static  int pointsCreated = 1;

     public Point(String name, double x, double y, double z) {
         this(name, x, y);
         this.z = z;
     }

     public Point(String name, double x, double y) {
         this.name = name;
         this.x = x;
         this.y = y;
         this.z = DEFAULT_Z;
     }

     public Point(double x, double y) {
         this.x = x;
         this.y = y;
         z = DEFAULT_Z;
         this.name = "Point# " + pointsCreated;
         pointsCreated++;
     }

     @Override
     public String toString() {
         return "Point{" +
                 "name='" + name + '\'' +
                 ", x=" + x +
                 ", y=" + y +
                 ", z=" + z +
                 '}';
     }
 }
 class Points {
    public static void main(String[] args) {
        Point a = new Point(44.5, 22.5);
        Point b = new Point(44.5, 22.5);
        Point c = new Point(44.5, 22.5);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}


