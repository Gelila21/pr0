import java.lang.Math;
public class Canvas
{
    private  int Columns = 40;
    private   int Rows = 25;
    private  char[][] canvas = new char [Rows][Columns];

    Canvas (){
        for (int row =0 ; row< Rows ; row++){
            for(int column =0; column < Columns; column++){
                canvas[row][column] =' ';
            }
        }
    }
    public void erase(){
        for(int column = 0; column<Columns; column++){
            for(int row =0; row< Rows;row++){
                canvas[row][column]= ' ';
            }
        }
    }
    public void CanvasDrawer(){
        for(int row =0 ; row < Rows; row++){
            for(int column =0; column< Columns; column++){
                System.out.print(canvas[row][column]);
            }
            System.out.println(" ");
        }
    }
    public void DLine(int a, int b, int c, int d, char p){
       //char p = ' ';
        if(a-b ==0 && c-d ==0){
            canvas[c][a]= p;
        }
        else if (a -b ==0){
            while (c!=d){
                canvas[c][a]= p ;

                if(c <d){
                    c++;
                }
                else if (c> d){
                    c--;
                }
                canvas [d][b] =p;
            }
        }
      //  else if (c-d ==0){
       //     while (a!= b){
            //    canvas[c][a] =p;

        //        if(a<b){
           //         a++;
          //      }
           //     else if (a>b){
          //          a--;

         //       }
         //       canvas[d][b] =p;

         //   }
     //   }
        else if(c-d==0){
            while (a!=b){
                canvas[c][a]=p;

                if(a<b){
                    a++;
                }
                else if (a>b){
                    a--;
                }
            }
            canvas[d][b]=p;
        }
        else {
            double slope = (double)(d-c)/(b-a);
            int X= a;
            int Y=c;

            while(X!=Y){
                canvas[Y][X]=p;
                if (b>a)
                    X++;
                else
                    X--;
                Y = ((int)Math.round(((slope*X)-(slope*b)+ d )));

            }
            canvas[d][b]=p;
        }
    }
}
