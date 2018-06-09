import java.util.ArrayList;
import java.util.Collections;

public class KapreKars {
	public static ArrayList<Integer> get_digits(int num){
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<4;i++) {
			l.add((num/ ((int)(Math.pow(10, i))))%10);
		}
		return l;
	}
	public static int get_num(ArrayList<Integer> l) {
		int num=0;
		for(int i=0;i<4;i++) {
			num+= l.get(i)*((int)Math.pow(10, i));
		}
		return num;
	}
	public static int KaprekarsConstant(int num) {
		if(num==6174)
			return 0;
		else {
			ArrayList<Integer> digits=get_digits(num);
			Collections.sort(digits);
			ArrayList<Integer> rev=new ArrayList<Integer>();
			digits.forEach((x) -> rev.add(0,x));
			int sorted_num=get_num(digits);
			int rev_num=get_num(rev);
			int next_num;
			if(sorted_num>rev_num)
				next_num=sorted_num-rev_num;
			else
				next_num=rev_num-sorted_num;
			return 1+KaprekarsConstant(next_num);
		}
	}
	public static void main(String[] args) {


	}

}
