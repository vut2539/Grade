package SE;

public class Grade {
	String grade;
	final String a = "A";
	final String b = "B";
	final String c = "C";
	final String d = "D";
	final String e = "E";
	final String f = "Invalid Grade";
	
	public String score(int score){
		if(score >= 80){
				grade = a;
		}else
			if(score >=70){
				grade = b;
		}else
			if(score >=60){
				grade = c;
		}else
			if(score >=50){
				grade = d;
		}else
			if(score >=0){
				grade = e;
		}else{
				grade = f;
		}
			return grade;
	}
}
