
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int j = 1;j<=9;j++){
			for(int i =2;i<=9;i++){
				if((i*j)%6 ==0){
					System.out.print("\t");
				}else if((i*j) %3 ==0){
					System.out.print(i + "*" + j + " =¡C\t");
				}else if((i*j)%2 ==0){
					System.out.print(i + "*" + j + " =*\t");
				}else{
					System.out.print(i + "*" + j + " =" + (j*i) + "\t");
				}
			}
			System.out.println();
		}
	}

}
