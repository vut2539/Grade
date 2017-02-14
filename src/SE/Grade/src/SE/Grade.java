package SE;

public class Grade {
	String grade;
	final String GRADE_A = "A";
	final String GRADE_B = "B";
	final String GRADE_C = "C";
	final String GRADE_D = "D";
	final String GRADE_E = "E";
	final String GRADE_F = "Invalid Grade";
	
	public String score(int score){
		if(score >= 80){
				grade = GRADE_A;
		}else
			if(score >=70){
				grade = GRADE_B;
		}else
			if(score >=60){
				grade = GRADE_C;
		}else
			if(score >=50){
				grade = GRADE_D;
		}else
			if(score >=0){
				grade = GRADE_E;
		}else{
				grade = GRADE_F;
		}
			return grade;
	}
}
