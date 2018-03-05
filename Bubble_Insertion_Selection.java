package searchesAndSorts;

public class Bubble_Insertion_Selection {

	public static void viewArray(int[] list){
		for(int x: list){
			System.out.print(x + "\t");
		}
		System.out.println();
	}
	public static void selectionSort(int[] list){
		for(int pass = 0; pass < list.length; pass++){
			int smallest = pass;
			for(int i = pass; i < list.length; i++){
				if(list[i] < list[smallest]){
					smallest = i;
				}
			}
			int temp = list[pass];
			list[pass] = list[smallest];
			list[smallest] = temp;
		}
	}
	public static void insertionSort(int[] list){
		for(int pass = 1; pass < list.length; pass++){
			int temp = list[pass];
			int i = pass - 1;
			while(i >= 0 && list[i] > temp){
				list[i+1] = list[i];
				i--;
			}
			list[i+1] = temp;
		}
	}
	public static void bubbleSort(int[] list){
		for(int i = 0; i < list.length; i++){
			boolean inorder = true;
			for(int j = 0; j < list.length - 1 - i; j++){
				if(list[j] > list[j+1]){
					int temp = list[j];
					list[j] = list[j+1];
					list[j+1] = temp;
					inorder = false;
				}
			}
			if(inorder)
				return;
		}
	}
		
			
	public static void main(String[] args) {
		int[] lost = new int[]{2,5,7,1,32,8,0};
		viewArray(lost);
		insertionSort(lost);
		viewArray(lost);
	}

}
