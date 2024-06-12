package Week3.Assignment;

public class APIClient {
	
	public void sendRequest(String name)
	{
		System.out.println(name);
		
	}
	public void sendRequest(String name, boolean status)
	{
		System.out.println("client name :" + name + " satus of the API call :" +status );
		
	}
	
public static void main(String[] args) {
	
	APIClient client = new APIClient();
	client.sendRequest("hema");

	client.sendRequest("hema", true);
}
}
