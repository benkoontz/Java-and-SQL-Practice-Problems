// given an ip address, defang the ip address
// example: address = 1.1.1.1 => 1[.]1[.]1[.]1

class Solution {
    public String defangIPaddr(String address) {
    
    // create a new string address to hold the new value
    // use the replace string function which will replace any occurance "."" with ""[.]"
    String newaddress = address.replace("." , "[.]");
        
    // return the new ip address
    return newaddress;
    }
}
