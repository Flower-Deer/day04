package day04;

import java.util.Arrays;

public class ���� {

	int[] nums;
	//���ĵ��� ���� �ڷ� ������ֱ�(�ʱ�ȭ)
	void init() {
		nums = new int[] { 6,4,3,7,1,9,8};
//	    Arrays.sort(nums); �迭 Ŭ������ sort()�� �˾Ƽ� ��������
	    
	}
	//�迭�ȿ� �ִ� �� ����ϱ� 
	void display() {
		for( int n:nums) {
			System.out.printf("%3d", n);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		���� s = new ����();
		// ��������-�޸𸮾ȿ� �÷��ΰ� �����ϴ� �� ������ ���� ���� ��
		// �ܺ�����-������ �����Ͱ� ���Ƽ� �޸𸮿� �÷� ó���ϱ� ���� ��� (�⺻ �˰����� �������� �˰��� ������)
        // ������ �ٽɿ�Ҵ� ��ȯ ���� ����  
		// ��������
		System.out.println("----- ���� �����ϱ� �� ");
		s.init();
		s.display();
		s.bubbleSort1();
		System.out.println("----- ���� �����ϱ� �� �⺻���� n-1ȸ ���� ");
		s.display();
		
		System.out.println("----- ���� �����ϱ� �� ");
		s.init();
		s.display();
		s.bubbleSort2();
		System.out.println("----- ���� �����ϴ� �߿� ���� �Ϸ�� �� üũ(���� ���� ����)  ");
		s.display();
		
		System.out.println("----- ���� �����ϱ� �� ");
		s.init();
		s.display();
		s.selectSort();
		System.out.println("-----���� �����ϴ� �߿� ���� �Ϸ�� �� üũ ");
		s.display();
		
		System.out.println("-----���� �����ϱ� �� ");
		s.init();
		s.display();
		s.insertSort();
		System.out.println("-----���� �����ϴ� �߿� ���� �Ϸ�� �� üũ ");
		s.display();
		
	}
	
	void bubbleSort1() {
		System.out.println(" ���� ���� �� ------>");
		for( int i=0; i < nums.length-1 ; i++) {  // i=0 i=1
			for( int j=0; j< nums.length - 1 - i ; j++) { // j= 0 j<6,  j=0 j < 5
				if( nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j] ;
					 nums[j] = temp;
				}
			}
		   System.out.printf("%3d ȸ :", (i+1) );	
		   display();
		}
		System.out.println();
	}
	void bubbleSort2() {
		boolean flag=false;
		System.out.println(" ���� ���� �� ------>");
		for( int i=0; i < nums.length-1 ; i++) {  // i=0 i=1
			flag=false;
			for( int j=0; j< nums.length - 1 - i ; j++) { // j= 0 j<6,  j=0 j < 5
				if( nums[j] > nums[j+1]) {
					flag =  true;
					int temp = nums[j+1];
					nums[j+1] = nums[j] ;
					nums[j] = temp;
				}
			}
		   if(flag == false) break;
		   System.out.printf("%3d ȸ :", (i+1) );	
		   display();
		}
		System.out.println();
	}
    void selectSort() {
    	System.out.println("----- �������� �� ------->");
    	for(int i=0; i< nums.length - 1 ; i++) { // i=0          i=1       i=2
    		for(int j = i+1; j < nums.length; j++) { // j=1 ~ 6, j = 2~6   j=3~6 
    			if(nums[i] > nums[j] ) {
    				int temp = nums[j];
    				nums[j] = nums[i];
    				nums[i] = temp;
    			}
    		}
    		System.out.printf("%3d ȸ ", (i+1) );
    		display();
    	}
    }
    void insertSort() {
    	int i,j;
    	System.out.println("------ �������� �� ------");
    	for(i=1; i<nums.length; i++) {  //i=1~6
    		int temp = nums[i]; //��ġ ã�� �������� temp�� ������  ��) 4
    		j = i; // j=1
    		while( j>0 && temp < nums[j-1] ) {
    			nums[j] = nums[j-1];// nums[1] = nums[0]
    			j--;//0
    		}
    		nums[j] = temp; //nums[0] = 4
    		display();
    	}
    }
}
