// Write your code here.
package com.example.player;

public class Player {
    private int playerid;
    private String playername;
    private int playerno;
    private String playerrole;

    public Player(int playerid, String playername, int playerno, String playerrole) {
        this.playerid = playerid;
        this.playername = playername;
        this.playerno = playerno;
        this.playerrole = playerrole;

    }

    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;

    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;

    }

    public int getPlayerno() {
        return playerno;
    }

    public void setPlayerno(int playerno) {
        this.playerno = playerno;

    }

    public String getPlayerrole() {
        return playerrole;
    }

    public void setPlayerrole(String playerrole) {
        this.playerrole = playerrole;
    }

}
