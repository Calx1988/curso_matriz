package util;

public class Miscelaneous {
    public static String ordinalSymbol(int x){
        String number = Integer.toString(x);
        if(number.length()==1) {
            if (x == 1) {
                return "st";
            } else if (x == 2) {
                return "nd";
            } else if (x == 3) {
                return "rd";
            } else {
                return "th";
            }
        }else{
            if(number.charAt(number.length()-2)!='1'){
                if(number.charAt(number.length()-1)=='1'){
                    return "st";
                }else if(number.charAt(number.length()-1)=='2'){
                return "nd";
                }else if(number.charAt(number.length()-1)=='3') {
                    return "rd";
                }else{
                return "th";
                }
            }else{
                return "th";
            }
        }
    }
}
