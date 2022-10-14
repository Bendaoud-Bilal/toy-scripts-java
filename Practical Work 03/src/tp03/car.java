/*
 * Problem: Car Class (TP03)
 * Implements a Car class with attributes (brand, model, speed) and methods
 * (accelerate, brake) to practice encapsulation.
 * Context: University tutorial / lab exercise (TD / TP)
 */
package tp03;

public class car {
	private String Engine;
	private String Owner;
//-------------------------------------------------------
	public car (String Engine,String Owner) {
		Set_Engine(Engine);
		Set_Owner(Owner);
		}
//----------------------------------------------------------------
	public void Set_Engine(String Engine) {
		this.Engine=Engine;
	}
//---------------------------------------------------
	public void Set_Owner(String Owner) {
		this.Owner=Owner;
	}
//-------------------------------------------------------------
	public String Get_Engine() {
		return Engine;
	}
//-----------------------------------------------------------------
	public String Get_Owner() {
		return Owner;
	}
}
