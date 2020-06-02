package chain_res;

public class InstagramHandler  implements Handler {
	
	Handler handler;
	
	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler; 
	} 
	
	
	@Override
	public void handleLink(Video video) {
		
		if ( video.getLink().contains("instagram")) {
			
			System.out.println( "i can handle it from instagram" );
		} else { 
			System.out.println("i can't handle it from instagram");
			handler.handleLink(video);
		}
		
	}

}
