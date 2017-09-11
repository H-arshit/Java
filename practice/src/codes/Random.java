package codes;

import java.util.Collection;
import java.util.HashMap;
  
public class Random{
	public static void findPairsDifferenceK(int[] input, int k){
		
		HashMap<Integer,Integer> pairhash = new HashMap<>();
		for(int i=0;i<input.length;i++)
		{
		    int num = input[i]+k ;
		    if(pairhash.containsKey(num))
		    {
		        for(int j=0;j<pairhash.get(num);j++)
		        {
		             if(num > input[i]){ System.out.println(input[i]+ " " + num);} else{ System.out.println(num + " " + input[i]);}
		        }
		    }
		    
            num = input[i] - k;		    
		        if(k != 0 && pairhash.containsKey(num))
		    {
		        for(int j=0;j<pairhash.get(num);j++)
		        {
		             if(num > input[i]){ System.out.println(input[i]+ " " + num);} else{ System.out.println(num + " " + input[i]);}
		        }
		    }
		    
		  if(pairhash.containsKey(input[i]))
		  {
            pairhash.put(input[i],pairhash.get(input[i])+1);
		  }
		  else
		  {
		     pairhash.put(input[i],1);
		  }
		}
		
		
		
	}
	public static void main(String[] args) {
		int ar[]={4,4,4,4};
		findPairsDifferenceK(ar, 0);
	}
}
