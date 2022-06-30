package week1.day4;

public class Automation extends MultipleLangauge implements TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation A =new Automation();
		A.python();
		A.Ruby();
		A.Java();
		A.Selenium();

	}
	public void Ruby()
	{
		System.out.println("Unimplemented Language  is  Ruby");
	}
	
	@Override
	public void Java() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Selenium() {
		// TODO Auto-generated method stub
		return;
	}
}
