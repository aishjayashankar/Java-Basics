package project1;

public class Song {
	
	String title;
	String artist;
	public Song(String title, String artist){
		this.title=title;
		this.artist=artist;
	}
	
	public void play(){
		System.out.println(artist+" is playing "+title);
	}
	
	public static void main(String[] args){
		
		Song track=new Song("Hello","Adele");
		track.play();
		
	}

}
