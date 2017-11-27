package appwhatsapp;

import java.io.Serializable;
import java.util.ArrayList;


public class Conversa implements Serializable{

    private String contato;
    protected ArrayList<Mensagem> listaMensagens = new ArrayList<>();

    public ArrayList<Mensagem> getListaMensagens() {
        return listaMensagens;
    }
    private String vistoPorUltimo;

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getVistoPorUltimo() {
        return vistoPorUltimo;
    }

    public void setVistoPorUltimo(String vistoPorUltimo) {
        this.vistoPorUltimo = vistoPorUltimo;
    }

    public Conversa(String contato, String vistoPorUltimo) {
        this.contato = contato;
        this.vistoPorUltimo = vistoPorUltimo;
    }

    public void addMensagem(Mensagem m) {
        listaMensagens.add(m);
    }

    public ArrayList<Mensagem> Buscar(String palavra) throws nenhumaMensagemException{
        ArrayList<Mensagem> resultadoBusca = new ArrayList<Mensagem>();
        resultadoBusca.removeAll(resultadoBusca);
        for (Mensagem mensagem : listaMensagens) {
            if (mensagem.getTexto().toLowerCase().contains(palavra.toLowerCase())) {
                resultadoBusca.add(mensagem);
            }
        }
        if (resultadoBusca.size() == 0) {
            throw new nenhumaMensagemException(palavra);
        }
        return resultadoBusca;
    }

    public StringBuilder TodaConversa() {
        StringBuilder todaConversa = new StringBuilder();
        todaConversa.delete(0, todaConversa.length());
        for (Mensagem conversa : listaMensagens) {
            todaConversa.append(conversa);
        }
        return todaConversa;
    }
}
