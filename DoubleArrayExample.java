int[] arr = {-11, 22, 73, -4, 53};
int[] negatives = new int[count];

int negIndex = 0;
for (int i = 0; i < arr.length; i++){
	if (arr[i] < 0){
		negatives[negIndex] = arr[i];
		negIndex++;
	}
}

