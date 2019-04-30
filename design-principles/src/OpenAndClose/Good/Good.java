package OpenAndClose.Good;

public class Good {
    Shape c = new Circle();
    Shape r = new Rectangle();
    GraphicEditor g = new GraphicEditor();
    g.drawShape(c);

}

// Open-Close Principle - Good example
class GraphicEditor {
    public void drawShape(Shape s) {
        s.draw();
    }
}

class Shape {
    abstract void draw();
}

class Rectangle extends Shape  {
    public void draw() {
        // draw the rectangle
    }
}


class Circle extends Shape  {
    public void draw() {
        // draw the rectangle
    }
}