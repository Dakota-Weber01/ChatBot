package chat.view;


import javax.swing.JFrame;
import chat.controller.ChatController;

public class ChatFrame extends JFrame
{
	private ChatPanel appPane;
	private ChatController appController;
	/**
	 * Declaring controller as appController 
	 * @param appController
	 */
	public ChatFrame(ChatController appController)
	{
		super();
		this.appController = appController;
		appPane = new ChatPanel(appController);
		setupFrame();
	}
	/** Setup Frame
	 * Sets properties and size of the GUI frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(appPane);
		this.setTitle("Chatting with the chatbot");
		this.setSize(600, 600);
		this.setVisible(true);
		this.setResizable(false);
	}
}
