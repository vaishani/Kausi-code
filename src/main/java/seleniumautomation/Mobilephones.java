package seleniumautomation;

public class Mobilephones {

	public static Mobilephones mobile = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int sp=Integer.parseInt(args[0]);
		 
		 switch(sp) {
		 case 1:
			 mobile = (Mobilephones) new Apple();
			 break;
		 case 2:
			 mobile = (Mobilephones) new Motorola();
			 break;
		 case 3:
			 mobile = (Mobilephones) new Samsung();
			 break;
	     default:
	    	 mobile = new Mobilephones();
		 }
		 
			
		 mobile.browse();
		String gamename =  mobile.playGame();
		mobile.storage(gamename);
		 
	}

	public String playGame() {
		
		System.out.println("Playing Games");
		return "subwaysurf";
	}

	public void storage(String str) {
		System.out.println("Memory storage\n"+ str);
	}

	public void rejectCall() {
		System.out.println("Call Rejected");
	}

	public void listenSong() {
		System.out.println("Listen songs");
	}

	public void makeCall() {
		System.out.println("Attend Call");
	}

	public void sendSms() {
		System.out.println("Send SMS");
	}

	public void browse() {
		System.out.println("Browsing");
	}

	public void takePhoto() {
		System.out.println("Photo click");
	}

	public void videoRecord() {
		System.out.println("Record Video");
	}

	public void videoPlayer() {
		System.out.println("Play Videos");
	}

	public void watchMovies() {
		System.out.println("Watching movie");
	}
}
