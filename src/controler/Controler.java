package controler;

import domen.RockPaperScissors;

public class Controler {
	private static Controler instanca;
	private RockPaperScissors rockPaperScissors;
	
	private Controler() {
		rockPaperScissors = new RockPaperScissors();
	}
	
	public static Controler getInstanca() {
		if(instanca == null) {
			instanca = new Controler();
		}
		return instanca;
	}
	public String napuniBota() {
		return rockPaperScissors.napuniBota();
	}
	
	public String getSum(String suma) {
		return rockPaperScissors.getSum(suma);
	}
	public String getValue(String value) {
		
		return rockPaperScissors.getValue(value);
	}

	public String getValueLabel(String text) {
		return rockPaperScissors.getValueLabel(text);
		
	}
	public RockPaperScissors getrockPaperScissors() {
		return rockPaperScissors.getrockPaperScissors();
	}
}
