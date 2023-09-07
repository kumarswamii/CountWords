import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the paragraph:");
        Scanner sc=new Scanner(System.in);
        String us=sc.nextLine();
        us=us.trim();
        int count=0;
        if(us.length()==0) {
        	count=0;
        }
        else {
        	count++;
        	for(int i=0;i< us.length();i++) {
        		if(us.charAt(i)==' ' && us.charAt(i+1)!=' ') {
        			count++;
        		}
        	}
        }
        System.out.println("Word count:"+count);
	}

}
