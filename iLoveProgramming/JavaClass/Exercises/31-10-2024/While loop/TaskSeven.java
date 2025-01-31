public class TaskSeven {

	public static void main(String [] args){
	
	int count = 1;
	while( count <= 10  ){
		
		if(count % 4 == 0 )
			 System.out.printf("%d ",count+count * count+count*count*count+count*count*count*count+count*count*count*count*count);	
	count++;
	}
}
}