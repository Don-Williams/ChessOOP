package pieces;

import chess.Cell;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class KingTest
{

    @Test
    public void testIsindanger()
    {
        Cell[][] boardState = new Cell[8][8];
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                boardState[i][j] = new Cell(i, j, null);
            }
        }
        King king0 = new King("WK01", "White_King.png", 0, 2, 2);
        Rook rook1 = new Rook("BR02", "Black_Rook.png", 1);
        boardState[2][2] = new Cell(2, 2, king0);
        boardState[7][2] = new Cell(7, 2, rook1);
        Assert.assertTrue(king0.isindanger(boardState));
    }
}