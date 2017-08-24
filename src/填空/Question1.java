package МоїХ;

public class Question1 {
     protected String stem;
     protected String[] gaps;
     
     public Question1() {
    	 
     }
     public Question1(String stem, String[] gaps){
    	 super();
    	 this.stem = stem;
    	 this.gaps = gaps;
     }
	public String getStem() {
		return stem;
	}
	public void setStem(String stem) {
		this.stem = stem;
	}
	public String[] getGaps() {
		return gaps;
	}
	public void setGaps(String[] gaps) {
		this.gaps = gaps;
	}
	public boolean check(String[] CustomerAnswer){
		return false;
	}
}
