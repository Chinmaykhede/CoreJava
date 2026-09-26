package in.co.oop.abstracion;

public class TestBusinessman {
	public static void main(String[] args) {
		Richman r = new Businessman();
		r.earnMoney();
		r.donation();
		r.party();
		
		HelpToOthers h = new Businessman();
		h.helpToOthers();
	}


}
