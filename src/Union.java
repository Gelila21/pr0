public class Union extends Shape
{
    private Shape shape1;
    private Shape shape2;

    Union(Shape shape1, Shape shape2){
        this.shape1=shape1;
        this.shape2=shape2;

    }
    @Override
    public void draw(Canvas p){
        shape1.draw(p);
        shape2.draw(p);
    }
}
