package algorithms;

public class leet_1108 {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.","[\\.]");
    }
}
