package empresa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LivroFisico ld = new LivroFisico("Senhor dos Aneis",
				new Autor ("Tolkien","Britanico","tolkien@email.com"),"Accao",2,35,15);
		
		LivroFisico livroA = new LivroFisico("Narnia",
				new Autor ("Tolkien","Britanico","tolkien@email.com"),"Fantasia",2,35,15);
		
		ld.info();
		
		Livro livro;
		
		livro=livroA;
		
		livro.info();
		System.out.println("----------------");
		
		livro=ld;
		livro.info();
		
	}
	

}
