class Ellipse{
	private double x, y, majorAxisLength, minorAxisLength;
	static int numEllipses = 0;
	public Ellipse(){
		this(0,0,1,1);
	}
	public Ellipse(double x, double y, double majAL, double minAL){
		this.x = x;
		this.y = y;
		this.majorAxisLength = majAL;
		this.minorAxisLength = minAL;
	}
	public double getArea(){
		return Math.PI*this.majorAxisLength*this.minorAxisLength;
	}
	public double getPerimeter(){
		double sqrt = Math.sqrt((Math.pow(this.majorAxisLength, 2)+Math.pow(this.minorAxisLength, 2))/2);
		return 2*Math.PI*sqrt;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public double getMajorAxisLength(){
		return this.majorAxisLength;
	}
	public double getMinorAxisLength(){
		return this.minorAxisLength;
	}
	public void setX(double x){
		this.x=x;
	}
	public void setY(double y){
		this.y=y;
	}
	public void setMajorAxisLength(double majAL){
		this.majorAxisLength=majAL;
	}
	public void setMinorAxisLength(double minAL){
		this.minorAxisLength=minAL;
	}
	
}