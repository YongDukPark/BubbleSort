package �ڵ��׽�Ʈ_������;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		//����� temp
		int temp = 0;
					  //�迭�� �����ϱ����� �迭�� ���̸�ŭ �ݺ� 
		for(int i = 0 ; i < arr.length ; i++) {
								//i�� �����ϴ� ���� 0 ���� 1ȸ���� �Ϸ�Ǹ� 
								//���� ���� ū���� ���Ƿ� ������ ������ �ʿ䰡 ����.
								//�׷��Ƿ� -i���� ���ش�.
			for(int j = 1 ; j < arr.length-i ; j++) {
				
				//���� j[0]�� j[1] ���� ������ �̰� ������ ���Ѵ�.
				if(arr[j-1]>arr[j]) {
					//1.arr[j-1] ���� temp�� �ִ´�.
					temp = arr[j-1];
					//2.arr[j] ���� arr[j-1] �� �ִ´�.
					arr[j-1] = arr[j];
					//3.1���� ���� temp�� ���� arr[j]�� �ִ´�.
					arr[j] = temp;
				}
			}
		}
		return arr;
	}


	public static void main(String[] args) {

		int[] arr = {3,5,7,8,2,1,4};
		arr = bubbleSort(arr);
		
		System.out.print("arr : ");
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]);
			if(i==arr.length-1) {
			}
			else {
				System.out.print(",");
			}
		}
		
		System.out.println();
		
		String star = "";
					//�� 5�� �ݺ� 1�� for�� 1ȸ ����� 2�� for�� ��ü �ݺ�
		for(int i=0 ; i < 5 ; i++) {
					  //1ȸ���� 3���� �ݺ�
			for(int j=0; j<3 ; j++) {
				star+="*";
			}
			star+="\n";
		}
		System.out.println(star);

	}

}
