package org.cuatrovientos.blog;



public class Adminitrador {
	
	public String name;
	private String contrase�a;
	
	
	public Adminitrador() {
		
	}
	
	public boolean a�adirPost(Post aPost) {
		return Post.add(aPost);	
	}	
	public boolean borrarPost(Post aPost) {
		return Post.remove(aPost);
	}
	
	
}
