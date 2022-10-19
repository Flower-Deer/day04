package day04;


//���ȣ��-�Լ��� �ڱ��ڽ��� ȣ���Ѵ�
//��Ģ - ����ؼ� ȣ���� �� �� ������ �������� ������ �Ѵ�.
//    - �ӵ��� ������ �޸� ���� ����ϴ� ����
//    - ���ð��� ���� 
// 5! = 5 X 4 X 3  X 2 X 1
public class ���ȣ�� {

	public static void main(String[] args) {
		Recursive rs = new Recursive();
        rs.display(10);
        System.out.println("---------------");
        rs.display2(10);
        System.out.println("---------------");
        System.out.println( rs.factorial(5) );
        System.out.println("---- ��Ŭ���� ȣ���� - �ִ� ����� -------");
        // 1. ū������ ���� ���� ������.
        // 2. �������� 0�̸� ������ ���� �ִ� ������̴� 
        // 3. �������� 0�� �ƴϸ� ������ / ������ 
        System.out.println( rs.gcd(22,8) );
	}

}

class Recursive{
	public void display(int limit) {
		if(limit == 0 ) return;
		System.out.println(limit);
		display(limit-1);
	}
	
	public void display2(int limit) {
		if(limit == 0) return;
		display2(limit-1);
		System.out.println(limit);
	}
	
	public int factorial(int limit) {
		if(limit == 1) return 1;
		else return limit * factorial( limit - 1);
	}
	//��Ŭ����ȣ������ �̿��Ͽ� �ִ����� ���ϱ� 
	public int gcd(int x, int y) {
		if(y==0) return x;
		else
			     return gcd(y, x % y);
	}
}



