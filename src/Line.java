public class Line extends Shape
{
    private int xOne;
    private int yOne;
    private int xTwo;
    private int yTwo;
    private char character;

    Line(int xOne, int yOne, int xTwo, int yTwo, char p){
        this.xOne=xOne;
        this.yOne=yOne;
        this.xTwo=xTwo;
        this.yTwo=yTwo;
        this.character=p;


    }
    @Override
    public void draw(Canvas p){
        p.DLine(xOne, yOne,xTwo,yTwo, character);
    }
}
