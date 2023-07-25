package com.mycompany.cinex;

/**
 *
 * @author higor
 */
public class Ingresso {

    private double inteira;
    private double meia;
    private int qtdInteira;
    private int qtdMeia;
    private double pipoca;
    private double cartao;
    private String pagamento;
    private String nomeCombo;

    /**
     * @return the inteira
     */
    public double getInteira() {
        return inteira;
    }

    /**
     * @param inteira the inteira to set
     */
    public void setInteira(double inteira) {
        this.inteira = inteira;
    }

    /**
     * @return the meia
     */
    public double getMeia() {
        return meia;
    }

    /**
     * @param meia the meia to set
     */
    public void setMeia(double meia) {
        this.meia = meia;
    }

    /**
     * @return the pipoca
     */
    public double getPipoca() {
        return pipoca;
    }

    /**
     * @param pipoca the pipoca to set
     */
    public void setPipoca(double pipoca) {
        this.pipoca = pipoca;
    }

    /**
     * @return the cartaoCredito
     */
    public double getCartao() {
        return cartao;
    }

    /**
     * @param cartao the cartaoCredito to set
     */
    public void setCartao(double cartao) {
        this.cartao = cartao;
    }

    /**
     * @return the pagamento
     */
    public String getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }
    
    public double ValorTotal (){
        double total = this.getInteira() + this.getMeia() + this.getPipoca() + this.getCartao();
        return total;
    }

    /**
     * @return the nomeCombo
     */
    public String getNomeCombo() {
        return nomeCombo;
    }

    /**
     * @param nomeCombo the nomeCombo to set
     */
    public void setNomeCombo(String nomeCombo) {
        this.nomeCombo = nomeCombo;
    }

    /**
     * @return the qtdInteira
     */
    public int getQtdInteira() {
        return qtdInteira;
    }

    /**
     * @param qtdInteira the qtdInteira to set
     */
    public void setQtdInteira(int qtdInteira) {
        this.qtdInteira = qtdInteira;
    }

    /**
     * @return the qtdMeia
     */
    public int getQtdMeia() {
        return qtdMeia;
    }

    /**
     * @param qtdMeia the qtdMeia to set
     */
    public void setQtdMeia(int qtdMeia) {
        this.qtdMeia = qtdMeia;
    }
    
    public int qtdIngressos(){
        int total = this.qtdInteira + this.qtdMeia;
        return total;
    }
    
}
