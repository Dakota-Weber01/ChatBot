package chat.controller;
import chat.view.ChatFrame;
import chat.view.PopupDisplay;
import chat.model.ChatBot;
public class ChatController
{
public void start()	
{
	String response = display.collectResponse("What do you want to talk about?");
	while (ChatBot.lengthChecker(response) && !ChatBot.quitChecker(response))
	{
		response = popupChat(response);
		response = display.collectResponse(response);
	}
}
private ChatBot ChatBot;
private PopupDisplay display;
private ChatFrame appFrame;
	{
		ChatBot = new ChatBot();
	}
	public String interactWithChatBot(String input)
	private String popupChat(String chat)
	{
		String ChatBotSays = "";
		ChatBotSays += ChatBot.processConversation(chat);
		return ChatBotSays;
	}

}
