public class DeterminanteRecursivo {

    public static double[][] gerarSubMatriz(double[][] matriz, int linha, int coluna, int n) {
        double[][] novaMatriz = new double[n - 1][n - 1];
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (i == linha) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == coluna) continue;
                novaMatriz[r][c] = matriz[i][j];
                c++;
            }
            r++;
        }
        return novaMatriz;
    }

    public static double determinante(double[][] matriz, int n) {
        if (n == 1)
            return matriz[0][0];
        if (n == 2)
            return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);

        double det = 0;
        for (int j = 0; j < n; j++) {
            double[][] subMatriz = gerarSubMatriz(matriz, 0, j, n);
            int sinal = ((0 + j) % 2 == 0) ? 1 : -1;
            double subDet = determinante(subMatriz, n - 1);
            det += sinal * matriz[0][j] * subDet;
        }
        return det;
    }

    public static void main(String[] args) {
        double[][] matriz = {
            {2, 3, 1, 5},
            {4, 1, 3, 2},
            {1, 2, 0, 1},
            {3, 1, 2, 4}
        };

        double resultado = determinante(matriz, 4);
        System.out.println("Determinante da matriz = " + resultado);
    }
}
