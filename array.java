package multidimension;

public class array {

	public array() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x [][]= {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int i = 0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.println(x[i][j]);
			}
			System.out.println("");
		}
		System.out.println();

	}

}
