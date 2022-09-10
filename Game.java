import java.util.*;
public class Game 
{
    static String board[][]={
        {"AP1","AP2","AP3","AP4","AP5"},
        {"---","---","---","---","---"},
        {"---","---","---","---","---"},
        {"---","---","---","---","---"},
        {"BP1","BP2","BP3","BP4","BP5"}
    };
    static void printBoard()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void Astartsgame(String a)
    {
        if(a.charAt(0)=='D')
        {
            if(a.charAt(2)=='1')
            {
                board[1][0]="AP1";
                board[0][0]="---";
            }
            if(a.charAt(2)=='2')
            {
                board[1][1]="AP2";
                board[0][1]="---";
            }
            if(a.charAt(2)=='3')
            {
                board[1][2]="AP3";
                board[0][2]="---";
            }
            if(a.charAt(2)=='4')
            {
                board[1][3]="AP4";
                board[0][3]="---";
            }
            if(a.charAt(2)=='5')
            {
                board[1][4]="AP5";
                board[0][4]="---";
            }
        }
    }
    static void Bstartsgame(String b)
    {
        if(b.charAt(0)=='U')
        {
            if(b.charAt(2)=='1')
            {
                board[3][0]="BP1";
                board[4][0]="---";
            }
            if(b.charAt(2)=='2')
            {
                board[3][1]="BP2";
                board[4][1]="---";
            }
            if(b.charAt(2)=='3')
            {
                board[3][2]="BP3";
                board[4][2]="---";
            }
            if(b.charAt(2)=='4')
            {
                board[3][3]="BP4";
                board[4][3]="---";
            }
            if(b.charAt(2)=='5')
            {
                board[3][4]="BP5";
                board[4][4]="---";
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a,b;
        System.out.println("Instructions:\n1.You can move a character only Left, Right, Down and Up \n2.To move a character, mention the movement followed by the character to be moved.");
        printBoard();
        System.out.println("Remember that each player will get 5 turns each round, also player A's first move must be D and player B's first move must be U");
        for(int i=0;i<5;i++)
        {
            System.out.println("Player A's turn "+i+1);
            a=sc.nextLine();
            Astartsgame(a);
            printBoard();
            System.out.println("Player B's turn "+i+1);
            b=sc.nextLine();
            Bstartsgame(b);
            printBoard();
        }
        
    }
}
