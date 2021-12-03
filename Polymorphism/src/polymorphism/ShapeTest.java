package polymorphism;
import java.util.ArrayList;
import java.util.Collections;
public class ShapeTest {

	public static void main(String[] args) {
		ArrayList<Circle> arr = new ArrayList<>();
		Circle c1 = new Circle(0,1,2);
		Circle c2 = new Circle(3,2,4);
		Circle c3 = new Circle(4,5,1);
		arr.add(c1);
		arr.add(c2);
		arr.add(c3);
		Collections.sort(arr);
		System.out.println(arr);
		ArrayList<Rectangle> arr2 = new ArrayList<>();
		Rectangle r1 = new Rectangle(5,10,20,3);
		Rectangle r2 = new Rectangle(4,8,5,2);
		Rectangle r3 = new Rectangle(6,9,8,10);
		arr2.add(r1);
		arr2.add(r2);
		arr2.add(r3);
		Collections.sort(arr2);
		System.out.println(arr2);
		c1.move(3,2);
		r2.move(2, 3);
		System.out.println(arr);
		Cuboid cu1 = new Cuboid(5,10,2,20,3,2);
		Cuboid cu2 = new Cuboid(4,8,6,5,2,10);
		int x = cu1.compareTo(cu2);
		if(x==1)
		{
			System.out.println(cu1);
		}else if(x==-1)
		{
			System.out.println(cu2);
		}
		else {
			System.out.println("One is not larger");
		}
	}

}
