public class Rectangle implements Shape{
    public static int count;
    public Rectangle() {
        count++;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    public void finish() {
        System.out.println("Drawing finished");
    }
}
