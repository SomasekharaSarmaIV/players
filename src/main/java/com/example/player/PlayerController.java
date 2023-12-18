
package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.example.player.PlayerService;

// Write your code here.

@RestController
public class PlayerController {
   PlayerService ps = new PlayerService();

   @GetMapping("/players")
   public ArrayList<Player> getplayers() {

      return ps.getplayers();
   }

   @PostMapping("/players")
   public Player addPlayer(@RequestBody Player player) {
      return ps.addPlayer(player);
   }

   @DeleteMapping("/players/{playerid}")
   public void deleteplayer(@PathVariable("playerid") int playerid) {
      ps.deleteplayer(playerid);
   }

   @PutMapping("/players/{playerid}")
   public Player updateplayer(@PathVariable("playerid") int playerid, @RequestBody Player player) {
      return ps.updateplayer(playerid, player);
   }

   @GetMapping("/players/{playerid}")
   public Player getplayerbyid(@PathVariable("playerid") int playerid) {
      return ps.getplayerbyid(playerid);
   }

}
