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
		System.out.println("���� �׸��ϴ�");
		
	}
	public void move(int x, int y){
		System.out.println
		("x��ǥ = " + x + " y��ǥ = " + y + "�� �̵��մϴ�");
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
		("���� = " + width + "����=" + height + "�� �簢���� �׸��ϴ�.");	
	}
	public void move(int x, int y){
		System.out.println("�簢���� ������ǥ x = " + x + " y = " + y + "�� �̵��մϴ�");
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
