package jana60.bank;

public class Conto {
    private int numConto;
    private String nomeProp;
    private int saldo = 0;

    public Conto(int numConto, String nomeProp){
        setNumConto(numConto);
        setNomeProp(nomeProp);
    }

    

    private void setNumConto(int numConto) {
        this.numConto = numConto;
    }



    public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }

    

    public int getNumConto() {
        return numConto;
    }



    public String getNomeProp() {
        return nomeProp;
    }



    public int getSaldo() {
        return saldo;
    }

    public String addMoney(int somma){
        saldo += somma;
        return "Il saldo aggiornato è: " + saldo;
    }

    public String getMoney(int prelievo){
        if (prelievo <= saldo) {
            saldo -= prelievo;
            return "Sono stati prelevati: " + prelievo + "\nIl saldo aggiornato è: " + saldo;
        }else{
            return "La cifra da prelevare è maggiore del saldo depositato!";
        }
    }

    @Override
    public String toString() {
        return "Nome Proprietario: " + getNomeProp() + "\nNumero Conto: " + getNumConto() + "\nSaldo: " + getSaldo();
    }
}
