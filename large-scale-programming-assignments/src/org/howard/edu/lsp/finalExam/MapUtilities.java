package org.howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * The class implements a number of methods 
 * to solve the given problem.
 * 
 * @author Javid Mitchell
 *
 */


public class MapUtilities {
	/**
	 * This method finds the common key value pair of two HashMaps.
	 * @param map1
	 * @param map2
	 * @return - Return 0 if either or both maps passed in are empty.
	 * @throws NullMapException
	 */
        public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) throws NullMapException {
                int i=0;
                if(map1==null || map2==null)
                        throw new NullMapException("One of both maps are null!");
                for (Map.Entry<String, String> set :
                        map1.entrySet()) {
                        if(map2.containsKey(set.getKey()))
                        {
                        	if(set.getValue().equals(map2.get(set.getKey())))
                        		i++;
                        }
                }
                return i;
        }
}

