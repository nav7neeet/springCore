package com.rcb.injection;

public class CricketTeam implements Team
{
	public Players players;
	
	public void setPlayers(Players players) {
		this.players = players;
	}

	@Override
	public void selectPlayers() 
	{
		System.out.println(players.getPlayer1());
		System.out.println(players.getPlayer2());
	}

}
