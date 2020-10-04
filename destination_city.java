// you are give the arrary paths where paths[i] = [cityA, cityB], meaning there is a disctinct
// path from cityA to cityB. Return the destinaation path

/*

Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
Output: "Sao Paulo" 
Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

*/ 

class Solution {
    public String destCity(List<List<String>> paths) {
        
        // use a hash map
        // a hash map is a key and value pair (k, v)
        Map<String, String> map = new HashMap();
        
        // loop through the length of paths
        for(int i = 0; i < paths.size(); i++) {
            
            // get the first and 2nd elements in each subset array
            // London, New York
            // New York, Lima
            // Lima, Sau Paulo
            map.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        
        // loop through the map values
        for(String k : map.values()) { // k reprensents the values in each hash map
            
            // if the map value doesn't contain the key, return the value
            // London, New York -> doesn't contain London -> return New York
            //  New York, Lima -> doesn't contain New York -> return Lima
            //  Lima, Sau Paulo -> doesn't contain Lima -> Return -> Sau Paulo
            if (!map.containsKey(k)) return k; // Returns true if this map doesn't contain       a mapping for the specified key
        }
        return "";
    }
}
