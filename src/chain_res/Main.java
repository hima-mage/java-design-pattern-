package chain_res;

public class Main {
	
	
	public static void main(String[] args) { 
		
		String Link  = "https://www.instagram.com/watch?v=IKRVX3c8HuU"; 
		
		Handler handler1 = new YoutubeHandler();
		Handler handler2 = new InstagramHandler();
		Handler handler3 = new FacebookHandler();
		
		
		
		Video video = new Video();
		video.setLink(Link);
		
		
		handler1.setNextHandler(handler2);
		handler2.setNextHandler(handler3);
		
		handler1.handleLink(video);
		
		
	}
}
