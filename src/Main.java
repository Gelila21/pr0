import java.util.Scanner;
class Main
{ public static void main(String[] args)
    {
        Shape Nshape = null;
        Canvas DCanvas = new Canvas();
        Shape[] Holder = new Shape[26];
        int pick = 0;
        do
        {
            if (Nshape != null)
            {
                System.out.println(" ");
            } else
            {
                System.out.println("No drawings available!!" );
            }
            System.out.println("Pick one of the following");
            System.out.println("1. Show the whole Picture");
            System.out.println("2. Draw Point");
            System.out.println("3. Draw Line");
            System.out.println("4. Draw Triangle");
            System.out.println("5. Draw Rectangle ");
            System.out.println("6. Save");
            System.out.println("7. Take out the picture from the Holder");
            System.out.println("8. Exit");

            Scanner input = new Scanner(System.in);
            pick = input.nextInt();
            switch (pick) {
                case 1:
                    if (Nshape == null)
                    {
                        System.out.println("No shapes to draw");
                    } else
                    {
                        DCanvas.CanvasDrawer();
                    }
                    break;
                    case 2:

                    if (Nshape == null)
                    {
                        Nshape = pointInput();
                    } else
                    {
                        Nshape = new Union(Nshape, pointInput());
                    }
                    Nshape.draw(DCanvas);
                    System.out.println("Point Added");
                    break;
                case 3:
                    if (Nshape == null)
                    {
                        Nshape = LineInput();
                    } else
                    {
                        Nshape = new Union(Nshape, LineInput());
                    }
                    Nshape.draw(DCanvas);
                    System.out.println("Line Added");
                    break;
                    case 4:

                    if (Nshape == null)
                    {
                        Nshape = TriangleInput();
                    } else
                    {
                        Nshape = new Union(Nshape, TriangleInput());
                    }
                    Nshape.draw(DCanvas);
                    System.out.println("Triangle Added");
                    break;
                case 5:

                    if (Nshape == null)
                    {
                        Nshape = RectangleInput();
                    } else
                    {
                        Nshape = new Union(Nshape, RectangleInput());
                    }
                    Nshape.draw(DCanvas);
                    System.out.println("Rectangle Added");
                    break;

                case 6:

                    putShapeInHolder(Holder, Nshape);
                    break;
                case 7:

                    Shape TShape = exportShape(Holder);
                    if (TShape != null)
                    {
                        if (Nshape != null)
                        {
                            Nshape = new Union(Nshape, TShape);
                        } else
                        {
                            Nshape = TShape;
                        }
                        Nshape.draw(DCanvas);
                        System.out.println("Shape added");
                    }
                    break;

                case 8:

                {
                    System.out.println("Exited!");
                }

                System.out.println("Invalid: PICK AGAIN!");
                break;
            }

        } while (pick != 0);
    }
    public static char TLetter (String s){

        if (s.length() != 1 || !Character.isLetter(s.charAt(0)))
        {
            throw new IllegalArgumentException("Not a letter!");
        }
        return s.toLowerCase().charAt(0);
    }
    public static Point pointInput()
    {
        char p = ' ';
        Scanner input = new Scanner(System.in);
        System.out.println("enter coordinates for the point");
        int xOne = input.nextInt();
        int yOne = input.nextInt();
        if (xOne < 0 || yOne < 0 || xOne > 40 || yOne > 25)
        {
            throw new IllegalArgumentException("Can't draw outside canvas");
        }
        p ='#';
        return new Point(xOne, yOne, p);
    }

    public static Line LineInput()
    {
        char p = ' ';
        Scanner input = new Scanner(System.in);
        System.out.println("enter coordinates for the first point");
        int xOne = input.nextInt();
        int yOne = input.nextInt();

        if (xOne < 0 || yOne < 0 || xOne > 40 || yOne > 25)
        {
            throw new IllegalArgumentException("Can't draw outside canvas");
        }
        System.out.println("enter coordinates for the second point");
        int xTwo = input.nextInt();
        int yTwo = input.nextInt();
        if (xTwo < 0 || yTwo < 0 || xTwo > 40 || yTwo > 25)
        {
            throw new IllegalArgumentException("Can't draw outside canvas");
        }
        p = '#';
        return new Line(xOne, yOne, xTwo, yTwo, p);
    }

