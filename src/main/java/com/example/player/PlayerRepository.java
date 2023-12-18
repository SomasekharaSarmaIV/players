// Write your code here
package com.example.player;

import java.util.*;

public interface PlayerRepository {
    ArrayList<Player> getplayers();

    Player addPlayer(Player Player);

    void deleteplayer(int playerid);

    Player updateplayer(int playerid, Player player);

    Player getplayerbyid(int playerid);

}