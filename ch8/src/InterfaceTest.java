class Shape{
	void print(){
//		System.out.println(getClass(),getName());
	}
}
class Circle extends Shape
implements Drawable{
	int r;
	Circle(int r){
		this.r = r;
	}
	public void draw(){
		System.out.println("원을 그립니다");
		
	}
	public void move(int x, int y){
		System.out.println
		("x좌표 = " + x + " y좌표 = " + y + "로 이동합니다");
	}
}

class Rectangle extends Shape
implements Drawable{
	int width, height;
	Rectangle (int width, int height){
		this.width = width;
		this.height = height;
	}
	public void draw(){
		System.out.println
		("가로 = " + width + "세로=" + height + "한 사각형을 그립니다.");	
	}
	public void move(int x, int y){
		System.out.println("사각형을 시작좌표 x = " + x + " y = " + y + "로 이동합니다");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		Rectangle r = new Rectangle(6,8);
		c.draw();
		r.draw();
		c.move(10,20);
		r.move(100,200);

	}

}
