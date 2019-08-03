package project1;

public class TestTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LgOldTv remote=new LgOldTv();
		remote.start();
		remote.increaseVolume();
		remote.changeChannel();
		
		LgSmartTv sremote=new LgSmartTv();
		sremote.start();
		sremote.increaseVolume();
		sremote.changeChannel();
		sremote.playGame();
		
		LgOldTv rem=new LgSmartTv();
		rem.start();
		rem.increaseVolume();
		rem.changeChannel();
		
		LgSmartTv nrem=(LgSmartTv)rem;
		nrem.playGame();
		

	}

}
