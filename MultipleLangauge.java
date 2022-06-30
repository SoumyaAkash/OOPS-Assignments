package week1.day4;

public abstract class MultipleLangauge implements Language {

	public void python() {
		// TODO Auto-generated method stub
		System.out.println("***********Implemented Language  is Phython**********");	
	}

	public abstract void Ruby() ;
	
		// TODO Auto-generated method stub
	
	public static void main(String[] args) {
		System.out.println("we cann't create Object in Abstract class");
		//MultipleLangauge M =new MultipleLangauge ();
		//M.python();
		//M.Ruby();
		//M.Java();
	}
}
