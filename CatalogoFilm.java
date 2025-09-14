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
            if(film.getTitolo()== titolo){
                System.out.println("Il film "+ titolo +" è presente nel catalogo");
            }
        }
        

    }
}





