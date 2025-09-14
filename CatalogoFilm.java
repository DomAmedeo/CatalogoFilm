import java.util.ArrayList;
import java.util.List;

public class CatalogoFilm {
    private List<Film> CatalogoFilm = new ArrayList<>();
    private String nomeCatalogo;

    public CatalogoFilm(String nomeCatalogo){
        this.nomeCatalogo=nomeCatalogo;
    }

    public String getCatalogo(){
        return nomeCatalogo;
    }

    public void setNuovoCatalogo(String nuovoCatalogo){
        this.nomeCatalogo = nuovoCatalogo;
    }

    // Inserimento di un nuovo film.
    public void aggiungifilm(Film film){
        CatalogoFilm.add(film);
        System.out.println("il film: "+ film.getTitolo()+" è stato inserito correttamente" );
    }

    // Visualizzazione di tutti i film presenti nel catalogo.
    public void filmpresenti(){
        List<Film> filmpresenti = new ArrayList<>();
        for(Film film: CatalogoFilm){
            filmpresenti.add(film);
            System.out.println("i film presenti nel catalogo: "+ nomeCatalogo +" sono: "+ film.getTitolo());
            }
    }

    // Ricerca con ricercapertitolo (DA modificare mettere confronto case-insensitive.)
    public void ricercapertitolo(String titolo){
        for(Film film: CatalogoFilm){
            if(titolo.equalsIgnoreCase(film.getTitolo())){
                System.out.println("Il film "+ titolo +" è presente nel catalogo");
            }
        }      
    }

    // Modifica dei dati di un film già presente, tramite `id`.
    public void modificaperID(int id, String titolo, String regista, int anno, String genere){
        for (Film film: CatalogoFilm){
            if(id == film.getId()){
                film.setTitolo(titolo);
                film.setAnno(anno);
                film.setGenere(genere);
                film.setRegista(regista);
                System.out.println("FIlm modificato: "+ film.getTitolo()+" , "+ film.getRegista()+" , "+ film.getAnno()+" , "+ film.getGenere());
            }
        }
    }

    // Eliminazione di un film dal catalogo, tramite `id`.
    public void eliminaperID(int id){
        for(Film film: CatalogoFilm){
            if(film.getId()== id){
                CatalogoFilm.remove(film);
                System.out.println("IL film "+ film.getTitolo()+ " è stato rimosso");
            }
        }
    }

}





