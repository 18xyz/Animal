
public class Customer extends Person {
	int cumNum;
	int point;

	public String toString() {
		return cumNum + " " + point + " ";
	}

	public Customer(int cumNum, int point) {
		this.cumNum = cumNum;
		this.point = point;
	}

	public int getCumNum() {
		return cumNum;
	}

	public void setCumNum(int cumNum) {
		this.cumNum = cumNum;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}
