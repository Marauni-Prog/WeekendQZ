package AbstractionChallenge;

public class Triangle extends GeometricObject {
	private double width;
	private double height;
	private double hypotenius;

	public Triangle(double height, double width, double hypotenius) {
		super();
		this.height = height;
		this.width = width;
		this.hypotenius = hypotenius;
	}

	public Triangle(String color, boolean isFilled, double width, double height, double hypotenius) {
		super(color, isFilled);
		this.height = height;
		this.width = width;
		this.hypotenius = hypotenius;
	}

	private boolean isRightAngle() {
		if ((width * width) + (height * height) == (hypotenius * hypotenius)) {
			return true;
		}
		return false;
	}

	@Override
	public double getArea() {
		if (isRightAngle()) {
			return (0.5 * width * height);
		}
		return -1;

	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width + height + hypotenius;
	}

	@Override
	public String toString() {
		return "Triangle \n  width=" + width + "\n  height=" + height + "\n  hypotenius=" + hypotenius
				+"\n  Filled="+isFilled()+"\n  Color="+getColor();
	}

}
