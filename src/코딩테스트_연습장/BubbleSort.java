package 코딩테스트_연습장;

public class BubbleSort {

	public static int[] bubbleSort(int[] arr) {
		//빈공간 temp
		int temp = 0;
					  //배열을 정렬하기위해 배열의 길이만큼 반복 
		for(int i = 0 ; i < arr.length ; i++) {
								//i의 시작하는 값은 0 만약 1회전이 완료되면 
								//끝에 가장 큰값이 들어가므로 끝에는 비교해줄 필요가 없다.
								//그러므로 -i값을 해준다.
			for(int j = 1 ; j < arr.length-i ; j++) {
				
				//만약 j[0]이 j[1] 보다 작으면 이걸 끝까지 비교한다.
				if(arr[j-1]>arr[j]) {
					//1.arr[j-1] 값을 temp에 넣는다.
					temp = arr[j-1];
					//2.arr[j] 값을 arr[j-1] 에 넣는다.
					arr[j-1] = arr[j];
					//3.1에서 넣은 temp의 값을 arr[j]에 넣는다.
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
					//총 5번 반복 1차 for문 1회 진행시 2차 for문 전체 반복
		for(int i=0 ; i < 5 ; i++) {
					  //1회전시 3번씩 반복
			for(int j=0; j<3 ; j++) {
				star+="*";
			}
			star+="\n";
		}
		System.out.println(star);

	}

}
