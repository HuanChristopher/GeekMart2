package br.ufrpe.geekMart.classesBasicas;



public class Categorias {
	private static String[] categorias = new String[100];
	private static int qtCategorias = 30;

	public Categorias() {
		categorias[0] = "Figuras, estatuas e bonecos";
		categorias[1] = "Games";
		categorias[2] = "Card Games";
		categorias[3] = "Camisas";
		categorias[4] = "Canecas";
		categorias[5] = "Acessórios";
		categorias[6] = "HQs";
		categorias[7] = "Mangás";
		categorias[8] = "DVDs e CDs";
		categorias[9] = "Cosplay";
		categorias[10] = "Outros"; //fim das principais
		categorias[11] = "Animes"; //inicio das subcategorias
		categorias[12] = "Naruto";
		categorias[13] = "Cavaleiros do Zodiaco";
		categorias[14] = "Dragon Ball";
		categorias[15] = "Marvel";
		categorias[16] = "DC";
		categorias[17] = "Disney";
		categorias[18] = "Yugi-Oh";
		categorias[19] = "Magic";
		categorias[20] = "Hot Toy";
		categorias[21] = "S.H.Figuarts";
		categorias[22] = "Cloth Myth";
		categorias[23] = "Play Arts";
		categorias[24] = "POP Funko";
		categorias[25] = "Iron Studios";
		categorias[26] = "Breaking Bad";
		categorias[27] = "Star Wars";
		categorias[28] = "Harry Potter";
		categorias[29] = "Senhor dos Anéis";
		categorias[30] = "Game of Thrones";
		categorias[31] = "Chaveiros";
		categorias[32] = "Colares";
		categorias[33] = "Pulseiras";
		categorias[34] = "Brincos";
		categorias[35] = "DVDs e CDs";
		categorias[36] = "Filmes";
		categorias[37] = "Séries";
		categorias[38] = "Pokemon";
		categorias[39] = "Mario Bros";
	}

	public static String getCategoria (int i) {
		return categorias[i];
	}

	public static void setCategorias (int num, String novaCategoria) {
		categorias[num] = novaCategoria;
		if (num > 30) {
			qtCategorias++;
		}
	}

	public static int encontrarCategoria (String categoria) {
		int i;
		for (i = 0; i < qtCategorias; i++) {
		    if (categoria.equals(categorias[i])) {
		        return i;
            }
        }
        return -1;
	}

	public static String toStringPrincipal () {
	    int i, f;
	    String s = "[1] " + categorias[0] + "\n";
	    for (i = 1; i < 11; i++) {
	        f = i;
	        f++;
            s = s + "[" + f + "] " + categorias[i];
            if (f < 11) {
                s = s  + "\n";
            }
        }
        return s;
    }

    public static String toStringSubcategorias (int i) {
	    String results;
        switch (i) {
            case 1: {
                results = "[1] " + categorias[24] + "\n" + "[2] " + categorias[36] + "\n" + "[3] " + categorias[37] + "\n"
                        + "[4] " + categorias[11] + "\n" + "[5] " + categorias[6] + "\n" + "[6] " + categorias[23] + "\n"
                        + "[7] " + categorias[20] + "\n" + "[8] " + categorias[22] + "\n" + "[9] " + categorias[21] + "\n"
                        + "[10] " + categorias[25];
                break;
            }
            case 2: {
                results = "[1] " + categorias[38] + "\n" + "[2] " + categorias[39];
                break;
            }
            case 3: {
                results = "[1] " + categorias[18] + "\n" + "[2] " + categorias[19];
                break;
            }
            case 4: {
                results = "[1] " + categorias[36] + "\n" + "[2] " + categorias[37] + "\n" + "[3] " + categorias[11] + "\n"
                        + "[4] " + categorias[6];
                break;
            }
            case 5: {
                results = "[1] " + categorias[34] + "\n" + "[2] " + categorias[37] + "\n" + "[3] " + categorias[6] + "\n"
                        + "[4] " + categorias[11] + "\n" + "[5] " + categorias[7];
                break;
            }
            case 6: {
                results = "[1] " + categorias[31] + "\n" + "[2] " + categorias[32] + "\n" + "[3] " + categorias[33] + "\n"
                        + "[4] " + categorias[34];
                break;
            }
            case 7: {
                results = "[1] " + categorias[16] + "\n" + "[2] " + categorias[15] + "\n" + "[3] " + categorias[27];
                break;
            }
            case 8: {
                results = "[1] " + categorias[18] + "\n" + "[2] " + categorias[12] + "\n" + "[3] " + categorias[14] + "\n"
                        + "[4] " + categorias[13];
                break;
            }
            case 9: {
                results = "[1] " + categorias[36] + "\n" + "[2] " + categorias[37] + "\n" + "[3] " + categorias[11];
                break;
            }
            case 10: {
                results = "[1] " + categorias[36] + "\n" + "[2] " + categorias[37] + "\n" + "[3] " + categorias[11] + "\n"
                        + "[4] " + categorias[6];
                break;
            }
            default: {
                results = null;
            }
        }
        return results;
    }

    public static int pegarCategoriaEscolhida (int caso, int opcao) {
	    int returnn = -1;
	    switch (caso) {
            case 1: {
                if (opcao == 1) returnn = 24;
                else if (opcao == 2) returnn = 36;
                else if (opcao == 3) returnn = 37;
                else if (opcao == 4) returnn = 11;
                else if (opcao == 5) returnn = 6;
                else if (opcao == 6) returnn = 23;
                else if (opcao == 7) returnn = 20;
                else if (opcao == 8) returnn = 22;
                else if (opcao == 9) returnn = 21;
                else if (opcao == 10) returnn = 25;
                break;
            }
            case 2: {
                if (opcao == 1) returnn = 38;
                else if (opcao == 2) returnn = 39;
                break;
            }
            case 3: {
                if (opcao == 1) returnn = 18;
                else if (opcao == 2) returnn = 19;
                break;
            }
            case 4: {
                if (opcao == 1) returnn = 36;
                else if (opcao == 2) returnn = 37;
                else if (opcao == 3) returnn = 11;
                else if (opcao == 4) returnn = 6;
                break;
            }
            case 5: {
                if (opcao == 1) returnn = 34;
                else if (opcao == 2) returnn = 37;
                else if (opcao == 3) returnn = 6;
                else if (opcao == 4) returnn = 11;
                else if (opcao == 5) returnn = 7;
                break;
            }
            case 6: {
                if (opcao == 1) returnn = 31;
                else if (opcao == 2) returnn = 32;
                else if (opcao == 3) returnn = 33;
                else if (opcao == 4) returnn = 34;
                break;
            }
            case 7: {
                if (opcao == 1) returnn = 16;
                else if (opcao == 2) returnn = 15;
                else if (opcao == 3) returnn = 27;
                break;
            }
            case 8: {
                if (opcao == 1) returnn = 18;
                else if (opcao == 2) returnn = 12;
                else if (opcao == 3) returnn = 14;
                else if (opcao == 4) returnn = 13;
                break;
            }
            case 9: {
                if (opcao == 1) returnn = 36;
                else if (opcao == 2) returnn = 37;
                else if (opcao == 3) returnn = 11;
                break;
            }
            case 10: {
                if (opcao == 1) returnn = 36;
                else if (opcao == 2) returnn = 37;
                else if (opcao == 3) returnn = 11;
                else if (opcao == 4) returnn = 6;
                break;
            }
        }
        return returnn;
    }

}




