/**
 * 
 */
package testPrograms;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Divesh.Bhalla
 * Have the function SearchingChallenge(strArr) read in the strArr parameter containing key value pairs where the key is string and 
 * value is an integer. Your program should return a string with new key- value pair separated by a comma such that each key appears only once with 
 * the total values summed up.
 */
public class SearchingChallenge {

	/**
	 * Ex: strArr= ["B:-1","A:1","B:3","A:5"]
	 * return: A:6,B:2
	 * 
	 * Input: ["x:-1","y:1","x:-4","b:3","x:5"]
	 */



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr={"x:-1","y:1","x:-4","b:3","x:5"};


		String results= searchingChallenge(strArr);

	}

	private static String searchingChallenge(String[] strArr) {
		TreeMap<String, Integer> treeMap= new TreeMap<String, Integer>();
		Integer value;
		for (String string : strArr) {
			if(treeMap.containsKey(string.split(":")[0])) {
				value=Integer.parseInt(string.split(":")[1]);
				value=value+Integer.parseInt(string.split(":")[1]);
				treeMap.remove(string.split(":")[0]);
				treeMap.put(string.split(":")[0], value);
			}
			else
				treeMap.put(string.split(":")[0], Integer.parseInt(string.split(":")[1]));			
		}

		System.out.println(treeMap);
		for(Map.Entry<String, Integer> e: treeMap.entrySet()) {
			if(e.getValue()==0)
				treeMap.remove(e.getKey());		
		}
		
		System.out.println(treeMap);	

		return null;
	}

}
