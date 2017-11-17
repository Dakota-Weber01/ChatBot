package chat.controller;
import chat.view.ChatFrame;
import chat.view.PopupDisplay;
import chat.model.ChatBot;
public class ChatController
{
{
		ChatBot = new ChatBot(null);
		}	
public void start()	
{
	display.displayText("Welcome to ChatBot");
}
private ChatBot ChatBot;
private PopupDisplay display;
private ChatFrame appFrame;
public String interactWithChatBot(String input)
	{
		String chatbotSays = "";
		if(ChatBot.quitChecker(input))
		{
			close();
		}
		ChatBot.processConversation(input);
		return chatbotSays;
		
		
	}
private void close()
	{
		display.displayText("Goodbye");	
		System.exit(0);
	}
private String popupChat(String chat)
	{
		String ChatBotSays = "";
		ChatBotSays += ChatBot.processConversation(chat);
		return ChatBotSays;
	}
private String quitChecker;
{
	if(ChatBot.quitChecker(input))
	userInput == "close";
	close();
	
}
}
