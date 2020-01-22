package domen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockPaperScissors {
	private String rock;
	private String paper;
	private String scissors;
	public String getRock() {
		return rock;
	}
	public void setRock(String rock) {
		this.rock = rock;
	}
	public String getPaper() {
		return paper;
	}
	public void setPaper(String paper) {
		this.paper = paper;
	}
	public String getScissors() {
		return scissors;
	}
	public void setScissors(String scissors) {
		this.scissors = scissors;
	}
	@Override
	public String toString() {
		return "RockPaperScissors [rock=" + rock + ", paper=" + paper + ", scissors=" + scissors + "]";
	}
	public RockPaperScissors(String rock, String paper, String scissors) {
		super();
		this.rock = rock;
		this.paper = paper;
		this.scissors = scissors;
	}
	public RockPaperScissors() {
		super();
	}
	public String getValue(String value) {
		return value;
	}
	public String napuniBota() {
		List<String>lokalnaLista=new ArrayList<String>();
		lokalnaLista.add("Rock");
		lokalnaLista.add("Paper");
		lokalnaLista.add("Scissors");
		Random r = new Random();
		int randomitem = r.nextInt(lokalnaLista.size());
		String randomElement = lokalnaLista.get(randomitem);
		return randomElement;
		
	}
	
	public String getSum(String suma) {
		int sum = Integer.parseInt(suma);
		return String.valueOf(++sum);
		
	}
	public String getValueLabel(String value) {
		if(value.equals(""))return "1";
		else if (Integer.parseInt(value) >=1 )return getSum(value);
		return "Vrednost nije validna";
	}
	public RockPaperScissors getrockPaperScissors() {
		RockPaperScissors rockPaperScissors = new RockPaperScissors();
		rockPaperScissors.setPaper("Paper");
		rockPaperScissors.setRock("Rock");
		rockPaperScissors.setScissors("Scissors");
		return rockPaperScissors;
		
	}
}
