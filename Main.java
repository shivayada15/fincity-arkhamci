import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int patients=scn.nextInt();
        int firstpsteps=scn.nextInt();
        int ans= findNoofStepsRequired(patients,firstpsteps);
        System.out.println(ans);
	}
	public static int findNoofStepsRequired(int patients,int firstpsteps){
	    return patients*firstpsteps;
	}
}
