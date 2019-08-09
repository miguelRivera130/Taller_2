
public class Enemigo {
	
	protected float x;
	protected float y;
	protected float vida;
	protected float vel;


	public Enemigo(float x, float y, int vida, int vel) {
		this.setX(x);
		this.setY(y);
		this.setVida(vida);
		this.setVel(vel);
	}


	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}


	public float getVida() {
		return vida;
	}


	public void setVida(float vida) {
		this.vida = vida;
	}


	public float getVel() {
		return vel;
	}


	public void setVel(float vel) {
		this.vel = vel;
	}
}
