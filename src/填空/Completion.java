package МоїХ;
//import org.apache.commons.lang3.ArrayUtils;

import МоїХ.Question1;
public class Completion extends Question1{//МоїХ
	   public String[] answers;
	   public Completion(){   
	   }
	   public Completion(String stem,String[] gaps,String[] answers){
		   super( stem, gaps);
		   this.answers=answers;
	   }
	public String[] getAnswer() {
		return answers;
	}
	public void setAnswer(String[] answers) {
		this.answers = answers;
	}
//  public boolean chack(String[] customerAnswer){
//	  boolean flag = true;
//	  if(customerAnswer.equals(answers)){
//		  flag = ArrayUtils.contains(customerAnswer, getAnswer());
//		  flag = true;
//	  }else{
//		  flag = false;
//	  }
//	  return flag;
//  }
}
