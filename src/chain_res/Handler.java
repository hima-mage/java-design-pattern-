package chain_res;

public interface Handler {
	
	void setNextHandler(Handler handler);
	
	void handleLink(Video video);
}
