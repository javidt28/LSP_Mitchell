package org.howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map;

public class MapUtilities {
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

