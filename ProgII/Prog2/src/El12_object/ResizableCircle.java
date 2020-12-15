package El12_object;

public class ResizableCircle extends Circle implements  Resizable{
    public double resizeableCircle(double radius){
        return radius;
    }

    @Override
    public int resize(int percent) {
        return 0;
    }
}
