public class Triangle extends Shape
{
    private char character;
    private int xOne;
    private int yOne;
    private int xTwo;
    private int yTwo;
    private int yThree;
    private int xThree;

    Triangle(char p, int xOne, int yOne, int xTwo, int yTwo, int xThree, int yThree){
        this.xOne=xOne;
        this.yOne=yOne;
        this.xTwo=xTwo;
        this.yTwo=yTwo;
        this.xThree=xThree;
        this.yThree=yThree;
        this.character=p;
    }
    @Override
    public void draw(Canvas p){
        p.DLine(xOne,yOne,xTwo,yTwo, character);
        p.DLine(xTwo,yTwo,xThree,yThree, character);
        p.DLine(xThree,yThree,xOne,yOne, character);

    }
}
