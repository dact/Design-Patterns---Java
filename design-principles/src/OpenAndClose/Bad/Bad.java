package OpenAndClose.Bad;

public class Bad {
}

// Open-Close Principle - Bad example

/**
 * El mal ejemplo aqui es debido que graphic editor esta acoplado y cerrado a la modificacion, si se creara
 * una nueva figura tocaria modificarse
 */
class GraphicEditor {

    public void drawShape(Shape s) {
        if (s.m_type==1)
            drawRectangle(s);
        else if (s.m_type==2)
            drawCircle(s);
    }
    public void drawCircle(Circle r) {}
    public void drawRectangle(Rectangle r) {}
}

class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type=1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type=2;
    }
}
