public class FactoryPatternDemo {
    public static void main(String[] args) {
        try {
            Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
            Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
            Shape square = ShapeFactory.getShape(ShapeType.SQUARE);

            circle.draw();
            rectangle.draw();
            square.draw();


        } catch (ShapeNotFoundException e) {
            e.printStackTrace();
        }


    }
}
