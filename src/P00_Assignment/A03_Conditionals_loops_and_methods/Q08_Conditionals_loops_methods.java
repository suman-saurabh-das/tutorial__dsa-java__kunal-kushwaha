package P00_Assignment.A03_Conditionals_loops_and_methods;

// 08. Calculate Area Of Circle, Rectangle, Triangle, Isosceles Triangle, Equilateral Triangle, Parallelogram, Rhombus.
// 09. Calculate Perimeter Of Circle, Rectangle, Equilateral Triangle, Parallelogram, Square, Rhombus.
// 10. Calculate Volume Of Cone, Prism, Cylinder, Sphere, Pyramid, Curved Surface Area Of Cylinder, Total Surface Area Of Cube.

public class Q08_Conditionals_loops_methods {
    public static void main(String[] args) {
        double radiusCircle = 10;
        double lengthRectangle = 5, breadthRectangle = 3;
        double baseTriangle = 8, heightTriangle = 6;
        double sideEquilateralTriangle = 4;
        double baseParallelogram = 10, heightParallelogram = 5, sideParallelogram = 3;
        double diagonalA = 4, diagonalB = 6, sideRhombus = 2;
        double sideSquare = 7;
        double radiusCone = 9, heightCone = 6;
        double basePrism = 9, heightPrism = 7;
        double radiusCylinder = 5, heightCylinder = 2;
        double radiusSphere = 3;
        double lengthPyramid = 3, widthPyramid = 4, heightPyramid = 5;
        double sideCube = 4;

        System.out.println("1. Area of a circle : " + Math.PI * radiusCircle * radiusCircle);
        System.out.println("2. Area of a rectangle : " + lengthRectangle * breadthRectangle);
        System.out.println("3. Area of a triangle : " + 0.5 * baseTriangle * heightTriangle);
        System.out.println("4. Area of a isosceles triangle : " + 0.5 * baseTriangle * heightTriangle);
        System.out.println("5. Area of a equilateral triangle : " + (Math.sqrt(3) / 4) * sideEquilateralTriangle * sideEquilateralTriangle * sideEquilateralTriangle);
        System.out.println("6. Area of a parallelogram : " + baseParallelogram * heightParallelogram);
        System.out.println("7. Area of a rhombus : " + 0.5 * diagonalA * diagonalB);
        System.out.println();

        System.out.println("1. Perimeter of a circle : " + 2 * Math.PI * radiusCircle);
        System.out.println("2. Perimeter of a rectangle : " + 2 * (lengthRectangle + breadthRectangle));
        System.out.println("3. Perimeter of a equilateral triangle : " + 3 * sideEquilateralTriangle);
        System.out.println("4. Perimeter of a parallelogram : " + 2 * (baseParallelogram + sideParallelogram));
        System.out.println("5. Perimeter of a square : " + 4 * sideSquare);
        System.out.println("6. Perimeter of a rhombus : " + 4 * sideRhombus);
        System.out.println();

        System.out.println("1. Volume of cone : " + (1 / 3) * Math.PI * radiusCone * radiusCone * heightCone);
        System.out.println("2. Volume of prism : " + 0.5 * basePrism * heightPrism * heightPrism);
        System.out.println("3. Volume of cylinder : " + Math.PI * radiusCylinder * radiusCylinder * heightCylinder);
        System.out.println("4. Volume of sphere : " + (4 / 3) * Math.PI * radiusSphere * radiusSphere * radiusSphere);
        System.out.println("5. Volume of pyramid : " + (lengthPyramid * heightPyramid * widthPyramid) / 3);
        System.out.println("6. CSA of cylinder : " + 2 * Math.PI * radiusCylinder * heightCylinder);
        System.out.println("7. TSA of cube : " + 6 * sideCube * sideCube);
    }
}
