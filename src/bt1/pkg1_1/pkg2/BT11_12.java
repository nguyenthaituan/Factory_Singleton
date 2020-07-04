
package bt1.pkg1_1.pkg2;

public class BT11_12 {

    public static void main(String[] args) {
      ShapeFactory sf1 = ShapeFactory.createInstance();
      ShapeFactory sf2 = ShapeFactory.createInstance();
      ShapeFactory sf3 = ShapeFactory.createInstance();
      
      sf1.setShapeType(ShapeType.circle);
      sf2.setShapeType(ShapeType.retangle);
      sf3.setShapeType(ShapeType.triangle);
      
      Shape hinh1 = sf1.createShape();
      
      Shape hinh2 = sf2.createShape();
      
      Shape hinh3 = sf3.createShape();

    }
    
}
