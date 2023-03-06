package ie.tudublin;

import processing.core.PApplet;

public class LifeBoard {
    // do this by making a 2d array and it will be boolean

    boolean[][] board;//get a null pointer exception cause nothing is stored in it 

    //square board
    private int size ;
    PApplet p;
    float cellWidth;
    //writing a constructed  that take one parameter

    public boolean getCell(int row , int col )
    {
        if (row >= 0 && row < size && col >= 0 && col < size )
        {
            return board [row][col];
            // this is balance checking 
        }
        else 
        {
            return false;
        }
    }

    public int countCells(int row , int col)
    {
        int count = 0;
        for (int i = -1 ; i <= 1 ; i++)
        {
            for (int j = 0 ; j <= 1 ; j ++ )
            {
                if (! (i == 0) && (j == 0))
                {
                    if (getCell(i, j))
                    {
                        count ++;
                    }
                }
            }
        }
        return count;
    }

    public void applyRules()
    {
        for ( int row = 0; row <size; row ++)
        {
            for (int col = 0; col < size; col ++)
            {
               int count = countCells(row, col);
               if (board[row][col])
               {
                if (count == 2 || count == 3)
                {
                    next[row][col] = true;
                }
                else 
                {
                    next[row][col] = false;
                }
               }
               else 
               {
                 if(count == 3)
                 {
                    next[row][col] = true;
                 }
                 else 
                 {
                    next[row][col] = false;
                 }
               }
               // <2>  3 ciites 
               // 2-3 survies 
               //dead with 3neighbourd come to life 
            }
        }
        boolean[][] temp = board;
        board = next;
        next = temp;
    }

    public LifeBoard(int size, PApplet p)
    {
        this.size = size;
        //allocating the 2d array
        board = new boolean[size][size];
        this.p = p;
        cellWidth = p.width/ (float)size;
    }

    public void randomize()
    {
        for ( int row = 0; row <size; row ++)
        {
            for (int col = 0; col < size; col ++)
            {
                float dice = p.random(0.0f,1.0f); // those float convert to int
                board [row][col] = (dice <= 0.5f);
                //y axis first row , col
            }
        }
    }

    public void render ()
    {
        //nested for loop  
        p.stroke(255);
        for ( int row = 0; row <size; row ++)
        {
            for (int col = 0; col < size; col ++)
            {
                //cal x and y
                float x = col * cellWidth;
                float y = row * cellWidth;

                if (board[row][col])
                {
                    p.fill (0,255,0);
                }
                else
                 {
                    p.noFill();

                }
                p.rect(x, y , cellWidth, cellWidth);


            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}
