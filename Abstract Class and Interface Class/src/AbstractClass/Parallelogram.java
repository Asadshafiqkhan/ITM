package AbstractClass;

public class Parallelogram extends Shape {

	double height;
	double base;
	public void SetDetail()
	{
		System.out.println("Name :"+ (this.ShapeName="Parallelogram"));
		System.out.println("height :"+ (this.height=20.5));
		System.out.println("base :"+ (this.base=20.5));
		System.out.println("Area is :"+(this.Area=(height*base)));		 
	}
	
}
