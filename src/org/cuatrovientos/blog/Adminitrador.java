package org.cuatrovientos.blog;



public class Adminitrador {
	
	public String name;
	private String contraseņa;
	
	
	public Adminitrador() {
		
	}
	
	public boolean aņadirPost(Post aPost) {
		return Post.add(aPost);	
	}	
	public boolean borrarPost(Post aPost) {
		return Post.remove(aPost);
	}
	
	
}
