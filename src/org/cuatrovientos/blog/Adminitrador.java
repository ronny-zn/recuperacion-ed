package org.cuatrovientos.blog;



public class Adminitrador {
	
	public String name;
	private String contraseña;
	
	
	public Adminitrador() {
		
	}
	
	public boolean añadirPost(Post aPost) {
		return Post.add(aPost);	
	}	
	public boolean borrarPost(Post aPost) {
		return Post.remove(aPost);
	}
	
	
}
