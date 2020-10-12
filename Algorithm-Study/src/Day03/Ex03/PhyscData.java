package Day03.Ex03;


public class PhyscData {
	
	String name; //이름
	int height; //키
	double eye; //시력
	
	public PhyscData(String name, int height, double eye) {
		super();
		this.name = name;
		this.height = height;
		this.eye = eye;
	}
	
	@Override
	public String toString() {
		return "PhyscData [name=" + name + ", height=" + height + ", eye=" + eye + "]";
	}
	
}



