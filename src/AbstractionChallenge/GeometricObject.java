package AbstractionChallenge;

public abstract class GeometricObject implements Comparable<GeometricObject> {
	private String color;
	private boolean isFilled;

	public GeometricObject() {
		this("white", false);
	}

	public GeometricObject(String color, boolean isFilled) {
		super();
		this.color = color;
		this.isFilled = isFilled;
	}

	public String getColor() {
		return color;
	}

	public boolean isFilled() {
		return isFilled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", isFilled=" + isFilled + "]";
	}

	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		if (o.getArea() > getArea()) {
			return -1;
		}
		if (o.getArea() < getArea()) {
			return 1;
		}
		return 0;
	}

}
