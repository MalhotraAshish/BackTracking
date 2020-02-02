package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_ALL_Subsets {
	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	 
    
    public static List<List<Integer>> subsets(int[] S) {
        int[] A = new int[S.length];
        Arrays.sort(S);
        backTrack(A,0,S.length,S);
        return res;
    }
     
    public static void processSolution(int[] A,int[] S){
        List<Integer> temp = new ArrayList<Integer>();
        for(int i=0; i<S.length; i++){
            if(A[i]==1){
                temp.add(S[i]);
            }
        }
        res.add(temp);
    }
     
    public static void backTrack(int[] A, int k, int n, int[] S){
        if(k==n){
            processSolution(A,S);
        }else{
            for(int i=0; i<=1; i++){
                A[k]=i;
                backTrack(A,k+1,n,S);
            }
        }
    }
    public static void main(String args[]) {
    	int []set = {1,2,3,4}; 
    	subsets(set);
    	for(int i = 0; i<res.size(); i++) {
    		System.out.println(res.get(i));
    	}
        //printPowerSet(set, 3); 
    }
}
