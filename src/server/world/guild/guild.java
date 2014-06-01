package server.model.players.guild;

import java.util.HashMap;


// I will update this once I get the handler ready


public class Guild {
	// Basic Guild Information
	public String Guildname;
	public int GuildID;
	
	public String GuildMessage;
	
	// Guild Members
	
	public HashMap<String, String> GuildMembers = new HashMap<String, String>();

	public int GuildCityID;
	//public GuildCity GuildCityObject;
	//public NPC GuildKng;
	
	
	public Guild(int GuildId, String Guildname) {
		
		this.Guildname = Guildname;
		this.GuildID = GuildId;
		this.GuildMessage = "Please set a message online!";
	}
	
	public HashMap<String, String> getGuildMembers()
	{
		return this.GuildMembers;
	}
	
	// Guild Member Add
	public Boolean IsGuildMember(String username)
	{
		if(getGuildMembers().containsKey(username))
		{
			return true;
		}
		return false;
		
	}
	
	
	
	// Guild Message
	
	public void SetGuildMessage(String message)
	{
		this.GuildMessage = message;
	}
	
	public String getGuildMessage()
	{
		if(this.GuildMessage.isEmpty())
		{
			return "";
		}
		else
		{
			return this.GuildMessage; 
		}
		
	}
	
	// 
}
