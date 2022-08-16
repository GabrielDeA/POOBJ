ic long multiplicar(InteiroPositivo outro){
        return this.x * outro.getValor();
    }
    
    // item c
    public long fatorial(){
        long fat = 1;
        
        for (int i = this.x; i > 1; i--) {
            fat *= i;
        }
        return fat;
    }
    
    //item d
    public String IdentificarDivisores() {
        int y = this.x;
        int qtd = 0;
        String divisores = "os divisores são";
        for( int i = 1; i < y + 1; i++) {
            if(y == i) {
                divisores = divisores + " " + i;
            }
            else {
            if (y%i == 0) {
              divisores = divisores + " " + i + ",";
              qtd++;
            }
        }
    }
        return divisores + " e a quantidade de divisores é " + qtd;
        
    }
    
    
    public int[] fibonacci() {
        int[] vetor = new int[this.x];
        int y = this.x;
        if (y == 1) {
            vetor[0] = 1;
        }
        else {
        vetor[0] = 1;
        vetor[1] = 1;
        for (int i = 2; i < y; i++) {
            vetor[i] = vetor[i-1] + vetor[i-2];
        }
        
    }
    return vetor;
}

    public double VH() {
        int y = this.x;
        double H = 0;
        for (int i = 1; i < y + 1; i++) {
            H = H + 1/i;
        }
        return H;
    }
}
