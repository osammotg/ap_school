
public class ex3 {
		public static int[][] matrixtranspose(int k, int[][] matrix) {
		
		for (int lignes = 0; lignes < matrix.length; lignes++) {
			for (int colonnes = 0; colonnes < matrix[lignes].length; colonnes++) {
				matrix[lignes][colonnes] *= k;	
			}
		}
		
		return matrix;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
