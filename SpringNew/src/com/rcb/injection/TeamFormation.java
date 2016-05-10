package com.rcb.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeamFormation
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("team.xml");
		
		CricketTeam cricketTeam=(CricketTeam) context.getBean("cricTeam");
		cricketTeam.selectPlayers();
	}

}
