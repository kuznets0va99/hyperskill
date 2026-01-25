class Shape {
    public double area() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    // override the method here
    @Override
    public double area(){
        double area = base * height / 2;
        return area;
    }
}

class Circle extends Shape {
    double radius;

    // override the method here
    @Override
    public double area(){
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

class Square extends Shape {
    double side;

    // override the method here
    @Override
    public double area(){
        double area = Math.pow(side, 2);
        return area;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    // override the method here
    @Override
    public double area(){
        double area = width * height;
        return area;
    }
}