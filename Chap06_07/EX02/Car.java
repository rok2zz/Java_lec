package Chap06_07.EX02;

public class Car {

	String company ; 
	String model ; 
	String color ; 
	int maxSpeed ;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {	// RAM�� ���� �ο��Ҷ�  setter 
		this.company = company;					//this : �ڽ��� ��ü 
	}			// �޼ҵ忡 ��ǲ�Ǵ� ������, ��ǲ�� ������ �޴� ������, �޸𸮿� �ε��� ������ (this.
	public String getModel() {
		return model;
	}
	public void setModel(String mo) {	//��ǲ, ��ǲ�� �޴� ����, �޸𸮿� �ε��� ���� ��� �ٸ����� 
		model = mo;						//this Ű��带 ���� ���� 
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	} 
	
	

}
