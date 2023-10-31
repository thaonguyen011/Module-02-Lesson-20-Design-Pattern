public class ShapeFactory {
    private static Shape shape;

    private ShapeFactory() {

    }

    public static Shape getShape(ShapeType shapeType) throws ShapeNotFoundException {
        switch (shapeType) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                shape = new Rectangle();
                break;
            default:
                throw new ShapeNotFoundException();
        }
        return shape;
    }
}