    public static Triangle TriangleInput()
    {
        char p = ' ';
        Scanner input = new Scanner(System.in);
        System.out.println("enter coordinates for the first point");
        int xOne = input.nextInt();
        int yOne = input.nextInt();

        if (xOne < 0 || yOne < 0 || xOne > 40 || yOne > 25)
        {
            throw new IllegalArgumentException("Can't draw outside canvas");
        }
        System.out.println("enter coordinates for the second point");
        int xTwo = input.nextInt();
        int yTwo = input.nextInt();
        if (xTwo < 0 || yTwo < 0 || xTwo > 40 || yTwo > 25)
        {
            throw new IllegalArgumentException("Can't draw outside canvas");
        }
        System.out.println("enter coordinates for the third point");
        int xThree = input.nextInt();
        int yThree = input.nextInt();
        if (xThree < 0 || yThree < 0 || xThree > 40 || yThree > 25)
        {
            throw new IllegalArgumentException("Can't draw outside canvas");
        }
        p = '#' ;
        return new Triangle(p, xOne, yOne, xTwo, yTwo, xThree, yThree);
    }

    public static Rectangle RectangleInput()
    {
        char p = ' ';
        Scanner input = new Scanner(System.in);
        System.out.println("enter coordinates for the first point");
        int xOne = input.nextInt();
        int yOne = input.nextInt();

        if (xOne < 0 || yOne < 0 || xOne > 40 || yOne > 25)
        {
            throw new IllegalArgumentException("Can't draw outside canvas");
        }
        System.out.println("enter coordinates for the second point");
        int xTwo = input.nextInt();
        int yTwo = input.nextInt();
        if (xTwo < 0 || yTwo < 0 || xTwo > 40 || yTwo > 25)
        {
            throw new IllegalArgumentException("Can't draw outside canvas");
        }
        System.out.println("enter coordinates for the third point");
        int xThree = input.nextInt();
        int yThree = input.nextInt();
        if (xThree < 0 || yThree < 0 || xThree > 40 || yThree > 25)
        {
            throw new IllegalArgumentException("Can't draw outside canvas");
        }
        System.out.println("enter coordinates for the fourth point");
        int xFour = input.nextInt();
        int yFour = input.nextInt();
        if (xFour < 0 || yFour < 0 || xFour > 40 || yFour > 25)
        {
            throw new IllegalArgumentException("Can't draw outside canvas");
        }
        p = '#';

        return new Rectangle(p, xOne, yOne, xTwo, yTwo, xThree, yThree, xFour, yFour);
    }

    public static void putShapeInHolder(Shape[] s, Shape ShapeAdd)
    {
        Scanner input = new Scanner(System.in);
        char Choice = ' ';
        if (ShapeAdd == null)
        {
            System.out.println("Nothing to save!");
        } else
        {
            while (!Character.isLetter(Choice))
            {
                System.out.println("choose a letter in which to save the drawing in");
                if (s[Choice] != null)
                {
                    char OChar = ' ';
                    System.out.println("we have a shape for this letter");
                    do
                    {
                        System.out.print("WANNA Override it ?");
                        OChar = TLetter(input.nextLine());
                        if (OChar != 'y' && OChar != 'n')
                        {
                            System.out.println("Invalid option");
                        }
                    } while (OChar != 'y' && OChar != 'n');

                    if (OChar == 'y')
                    {
                        s[Choice] = ShapeAdd;
                        System.out.println("Shape saved inside Holder");
                    } else
                    {
                        System.out.println("No shape saved");
                    }
                } else
                {
                    s[Choice] = ShapeAdd;
                    System.out.println("Shape saved inside Holder");
                }
            }
        }
    }
    public static Shape exportShape (Shape[]s){
        Scanner input = new Scanner(System.in);
        char Choice = ' ';
        boolean F = true;
        do
        {
            System.out.println("Pick letter of shape to use");
            Choice = TLetter(input.nextLine());
            F = false;

            if (s[Choice] == null)
            {
                System.out.println("No shape in here");
            } else
            {
                return s[Choice];
            }
        } while (F);

        return null;
    }

}