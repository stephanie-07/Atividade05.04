package br.ulbra.artistas;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 * @author Andrey e Stephanie
 */
public class BdListaArtista {
    public String nomeArtista;
    public ArrayList <String> listaArtista;
    public ArrayList <String> listaArtistaOrdemAlfa;
    
    public BdListaArtista(){
        listaArtista = new ArrayList();
        listaArtistaOrdemAlfa = new ArrayList();
    }
    public void save(String artista){
        listaArtista.add(artista);
        listaArtistaOrdemAlfa.add(artista);
        JOptionPane.showMessageDialog(null, "O "+artista+" foi salvo com sucesso!");
    }
    public boolean temEspaco(String artista){
        boolean espaco;
        String[] ec = artista.split(" ");
        if (ec.length <= 1){
            espaco = false;
        }else{
            espaco = true;
        }
        return espaco;
    }
    public String toString(){
        String result = "Lista de Artistas\n";
        if (!listaArtista.isEmpty()){
            for (int i=0; i < listaArtista.size();i++){
                result += listaArtista.get(i)+"\n";
        }
        }else{
            result = "A base de dados encontra-se vazia";
        }
        return result;
    }
    public String toStringAlfabetico(){
        String result = "Lista de Artistas\n";
        if (!listaArtistaOrdemAlfa.isEmpty()){
            Collections.sort(listaArtistaOrdemAlfa);
            for (int i = 0; i < listaArtistaOrdemAlfa.size(); i++){
                result += listaArtistaOrdemAlfa.get(i) + "\n";
            }
        }else{
            result = "A base de dados encontra-se vazia!";
        }
        return result;
    }
    public int getSize(){
    return listaArtista.size();
    }
    public String getArtista(int i){
       String r = " ";
        if(i>=0){
            r = listaArtista.get(i);
            
        }else{
            r = "Artista não existe";
        }
        return r;
    }
    public void delete(int i,int ii){
        if(i!=-1 && ii!=-1){
            listaArtista.remove(i);
            listaArtistaOrdemAlfa.remove(ii);
             JOptionPane.showMessageDialog(null,"Artista excluído!");
        }
        
    } 
    public void del(int i){
        listaArtista.clear();
        listaArtistaOrdemAlfa.clear();
    }
    public void setnomeArtista(String nomeArtista){
    this.nomeArtista = nomeArtista;
}
    public int search(String Artista){
    boolean achou = false;
    int i = 0, r = -1;
    while(i<listaArtista.size() && !achou){
        if (listaArtista.get(i).equals(Artista)){
            r = i;
            achou = true;
        }
        i++;
       }
        return r;
    }
   public int searchAlfa(String artista){
        boolean achou = false;
        int iListaArtistaOrdemAlfa = 0,r=1;
        while(iListaArtistaOrdemAlfa < listaArtista.size() && !achou){
       if(listaArtista.get(iListaArtistaOrdemAlfa).equals(artista)){
           r = iListaArtistaOrdemAlfa;
           achou = true;
       }
   iListaArtistaOrdemAlfa++;
   }
        return r;
  }
    public void update(int i, String update){
          if(i!=-1 || update.length()>0 ){
              listaArtista.set(i, update);
              JOptionPane.showMessageDialog(null, "Artista modificado com sucesso!");
          }else{
              JOptionPane.showMessageDialog(null, "O artista não foi modificado!");
      }
    }

   
}

