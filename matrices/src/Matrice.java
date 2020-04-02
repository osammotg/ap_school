import java.util.Arrays;


public class Matrice {
	
	//public static int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrice1 = {	{1,2,-1},
								{2,1,1}
		};
		int coef1 = 4;
		int [][] matrice2 = {	{-1,3,1},
								{2,1,2}
									};
		int coef2 = 3;
		int [][] matrice3 = {	{2,4,1},
								{-1,3,2}
									};
		int coef3 = -2;
		
								
	for(int ligne = 0; ligne < 2; ligne ++){
		for(int colonne = 0; colonne < 3; colonne ++){
			matrice1 [ligne][colonne] *= 4; //coeficient
		}
		//System.out.println(Arrays.toString(matrice1[ligne]));
	}
	//System.out.println();
	
	
	for(int ligne = 0; ligne < 2; ligne ++){
		for(int colonne = 0; colonne < 3; colonne ++){
			matrice2 [ligne][colonne] *= 3; //coeficient
			}
		//System.out.println(Arrays.toString(matrice2[ligne]));
	}
	//System.out.println();
	
	
	
	for(int ligne = 0; ligne < 2; ligne ++){
		for(int colonne = 0; colonne < 3; colonne ++){
			matrice3 [ligne][colonne] *= -2; //coeficient
		}
		//System.out.println(Arrays.toString(matrice3[ligne]));
	}
	//System.out.println();
	int[][] matricefinale = new int[2][3];
	for(int ligne = 0; ligne < 2; ligne ++){
		for(int colonne = 0; colonne < 3; colonne ++){
			matricefinale[ligne][colonne]  = matrice1 [ligne][colonne] + matrice2 [ligne][colonne] + matrice3 [ligne][colonne];
		}
		
		
		
	}
	System.out.println(Arrays.deepToString(matricefinale));
	}
}
