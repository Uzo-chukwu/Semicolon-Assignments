public class MergedArray{
public static void main(String [] args){

	
	int[] firstList ={1,2,3,4};
	int[] secondList ={5,6,7,8};
	int[] mergedList =new int[8];

	

	for (int count = 0; count < firstList.length; count++){
	
		mergedList[count]= firstList[count];	
	} 

	for (int count = 0; count < secondList.length  ; count++){
	
		mergedList[count+4]= secondList[count];	
	} 

	for (int count = 0; count < mergedList.length  ; count++){
	
		System.out.print(mergedList[count]+" ");


	} 

	
}

}