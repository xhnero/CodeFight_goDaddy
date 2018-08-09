import java.util.List;

import com.interview.goDaddy.GoDaddyBot;
import com.interview.graph.GraphImplementation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] redirects = {{"godaddy.net", "godaddy.com"},{"godaddy.org", "godaddycares.com"},{"godady.com", "godaddy.com"},{"godaddy.ne", "godaddy.net"}};
		GoDaddyBot go = new GoDaddyBot();
		String [][] output = go.domainForwarding(redirects);
		System.out.println("Done");
	}

}
