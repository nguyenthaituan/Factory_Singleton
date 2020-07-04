
package bt1.pkg1_1.pkg2;

public class ShapeFactory {
    ShapeType shapeType;

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }
     
   public Shape createShape ()
   {
       switch(shapeType)
       {
           case retangle: return new Retangle();
           case triangle: return new Triangle();
           case circle: return new Circle();  
       }
       return null;     
   } 
  
   public static ShapeFactory instance; //luu lai trang thai cuoi cung cua factory
   public static ShapeFactory createInstance() // update trang thai cuoi cung
   {
       if(instance==null)
           instance = new ShapeFactory();
           return instance;
   }
}

