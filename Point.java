import java.util.ArrayList;
import java.util.List;

class Point {
	String id
	double x,y;

	//TODO add new variable
	String color;

	//TODO constructor
	public Point(String id, double x, double y, String color) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}


	//TODO setters and getters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		if(xDirection=="R"){
			x++;
		}else
			if(xDirection=="L"){
				x--:
			}

		if(yDirection=="U") {
			y++;
		}else
			if(yDirection=="D"){
				y--;
			}

		}

	}

	public void draw () {
		//TODO
		System.out.println("x:"+ this.x +"y:"+this.y);
	}

}

class Canvas{
	List <Point> Points = new ArrayList<>();


	
}