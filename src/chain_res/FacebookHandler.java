package chain_res;

public class FacebookHandler implements Handler {
	
	Handler handler;
	
	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
		
	}
	
	@Override
	public void handleLink(Video video) {
		
		if ( video.getLink().contains("facebook")) {
			
			System.out.println( "i can handle it from facebook" );
		} else { 
			System.out.println("i can't handle it from facebook , iam the last handler");
		}
		
	}

}