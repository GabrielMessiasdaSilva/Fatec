package MinhaSegundaED;

public class MinhaSegundaED {

    String[] nomes = new String[26]; 
    int totalNomes = 0; 
    
    public int getIndice(String nome) {
        if (nome == null || nome.isEmpty()) {
            return -1; 
        }
        
        char primeiroNome = Character.toUpperCase(nome.charAt(0));
        
        if (primeiroNome < 'A' || primeiroNome > 'Z') {
            return -1; 
        }
        
        switch (primeiroNome) {
            case 'A': return 0;
            case 'B': return 1;
            case 'C': return 2;
            case 'D': return 3;
            case 'E': return 4;
            case 'F': return 5;
            case 'G': return 6;
            case 'H': return 7;
            case 'I': return 8;
            case 'J': return 9;
            case 'K': return 10;
            case 'L': return 11;
            case 'M': return 12;
            case 'N': return 13;
            case 'O': return 14;
            case 'P': return 15;
            case 'Q': return 16;
            case 'R': return 17;
            case 'S': return 18;
            case 'T': return 19;
            case 'U': return 20;
            case 'V': return 21;
            case 'W': return 22;
            case 'X': return 23;
            case 'Y': return 24;
            case 'Z': return 25;
            default: return -1; 
        }
    }

   
    public boolean adicionarNome(String nome) {
        int indice = getIndice(nome);
        if (indice == -1 || totalNomes >= nomes.length) {
            return false; 
        }
        
        nomes[indice] = nome;
        totalNomes++;
        return true; // Retorna true se o nome foi adicionado com sucesso
    }

    // Método para exibir os nomes armazenados
    public void exibirNomes() {
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] != null) {
                System.out.println(nomes[i]);
            }
        }
    }
}
