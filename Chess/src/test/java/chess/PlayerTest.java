package chess;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PlayerTest
{

    @Test
    public void testFetch_players()
    {
        //Method reads from file

        List<Player> expected = new ArrayList<Player>();

        expected.add(new Player("aaa"));
        expected.add(new Player("aa"));
        expected.add(new Player("a"));
        expected.add(new Player("b"));

        List<Player> actual = Player.fetch_players();
        for (int i = 0; i < 4; i++)
        {
        Assert.assertEquals(expected.get(i).name(), actual.get(i).name());
        }
    }

    @Test
    public void testWinpercent()
    {
        Player player = new Player("player");
        player.updateGamesPlayed();
        player.updateGamesPlayed();
        player.updateGamesPlayed();
        player.updateGamesWon();

        Assert.assertEquals((Integer) 33, player.winpercent());

    }
}