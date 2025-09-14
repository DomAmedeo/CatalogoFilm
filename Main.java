public class Main {
    public static void main(String[] args) {
        CatalogoFilm c = new CatalogoFilm("Primo Catalogo");
        Film f = new Film(0, "Arancia Meccanica", "Stanley Kubric", 1970, "giallo/crime");
        Film fm = new Film(1, "Old Boy", "Lim Seung-yong", 2003, "Thriller");
        c.aggiungifilm(f);
        c.aggiungifilm(fm);
        c.filmpresenti();

        c.ricercapertitolo("arancia MEccanica");

        c.modificaperID(0, "Inceprtion", "Cristopher Nolan", 1990, "crime");
        c.modificaperID(10, "Insomnia", "Cristopher Nolan", 1990, "Thriller");
        c.filmpresenti();
        c.eliminaperID(0);
        c.filmpresenti();




    }
}
