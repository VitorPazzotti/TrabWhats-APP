package appwhatsapp;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Whatsapp implements Serializable{

    private ArrayList<Conversa> listaConversa = new ArrayList<>();
    private String nomeUsuario = "NOME";
    private String telefoneUsuario;
    private String statusUsuario;

    public Whatsapp() {
    }

    public Whatsapp(String nomeUsuario, String telefoneUsuario, String statusUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.telefoneUsuario = telefoneUsuario;
        this.statusUsuario = statusUsuario;
    }

    private void addConversa(Conversa c) {
        listaConversa.add(c);
    }

    public void iniciarConversa(String telContato) {       
        boolean comparar = false;
        Conversa c = new Conversa(telContato, statusUsuario);
        for (int i = 0; i < listaConversa.size(); i++) {
            if (telContato.equals(listaConversa.get(i).getContato())) {
                comparar = true;
            }
        }
        if(comparar){
            JOptionPane.showMessageDialog(null, "Este contato já existe", "ERRO", JOptionPane.ERROR_MESSAGE);
        }else{
            addConversa(c);
        }
    }

    public ArrayList<Conversa> getListaConversa() {
        return listaConversa;
    }

    public void setListaConversa(ArrayList<Conversa> listaConversa) {
        this.listaConversa = listaConversa;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        this.telefoneUsuario = telefoneUsuario;
    }

    public String getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(String statusUsuario) {
        this.statusUsuario = statusUsuario;
    }

}
