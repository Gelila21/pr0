public class Point extends Shape
{
    private char character;
    private int xOne;
    private int yOne;

    Point(int xOne, int yOne, char p){
        this.xOne=xOne;
        this.yOne = yOne;
        this.character = p;
    }
    @Override
    public void draw(Canvas p){
        p.DLine(xOne,yOne,xOne,yOne, character);
    }
}
