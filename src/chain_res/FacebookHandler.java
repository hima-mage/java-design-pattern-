package chain_res;

public class FacebookHandler implements Handler {
	
	Handler handler;
	
	@Override
	public void setNextHandler(Handler handler) {
		handler = handler;
		
	}
	
	@Override
	public void handleLink(Video video) {
		
		if ( video.getLink().contains("youtube")) {
			
			System.out.println( "i can handle it from youtube" );
		} else { 
			System.out.println("i can't handle it from youtube");
		}
		
	}

}