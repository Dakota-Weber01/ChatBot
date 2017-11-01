package chat.model;

public class ChatBot
{
	private void buildQuestions()	
	{
		
	}
	public String processConversation(String input)
	{	
		
	{
		return null;
	}	

}
	public boolean lengthChecker(String input)
	{
		boolean validLength = false;
		if (input != null && input.length() > 2)
		{
			validLength = true;
		}
		return validLength;
	}
	public boolean htmlTagChecker(String input)
	{
		return false;
	}
	public boolean userNameChecker(String input)
	{
		return false;
	}
	public ChatBot(String username)
	{
		this.movieList = null;
		this.shoppingList = new ArrayList<String>();
		this.cuteAnimalMemes = null;
		this. questions = new String [10];
		this.username = username;
		this.content = null;
		this.intro = null;
		this.currentTime = nul;
		this.topics = new String [7];
		this.verbs = new String [4];
		this.followups = new String [5];
		
		buildVerbs();
		buildTopics();
		buildFollowups();
		buildQuestions();
		buildShoppingList();
	}
}